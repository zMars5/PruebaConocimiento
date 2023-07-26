package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreComprador;
        String apellidoComprador;
        String ciudadComprador;
        Integer cedulaComprador;
        Integer edadComprador;
        Integer boletasComprador;
        Integer precioBoletas = 45000;
        Integer costoTotal;

        System.out.println("BIENVENIDO A TUBOLETA");
        System.out.println("*********************");
        System.out.print("Ingrese su nombre: ");
        nombreComprador = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellidoComprador = scanner.nextLine();
        System.out.print("Ingrese su ciudad: ");
        ciudadComprador = scanner.nextLine();
        System.out.print("Ingrese su cedula: ");
        cedulaComprador = scanner.nextInt();
        System.out.print("Ingrese su edad: ");
        edadComprador = scanner.nextInt();
        System.out.print("Ingrese el numero de boletas a comprar: ");
        boletasComprador = scanner.nextInt();

        if (edadComprador >= 18) {
            System.out.println("Usted puede comprar la boleta");
        } else {
            System.out.println("Usted no puede comprar la boleta por ser menor de edad");
        }

        if (boletasComprador <= 4) {
            System.out.println("El numero de boletas que desea comprar es valido");
        } else {
            System.out.println("El numero de boletas que desea comprar no es valido");
        }

        costoTotal = (precioBoletas * boletasComprador);

        System.out.println(nombreComprador + " " + apellidoComprador + ", el total de su compra es de " + costoTotal);

    }
}