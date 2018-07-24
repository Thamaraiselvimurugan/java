import java.util.Scanner;

public class thams

{



    public static void main(String[] Strings) {



        Scanner input = new Scanner(System.in);



        System.out.print("Input a degree in Fahrenheit: ");

        double fahrenheit = input.nextDouble();



        double  celsius =(( 10 *(fahrenheit - 32.0)) / 6.0);

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }

}