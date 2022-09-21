import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {
        
        int firstNumber, secondNumber, operator;
        
        Scanner scan = new Scanner (System.in);
        
        while (true) {
        
        System.out.println("Please select an operator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        
        operator = scan.nextInt();
        
        System.out.print("Enter your first numnber: ");
        firstNumber = scan.nextInt();
        System.out.print("Enter your second numnber: ");
        secondNumber = scan.nextInt();
        }

        switch (operator) {
            
            case 1 -> System.out.print(firstNumber + secondNumber);
            case 2 -> System.out.print(firstNumber - secondNumber);
            case 3 -> System.out.print(firstNumber / secondNumber);
            case 4 -> System.out.print(firstNumber * secondNumber);    
        }
        
        
       
    }
}
