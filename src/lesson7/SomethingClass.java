package lesson7;

import java.util.Scanner;

public class SomethingClass extends Object {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] abc = {1};
//        System.out.println(abc);
//        System.out.println("****************************");
//        String s0 = "Hello_Java!";
//        String s1 = "Hello";
//        s1 += "_Java!";
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_Java!";
//
//        System.out.println("s0 = > " + s0);
//        System.out.println("s1 = > " + s1);
//        System.out.println("s2 = > " + s2);
//        System.out.println("s3 = > " + s3);
//        System.out.println("****************************");
//        System.out.println("s0 == s1 > " + (s0 == s1));
//        System.out.println("s0 == s2 > " + (s0 == s2));
//        System.out.println("s0 == s3 > " + (s0 == s3));
//        System.out.println("=============================");
//        System.out.println("s0 == s1 > " + (s0.equals(s1)));
//        System.out.println("s0 == s2 > " + (s0.equals(s2)));
//        System.out.println("s0 == s3 > " + (s0.equals(s3)));

        String testString = "Test";
        StringBuilder testSB = new StringBuilder("Test");

        long startTime = System.nanoTime(); //Unix-time

        for (int i = 0; i < 70000; i++) {
            testString += i;
        }

        float deltaTime = System.nanoTime() - startTime;

        System.out.println(testString);
        System.out.println("Test testString = " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 70000; i++) {
            testSB.append(i);
        }

        deltaTime = System.nanoTime() - startTime;

        System.out.println(testSB.toString());
        System.out.println("Test testSB = " + deltaTime * 0.000001f + " millisec.");
        System.out.println(testString.equals(testSB.toString()));


    }



}
