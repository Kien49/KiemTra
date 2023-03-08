package Bai1;

import java.util.Scanner;

public class MainTestB1 {
    public static void main(String[] args) {
        double radius;
        System.out.print("Radius: ");
        Scanner in = new Scanner(System.in);

        try{
            radius = in.nextFloat();
            Circle c = new Circle(radius);
            System.out.println(c);
            System.out.printf("Dien Tich: %.1f", c.getArea());
            System.out.printf("\nChu vi: %.1f",c.getCircumference());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
