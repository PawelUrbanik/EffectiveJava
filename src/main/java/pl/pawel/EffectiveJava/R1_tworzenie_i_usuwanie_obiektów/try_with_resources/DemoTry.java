package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.try_with_resources;

import java.io.*;

import static org.springframework.util.FileCopyUtils.BUFFER_SIZE;

public class DemoTry {


    public static void main(String[] args) throws IOException {

    }


    /**
     * Aproach with try-finally is not recommended
     */
    private class TryFinally {
        static String firstLineOfFile(String path) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            try {
                return bufferedReader.readLine();
            } finally {
                bufferedReader.close();
            }
        }

        /**
         * Try-fonally. Not Recommended way to use try construction
         *
         * @param src
         * @param dst
         * @throws IOException
         */
        static void copy(String src, String dst) throws IOException {
            InputStream inputStream = new FileInputStream(src);
            try {
                OutputStream outputStream = new FileOutputStream(dst);
                try {
                    byte[] buf = new byte[BUFFER_SIZE];
                    int n;
                    while ((n = inputStream.read(buf)) >= 0) {
                        outputStream.write(buf, 0, n);
                    }
                } finally {
                    outputStream.close();
                }
            } finally {
                inputStream.close();
            }
        }
    }

    /**
     * It is recommended to use try-with-resources approach.
     */
    private class TryWithRespuces {

        /**
         * Resource in try-with-resources must implement Autoclosable interface
         *
         * @param path
         * @return
         * @throws IOException
         */
        static String firstLineOfFile(String path) throws IOException {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));) {
                return bufferedReader.readLine();
            }
        }
    }

    /**
     * Code looks better. Programmer don't need to care to close resource in finally block.
     * Benefits for using this approach we can see when we use more than on resource.
     * @param src
     * @param dst
     * @throws IOException
     */
    static void copy(String src, String dst) throws IOException {
        try (InputStream inputStream = new FileInputStream(src);
             OutputStream outputStream = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = inputStream.read(buf)) >= 0) {
                outputStream.write(buf, 0, n);
            }
        }
    }
}
