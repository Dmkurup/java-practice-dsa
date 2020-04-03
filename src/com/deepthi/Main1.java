//package com.deepthi;
//
//import java.lang.reflect.Array;
//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        System.out.println("Hello Java");
//        int[] numbers = new int[5];
//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[2]=3;
//        int[]nums={6,1,2,3};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//
//        int[][] twod = {{1,2,3},{4,5,6}};
//        twod[0][0]=1;
//        System.out.println(Arrays.deepToString(twod));
//        //Implicit casting
//        short x =2;
//        int y=x;
//        System.out.println(y); //byte short int flaot double long
//       //Explicit casting
//        String x1 ="1.1";
//        float z=Float.parseFloat(x1)+2;
//        System.out.println(z);
//
//        int res=Math.round(1.1F);
//        System.out.println(res);
//
//        System.out.println(NumberFormat.getCurrencyInstance().format(12345678));
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Name:");
////        String result=scanner.nextLine().trim();
////        System.out.println("You are "+result);
//
//
//        //Project Mortgage
//        final int noOfMonths=12;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Principal Amount:");
//        int principalAmt = scanner.nextInt();
//
//        System.out.println("Annual Interest Rate:");
//        float annualInterestRate = scanner.nextFloat();
//        float monthlyInterestRate = annualInterestRate/noOfMonths/100;
//
//        System.out.println("Period in years:");
//        int months=scanner.nextInt()*noOfMonths;
//
//        double mortgage = principalAmt*((monthlyInterestRate*(Math.pow(1+monthlyInterestRate,months)))/Math.pow(1+monthlyInterestRate,months)-1);
//        System.out.println(mortgage);
//
//
//    }
//}
