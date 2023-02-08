package com.fundamentals.java;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Demo implements Serializable {
    int id;
    String name;
    Demo(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class DirectoryScannerRunner {
    public static void main(String[] args) throws IOException {
//        List directory contents
        Files.list(Paths.get(".")).forEach(f->System.out.println(f));
//        Recursive way to list directory contents
        Predicate<? super Path> predicate=p->String.valueOf(p).contains(".java");
        Stream<Path> dirContents = Files.walk(Paths.get("."), 4);
        dirContents.filter(predicate).forEach(System.out::println);
        Path path = Paths.get("./Test.txt");
        if(Files.exists(path)) {
            Files.writeString(path, "I want good job in company like TCS.", StandardOpenOption.APPEND);
        }
        else{
            Files.writeString(path, "I want a good job.");
        }
        String cv=Files.readString(path);
        System.out.println(cv);
        Files.lines(path).map(s->s.toUpperCase()).forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> javaMatcher=(p,attr)->String.valueOf(p).contains(".java");
        BiPredicate<Path, BasicFileAttributes> directoryMatcher=(p,attr)->attr.isDirectory();
        Files.find(Paths.get("."),4,javaMatcher).forEach(System.out::println);
    }
}
