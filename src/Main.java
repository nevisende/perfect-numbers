import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number:  ");
        int number = input.nextInt();

        int total = 0;
        for (int i = number -1; i > 0 ; i--) {
            if(number % i == 0){
                total += i;
            }
        }

        if(total == number) System.out.println(number + " is a perfect number.");
        else System.out.println(number + " is not a perfect number.");
    }
}