package Seminar2Java;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class prog4 {

    private static Logger logger = Logger.getLogger(prog4.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("результат операции: "+result);
        // set log level to SEVERE, default level info
        //logger.setLevel(Level.SEVERE);

        // Log a info level msg
        logger.info("This is level info logging");
        logger.log(Level.WARNING, "This is level warning logging");
        logger.log(Level.SEVERE, "This is level severe logging");
        System.out.println("Hello Java Logging APIs.");
    }

    public static int nextInt(){
        System.out.println("введите число:");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("допущена ошибка при вводе операции, попробуйте еще раз!");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("допущена ошибка при вводе операции, попробуйте еще раз!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
            default:
                System.out.println("операция не распознана, повторите ввод!");
                result = calc(operand1, operand2, getOperation());
        }
        return result;
    }
}

