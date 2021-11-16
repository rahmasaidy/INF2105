import java.util.Scanner;
class User{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        System.out.print(" Please Enter the first name :");
        String first = input.nextLine();
        System.out.print(" Please Enter the last name :");
        
        String last = input.nextLine();
        System.out.print(" Please Enter your age :");
        int age = input.nextInt();
        System.out.println("Welcome "+ first +" "+ last +"! You are "+ age+" " +" second year old !");
    }


}

     // OUTPUT //
PS C:\Users\Admin\Desktop\masoud\EXERCISE> javac User.java
PS C:\Users\Admin\Desktop\masoud\EXERCISE> java User      
 Please Enter the first name :Rahma
 Please Enter the last name :Said
 Please Enter your age :21
Welcome Rahma Said! You are 21  second year old !