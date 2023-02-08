package com.fundamentals.java;

import java.nio.file.PathMatcher;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email address : ");
        String emailAddress=sc.next();
        System.out.println(emailAddressValidator(emailAddress) ?"Valid Email Adress":"Invalid Email Address");
        sc.close();
    }
    public static boolean emailAddressValidator(String emailAddress){
        Pattern pattern=Pattern.compile("^[\\w.]+@\\w+\\.([\\w}\\D]{2,3}|[\\w\\D]{2,4}\\.[\\w\\D]{2})$");
        Matcher matcher=pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
