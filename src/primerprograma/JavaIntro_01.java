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
    /*
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

        //Ejercicio 8
        while (nota < 0 || nota > 10){

            System.out.println("La nota es incorrecta, intentelo de nuevo");
            nota = input.nextInt();

        }

        System.out.println("Nota correcta");
    */


        //Ejercicio 9

        boolean logic = true;
        int suma = 0;
        int numero = 0;
        int cont = 0;

        /*do {
            System.out.println("Escribe un numero: ");
            numero = input.nextInt();

            if (numero<0){


            }else if (numero == 0){
                System.out.println("Se capturo el numero 0");
                break;
            }else{
                suma = suma + numero;
            }

            cont++;

            if (cont == 20){
                logic = false;
            }

        } while(logic);

        System.out.println("La suma de los numeros es: " + suma);*/

        /*int x = 0;
        int counter = 4;


        System.out.println("Escriba 4 numeros: ");
        while(counter > 0){

            x = input.nextInt();

            System.out.print(x + " ");
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println("\n");

            counter--;


       }*/

       /* String frase;
        String newPhrase;

        System.out.println("Escriba una frase: ");
        frase = input.nextLine();

        newPhrase = encriptar(frase);

        System.out.println(newPhrase);*/

        String[] equipo = new String[5];

        System.out.println("Escribe el nombre de los 5 integrantes");
        for (int i = 0; i <= 4; i++) {
            equipo[i] = input.nextLine();

        }

        for (int x = 0; x <=  4 ; x++) {
            System.out.println(equipo[x]);
        }


    }

   /* public static String encriptar(String frase){
        char word;
        String fraseNueva = "";

        for (int i = 0; i < frase.length(); i++) {

            word = frase.charAt(i);
            switch (word){

                case 'A', 'a':
                    fraseNueva = fraseNueva.concat("@");
                    break;

                case 'E', 'e':
                    fraseNueva = fraseNueva.concat("#");
                    break;

                case 'I', 'i':
                    fraseNueva = fraseNueva.concat("$");
                    break;

                case 'O','o':
                    fraseNueva = fraseNueva.concat("%");
                    break;



                case 'U','u':
                    fraseNueva = fraseNueva.concat("*");
                    break;

                default:
                    fraseNueva = fraseNueva.concat(Character.toString(word));


            }

        }

        return fraseNueva;
    }*/





}


