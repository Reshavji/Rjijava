// Data types
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Some Data types are given below:-
// Integer
// Long
// float
// Double
// char
// Your task is to take input in the given format and print them in the same order.
// Input
// You don't have to worry about input, you just have to complete the function printDataTypes()
// Output
// Print each element in a new line in the same order as input.

// Note:- Print float round off to two decimal places and double to 4 decimal places.
// Example
// Sample Input:-
// 2
// 2312351235
// 1.21
// 543.1321
// c

// Sample Output:-
// 2
// 2312351235
// 1.21
// 543.1321
// c
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     Solution     >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
        long B = sc.nextLong();
        System.out.println(B);
        float C = sc.nextFloat();
        System.out.println(String.format("%.2f", C));
        double D = sc.nextDouble();
        System.out.println(String.format("%.4f", D));
        char E = sc.next().charAt(0);
        System.out.println(E);

}  }
