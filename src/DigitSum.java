import java.util.LinkedList;
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Input a number. This number will be separated into digits. These digits will then be added together.");
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = num.nextInt();
        LinkedList<Integer> stack = new LinkedList<Integer>(); //Needed to display numbers in the correct order
        int sum = 0;
        System.out.println(input + " separated into digits: ");
        while(input > 0) {
            stack.push(input % 10); // Pushes the numbers to the list to be displayed
            sum = sum + input % 10; // Sum of the separated digits.
            input = input / 10; // Divide by 10 to repeat the loop.
        }
        for(Object o : stack){
            System.out.print(o + " ");
        }
        System.out.println("");
        System.out.print("The sum of these numbers is: " + sum);
        num.close();
    }
}
