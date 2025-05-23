import java.util.Scanner;
import java.util.Random;

public class Archaga_Aaron_Exam1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcion;
         do{
            System.out.println("==== MENU ===="+
                        "\n1. Piramide"+
                        "\n2. Clave"+
                        "\n3. Piedra Papel o Tijera"+
                        "\n4. Adivinar"+
                        "\n5. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("====Piramide====");


                    break;
                case 2:
                    System.out.println("====Clave====");


                    break;
                case 3:
                    int opcionusuario, respuesta;
                    int opcioncomputadora = new Random().nextInt(3);
                    String salidausuario = "", salidacomputadora = "";
                    System.out.println("====Piedra Papel o Tijera====");
                    System.out.println("Bienvenido al juego");
                    
                    do {

                        System.out.println("1. Piedra"+
                                        "\n2. Papel"+
                                        "\n3. Tijera"+
                                        "\n===============");
                        System.out.print("Escribe el numero de la opcion que eligas: ");
                        opcionusuario = entrada.nextInt();

                        switch(opcionusuario){
                            case 1:
                            salidausuario = "Piedra";
                            break;
                            case 2:
                            salidausuario = "Papel";
                            break;
                            case 3:
                            salidausuario = "Tijera";
                            break;
                        }

                        switch (opcioncomputadora) {
                            case 1:
                                salidacomputadora = "Piedra";
                                break;
                            case 2:
                                salidacomputadora = "Papel";
                                break;
                            case 3:
                                salidacomputadora = "Tijera";
                                break;
                        }
                        
                        do {
                            
                            System.out.println("==== El juego empezo ====");
                            System.out.println("Opcion elegida: "+ salidausuario);
                            System.out.println("Opcion de la computadora: "+ salidacomputadora);
                            
                            if (opcionusuario == opcioncomputadora) {
                            System.out.println("Empate, no hay ganador");
                            }
                            else if (opcionusuario == 1 && opcioncomputadora == 2) {
                            System.out.println("Perdiste, gano la computadora");
                            }
                            else if (opcionusuario == 1 && opcioncomputadora == 3) {
                            System.out.println("Ganaste, gano el usuario");
                            }
                            
                        } while (opcion!= 3);
                        System.out.println("Desea volver a jugar? 1.SI o 2.NO seleccione un numero");
                        respuesta = entrada.nextInt();

                    } while (respuesta == 1);

                    break;

                case 4:
                    System.out.println("====Adivinar====");
                    int numrrandom = new Random().nextInt(100);
                    int numusuario, intentos = 10;

                    for (int i = 0; i < intentos; i++) {
                        System.out.println("Intento # "+ (i+1));
                        System.out.print("Ingrese su numero del 1-100: ");
                        numusuario = entrada.nextInt();

                        if (numusuario > numrrandom) {
                            System.out.println("El numero es menor");
                        }
                        else if (numusuario < numrrandom) {
                            System.out.println("El numero es mayor");
                        }
                        else if (numusuario == numrrandom){
                            System.out.println("Adivinaste el numero en el intento #"+(i+1));
                            break;
                        }
                        System.out.println("Se han acabado los intentos");
                    } break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
         } while(opcion != 5);
    }
}
