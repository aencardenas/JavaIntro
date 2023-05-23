package procedimientos;

import java.util.Scanner;

public class FunctionlessRetort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Escribe dos numeros: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();

        EsMultiplo(firstNumber,secondNumber);
    }

    public static void EsMultiplo(int firstNumber, int secondNumber){

        if(secondNumber % firstNumber == 0){
            System.out.println("El primer numero es multiplo del segundo");
        } else{
            System.out.println("El primer numero no es multiplo del segundo");
        }

    }
}
