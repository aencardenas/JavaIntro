package primerprograma;

import java.util.Scanner;

public class JavaIntro_01 {
    public static void main(String[] args) {

        boolean flag;
        double number;
        char Char;

        Scanner input = new Scanner(System.in);

        /*System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = input.nextInt();

        flag = input.nextBoolean();
        number = input.nextDouble();
        Char = input.next().charAt(0);

        System.out.println(flag);
        System.out.println(number);
        System.out.println(Char);
        */

        int firstNumber;
        int secondNumber;

        System.out.println("Type two integer numbers: ");

        firstNumber = input.nextInt();
        secondNumber = input.nextInt();

        if(firstNumber > 25 && secondNumber > 25){

            System.out.println("Both numbers are greater than 25");
        } else {
            System.out.println("One of the numbers is greater than 25");
        }


        // Ejercicio 7

        int tipoMotor;

        System.out.println("Ingresa el tipo de motor (1,2,3 o 4)");
        tipoMotor = input.nextInt();

        switch(tipoMotor){

            case 1:
                System.out.println("La bomba es bomba de agua");
                break;

            case 2:
                System.out.println("La bomba es bomba de gasolina");
                break;

            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;

            default:
                System.out.println(tipoMotor + " no es un valor valido para tipo de bomba");

        }

        int nota;

        System.out.println("Escribe una nota: ");
        nota = input.nextInt();

        while (nota < 0 || nota > 10){

            System.out.println("La nota es incorrecta, intentelo de nuevo");
            nota = input.nextInt();

        }

        System.out.println("Nota correcta");

    }
}
