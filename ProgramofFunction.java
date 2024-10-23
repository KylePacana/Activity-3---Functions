/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programoffunction;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ProgramofFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Select an option:");
        System.out.println("Type 0 for Area of Circle");
        System.out.println("Type 1 for Area of Rectangle");
        System.out.println("Type 2 for Area of Triangle");
        System.out.println("Type 3 for Volume of Sphere");
        System.out.println("Type 4 for Volume of Cylinder");
        System.out.println("Type 5 for Calculating Third Side of Triangle (Law of Cosines)");
        System.out.println("Type 6 for Calculating Area of Circle Segment");
        System.out.println("Type 7 for Calculating Volume of Sphere");
        System.out.println("Type 8 for Calculating Surface Area of Sphere");
         System.out.println("What is the problem of your choice?");
        int choice = input.nextInt();
        
        switch (choice) {
            case 0:
                calculateAreaOfCircle(input);
                break;
            case 1:
                calculateAreaOfRectangle(input);
                break;
            case 2:
                calculateAreaOfTriangle(input);
                break;
            case 3:
                calculateVolumeOfSphere(input);
                break;
            case 4:
                calculateVolumeOfCylinder(input);
                break;
            case 5:
                calculateTriangleSide(input);
                break;
            case 6:
                calculateCircleSegmentArea(input);
                break;
            case 7:
                calculateSphereVolume(input);
                break;
            case 8:
                calculateSphereSurfaceArea(input);
                break;
            default:
                System.out.println("Invalid option");
        }
        
        input.close();
    }
    
    public static void calculateAreaOfCircle(Scanner input) {
        System.out.println("Input radius of the circle:");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius; 
        System.out.println("The area of the circle is: " + area);
    }

    public static void calculateAreaOfRectangle(Scanner input) {
        System.out.println("Input the length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("Input the width of the rectangle:");
        double width = input.nextDouble();
        double area = length * width; 
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void calculateAreaOfTriangle(Scanner input) {
        System.out.println("Input the base of the triangle:");
        double base = input.nextDouble();
        System.out.println("Input the height of the triangle:");
        double height = input.nextDouble();
        double area = 0.5 * base * height; 
        System.out.println("The area of the triangle is: " + area);
    }

    public static void calculateVolumeOfSphere(Scanner input) {
        System.out.println("Input the radius of the sphere:");
        double radius = input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * calculatePower(radius, 3); 
        System.out.println("The volume of the sphere is: " + volume);
    }

    public static void calculateVolumeOfCylinder(Scanner input) {
        System.out.println("Input the radius of the cylinder:");
        double radius = input.nextDouble();
        System.out.println("Input the height of the cylinder:");
        double height = input.nextDouble();
        double volume = Math.PI * calculatePower(radius, 2) * height; 
        System.out.println("The volume of the cylinder is: " + volume);
    }

    public static void calculateTriangleSide(Scanner input) {
        System.out.println("Input side a of the triangle:");
        double a = input.nextDouble();
        System.out.println("Input side b of the triangle:");
        double b = input.nextDouble();
        System.out.println("Input the angle between side a and side b in degrees:");
        double angleC = input.nextDouble();
        
        double angleCRadians = Math.toRadians(angleC);
        double c = Math.sqrt(calculatePower(a, 2) + calculatePower(b, 2) - 2 * a * b * Math.cos(angleCRadians));
        
        System.out.println("The third side of the triangle is: " + c);
    }
    
    public static void calculateCircleSegmentArea(Scanner input) {
        System.out.println("Input radius of the circle:");
        double radius = input.nextDouble();
        System.out.println("Input the central angle in degrees:");
        double theta = input.nextDouble();
        
        double thetaRadians = Math.toRadians(theta);
        double area = (calculatePower(radius, 2) / 2) * (thetaRadians - Math.sin(thetaRadians));
        
        System.out.println("The area of the circle segment is: " + area);
    }
    
    public static void calculateSphereVolume(Scanner input) {
        System.out.println("Input the radius of the sphere:");
        double radius = input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * calculatePower(radius, 3);
        System.out.println("The volume of the sphere is: " + volume);
    }
    
    public static void calculateSphereSurfaceArea(Scanner input) {
        System.out.println("Input the radius of the sphere:");
        double radius = input.nextDouble();
        double surfaceArea = 4 * Math.PI * calculatePower(radius, 2);
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }


    public static double calculatePower(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
}
}
