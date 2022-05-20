import java.util.Scanner;

public class PositiveNumbers {
    public static void main (String[] args){
        int num= postiveNum();
        System.out.println(isNumberPositive(num));
    }
    public static int postiveNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        return input.nextInt();
    }
    public static String isNumberPositive(int num){
        if (num == 0){
            return "Process finished with exit code 0";
        }
        if (num < 0) {
            return "Number must be a positive number";
        }
        return "Thanks for entering " + num;
    }
}



