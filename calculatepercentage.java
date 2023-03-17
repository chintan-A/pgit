package com.company;
import java.util.Scanner;

public class calculatepercentage {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Science:");
        double marks= sc.nextDouble();

        System.out.println("Maths:");
        double marks1= sc.nextDouble();

        System.out.println("s.s");
        double marks2=  sc.nextDouble();

        System.out.println("English:");
        double marks3= sc.nextDouble();

        System.out.println("Enter obtain marks:");

        double sum= marks + marks1 + marks2 + marks3;
        System.out.println(sum);

        System.out.println("Enter the total marks:");
        double totalmarks= sc.nextDouble();

        double percentage = (sum/totalmarks)*100;

        System.out.println("Percentage obtain by student:"+percentage);
    }
}
