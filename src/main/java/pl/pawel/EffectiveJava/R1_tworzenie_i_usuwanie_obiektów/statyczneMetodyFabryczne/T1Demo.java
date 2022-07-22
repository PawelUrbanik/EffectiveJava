package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.statyczneMetodyFabryczne;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class T1Demo {

    enum days {
        PON, WT, ŚR, CZW, PIĄ, SOB, ND
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        Date date = Date.from(Instant.now());

        Set<days> daysSet = EnumSet.of(days.PON, days.WT, days.ŚR);

        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

        StackWalker luke = StackWalker.getInstance(StackWalker.Option.SHOW_HIDDEN_FRAMES);

        Date[] newArray = (Date[]) Array.newInstance(Date.class, 10);

        FileStore fileStore = Files.getFileStore(Path.of("./"));

        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("./.gitignore"));

        List<String> listOfSth = new ArrayList<>();
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        Enumeration<String> enumeration = vector.elements();
        listOfSth =Collections.list(enumeration);

        System.out.println("Date: " + date);
        System.out.println("-----------------");
        daysSet.forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println("BI prime:  " + prime);
        System.out.println("-----------------");
        luke.forEach(System.out::println);
        System.out.println("-----------------");
        Arrays.stream(newArray).forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(fileStore);
        System.out.println("-----------------");
        bufferedReader.lines().forEach(System.out::println);
        System.out.println("-----------------");
        listOfSth.stream().forEach(System.out::println);
    }
}
