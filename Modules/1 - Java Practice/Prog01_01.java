//Program 01_01
//Write a programm that calculates the area of a triangle 

//ask the user to enter x- and yx coordinated of the vertice of a 2D triangle and calculate the Area, using the Heron's formula to calculate he area of a triangle. Use a loop to repeat the calculations as long as the user wants to do it again.


//s = (a + b + c) / 2
//area = sqrt(s * (s - a) * (s - b) * (s - c))

import java.util.Scanner;

public class Prog01_01{
    public static void main(String[] args){//constructor
        new Prog01_01();
    }
    
    double distance (double px, double py, double qx, double qy) {
        return Math.sqrt(Math.pow(px - qx, 2) + Math.pow(py - qy, 2));
    }

    public Prog01_01(){
        Scanner in = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Enter the three vertices of a triangle");
            System.out.print("x1:");
            double x1 = in.nextDouble();
            System.out.print("y1:");
            double y1 = in.nextDouble();
            System.out.print("x2:");
            double x2 = in.nextDouble();
            System.out.print("y2:");
            double y2 = in.nextDouble();
            System.out.print("x3:");
            double x3 = in.nextDouble();
            System.out.print("y3:");
            double y3 = in.nextDouble();

            

            in.nextLine();

            double a  = distance(x1, y1, x2, y2);
            double b = distance(x2, y2, x3, y3);
            double c = distance(x1, y1, x3, y3);

            double s = (a + b + c) / 2; //formula of the semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of the triangle is " + area);

            System.out.println("Do you want to calculate another triangle? (Y/N)");
            answer = in.nextLine().toUpperCase().charAt(0);
        }while(answer == 'Y');

        in.close();

    }
}