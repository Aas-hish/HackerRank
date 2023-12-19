import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String str) {
        super(str);
    }
}
public class Custom_exception {

    static void maleValidate(int age) throws InvalidAgeException{
        if (age<24){
            throw new InvalidAgeException("You are not ready for marriage!!!");
        }
        else {
            System.out.println("You are ready for marriage!!!");
        }
    }
    static void femaleValidate(int age) throws InvalidAgeException{
        if (age<20){
            throw new InvalidAgeException("You are not ready for marriage!!!");
        }
        else {
            System.out.println("You are ready for marriage!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Gender:");
        String gender=sc.nextLine();

        try{
            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")){
                System.out.print("Please enter your age:");
                int age=sc.nextInt();
                maleValidate(age);
            }
            else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
                System.out.print("Please enter your age:");
                int age=sc.nextInt();
                femaleValidate(age);
            }
            else {
                System.out.println("Wrong Input");
            }
        }
        catch (InvalidAgeException e) {
            System.out.print("Exception Occurred: ");
            System.out.println(e.getMessage());
        }

    }
}
