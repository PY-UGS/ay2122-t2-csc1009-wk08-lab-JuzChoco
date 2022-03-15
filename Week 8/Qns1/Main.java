package Qns1;

import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");
        try {
            System.out.println("Please enter value of radius: ");
            double radius = sc.nextDouble();
            CircleWithException circle = new CircleWithException(radius); //Initialize the constructor with radius value
            double diameter = circle.getDiameter();
            double area = circle.getArea();

            if (radius < 0){ //If radius input is less than 0
                throw new IllegalArgumentException();
                
            }
            if (area > 1000){ //If the area of the circle exceeds 1000
                throw new Exception();
            }

            System.out.println("The diameter of the circle is " + diameter);

            System.out.println("The area of the circle is " + dF.format(area));
        } catch (IllegalArgumentException e) { //Method that has been passed on an illegal argument
            System.out.println("Error occured: The value of the radius must be a positive value");
        } catch (Exception e){
            System.out.println("Error occured: The value of the area is more than 1000\n");
        }

        sc.close();
    }
}
