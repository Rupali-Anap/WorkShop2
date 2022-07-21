package review_2;
import java.util.Scanner;

public class ReverseNumber {

        public static void main(String[] args) {


            int number;
            int Reverse = 0;
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the Number :");
            number= num.nextInt();
            while(number != 0)
            {
                int remainder = number % 10;
                Reverse = Reverse * 10 + remainder;
                number = number/10;
            }
            System.out.println("The Reverse numbers is: " + Reverse);
        }

}