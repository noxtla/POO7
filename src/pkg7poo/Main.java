
package pkg7poo;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       
       Cliente clientes;
       
       String nombre,apellidos,DNI;
       int numeroDeCuenta;
       double saldo;
       
       
           System.out.print("\n Nombre");
           nombre = entrada.nextLine();
           System.out.print("\n Apellido");
           apellidos = entrada.nextLine();
           System.out.print("\n DNI");
           DNI = entrada.nextLine();
           System.out.print("\n Numero de cuentas");
           numeroDeCuenta = entrada.nextInt();
       
       
       Cuenta cuentas[];
       cuentas =  new Cuenta[numeroDeCuenta];
       
    }
    
}
