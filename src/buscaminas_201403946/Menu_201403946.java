
package buscaminas_201403946;

import java.util.Scanner;

/**
 *
 * @author victorabdiel
 */
public class Menu_201403946 {
    public String entrada = "";
    
    public Menu_201403946(){
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("___________________________________________________");
            System.out.println("            Victor Abdiel Lux Juracan");
            System.out.println("                201403946        ");
            System.out.println("                IPC1 A Practica 1    ");
            System.out.println("                Buscaminas       ");
            entrada = leer.nextLine();
            System.out.println("          Presione enter para continuar");
        } while (!entrada.equals(""));
        menuPrinc();
    }
    public static void menuPrinc(){
        int opc;
        Scanner leer = new Scanner(System.in);
 
        System.out.println("___________________________________________________");
        System.out.println("                    BUSCAMINAS!!!                  ");
        System.out.println("                    1. Principiante");
        System.out.println("                    2. Intermedio");
        System.out.println("                    3. Experto");
        System.out.println("                    4. Salir");
        System.out.println("Ingrese Opcion ");
        
        opc = leer.nextInt();
        System.out.println("___________________________________________________");
        switch(opc){
            case 1:
                menuGame();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("El numero de Opcion no existe!! ");
                break;
        }
    }
    public  static void menuGame() {
        String opc2 ="";
        Scanner leer = new Scanner(System.in);
        System.out.println("                ----------------");
        System.out.println("                  Voltear: V");
        System.out.println("                 Reiniciar: R");
        System.out.println("                  Salir: S");
        System.out.println("                Ingrese Opcion");
        opc2 = leer.nextLine();
        switch(opc2){
            case "V":
                break;
            case "R":
                break;
            case "S":
                menuPrinc();
                break;
            default:
                System.out.println("La opcion ingresada no existe");
                break;
        }
    }
}


