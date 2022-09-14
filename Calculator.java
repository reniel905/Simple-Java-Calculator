import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {
        
        int firstNumber, secondNumber, operator;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Please select an operator");
        System.out.print ("1. Add");
        System.out.print ("2. Subtract");
        System.out.print ("3. Divide");
        System.out.print ("4. Multiply");
        
        operator = scan.nextInt();
        
        System.out.print("Enter your first numnber: ");
        firstNumber = scan.nextInt();
        System.out.print("Enter your second numnber: ");
        secondNumber = scan.nextInt();
        
        switch (operator) {
            
            case 1 -> System.out.print(firstNumber + secondNumber);
            case 2 -> System.out.print(firstNumber - secondNumber);
            case 3 -> System.out.print(firstNumber / secondNumber);
            case 4 -> System.out.print(firstNumber * secondNumber);    
        }
        
        
       
    }
}
