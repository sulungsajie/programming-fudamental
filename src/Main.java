import java.util.Date;

import static java.time.Period.between;


public class Main {


    public static void main(String[] args) {
        //1
        int l = 5;
        int w = 3;
        System.out.println("Area: " + l * w);

        //2
        int r = 5;
        int c = 2;
        double pi = 3.14;
        System.out.println("Diameter: " + r * c);
        System.out.println("Circumference: " + c * pi * r);
        System.out.println("Area: " + pi * r * r);

        //3
        int a = 80;
        int b = 65;
        int triangle = 180;
        int cAngle = triangle - a - b;
        System.out.println("c: " + cAngle);

        //4
        var date1 = 2024 - 03 - 19;
        var date2 = 2024 - 03 - 21;
        var difference = date1 - date2;
        System.out.println("Difference: " + difference);


        //5
        String name = "John Doe";
        String firstLetter = name.substring(0,1);
        String secondLetter = name.substring(5,6);

        firstLetter = firstLetter.toUpperCase();
        secondLetter = secondLetter.toUpperCase();

        name = firstLetter + secondLetter;
        System.out.println("Name: " + name);

    }
}




