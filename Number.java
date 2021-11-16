import java. util.Scanner;
class Number{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number :");
        int f = input.nextInt();
        System.out.println("please enter the second number :");
        int s = input.nextInt();
        int sum = f+s ;

        System.out.println("The sum of a+b "+ sum);

         int product = f*s ;

        System.out.println("The product of a*b "+ product);

         int difference = f-s ;

        System.out.println("The difference of a-b "+ difference);

         int quotient = f/s ;

        System.out.println("The quotient of a/b "+ quotient);


    }
}

    // OUTPUT//
PS C:\Users\Admin\Desktop\masoud\EXERCISE> javac Number.java
PS C:\Users\Admin\Desktop\masoud\EXERCISE> java Number      
please enter the first number :
4
please enter the second number :
10
The sum of a+b 14
The product of a*b 40
The difference of a-b -6
The quotient of a/b 0