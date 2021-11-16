import java.util.Scanner;
class Integers{

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number");
    double first = input.nextDouble();

     System.out.println("Enter the second number");
    double sec = input.nextDouble();

    double quotient = first/sec;
    System.out.println("The result of quotient :" + quotient);

    double remender = first%sec;
    System.out.println("The result of remainder :" + remender);


    }
}

    //OUTPUT//

PS C:\Users\Admin\Desktop\masoud\EXERCISE> javac Integers.java
PS C:\Users\Admin\Desktop\masoud\EXERCISE> java Integers      
Enter the first number
20
Enter the second number
5
The result of quotient :4.0
The result of remainder :0.0