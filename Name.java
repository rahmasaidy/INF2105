import java.util.Scanner;
class Name{

public static void main(String[] args){
     Scanner input = new Scanner(System.in);
       
        System.out.print(" Please Enter the first name :");
        String first = input.nextLine();
        System.out.print(" Please Enter the last name :");
        
        String last = input.nextLine();
        System.out.println("Welcome "+ first +" "+ last +"!");
    

}

}


       //OUTPUT//
   PS C:\Users\Admin\Desktop\masoud> cd EXERCISE
PS C:\Users\Admin\Desktop\masoud\EXERCISE> javac Name.java
PS C:\Users\Admin\Desktop\masoud\EXERCISE> java Name
 Please Enter the first name :Rahma
 Please Enter the last name :Said
Welcome Rahma Said! 
       