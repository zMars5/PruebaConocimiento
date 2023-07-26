package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreDeUsuario;
        String apellidoDeUsuario;
        Integer edadDeUsuario;
        Integer numeroUsosTarjeta;
        Integer comprasProductosAseo;
        Integer comprasProductosAlimenticios;
        Integer comprasOtrosProductos;
        Integer puntajeDeCredito;
        Integer totalDeuda;
        Double descuentoPuntaje1;
        Double descuentoPuntaje2;
        Double descuentoPuntaje3;
        Double descuentoPuntaje4;
        Double totalDescuento = 0.0;

        System.out.println("Bienvenido a Almacenes EXITO!");
        System.out.println("****************************");

        System.out.print("Ingrese su nombre: ");
        nombreDeUsuario = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellidoDeUsuario = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        edadDeUsuario = scanner.nextInt();
        System.out.print("Ingrese su puntaje de credito, ");
        System.out.print("Tenga en cuenta los puntajes son 1, 2, 3 y 4: ");
        puntajeDeCredito = scanner.nextInt();


        System.out.print("Ingrese el numero de veces que ha usado su tarjeta durante el ultimo mes: ");
        numeroUsosTarjeta = scanner.nextInt();
        System.out.print("Ingrese el monto en pesos de compras de productos de aseo comprados con la tarjeta: ");
        comprasProductosAseo = scanner.nextInt();
        System.out.print("Ingrese el monto en pesos de compras de productos alimenticios comprados con la tarjeta: ");
        comprasProductosAlimenticios = scanner.nextInt();
        System.out.print("Ingrese el monto de otros productos comprados con la tarjeta: ");
        comprasOtrosProductos = scanner.nextInt();

        totalDeuda = (comprasOtrosProductos + comprasProductosAlimenticios + comprasProductosAseo);
        descuentoPuntaje1 = (totalDeuda * 25.0) / 100;
        descuentoPuntaje2 = (totalDeuda * 20.0) / 100;
        descuentoPuntaje3 = (totalDeuda * 15.0) / 100;
        descuentoPuntaje4 = (totalDeuda * 10.0) / 100;

        System.out.print("El total de su deuda es de: $" + totalDeuda);

        if (puntajeDeCredito == 1) {
            totalDescuento = totalDeuda-descuentoPuntaje1;
            System.out.println(", Su descuento sera de 25%");
        } else if (puntajeDeCredito == 2) {
            totalDescuento = totalDeuda-descuentoPuntaje2;
            System.out.println(", Su descuento sera de 20%");
        } else if (puntajeDeCredito == 3) {
            totalDescuento = totalDeuda-descuentoPuntaje3;
            System.out.println(", Su descuento sera de 15%");
        } else if (puntajeDeCredito == 4){
            totalDescuento = totalDeuda-descuentoPuntaje4;
            System.out.println(", Su descuento sera de 10%");
        } else {
            System.out.println(", Por lo tanto, No recibe beneficio.");
        }

        //Factura deuda con descuento

        System.out.println("Senor " + nombreDeUsuario + " " + apellidoDeUsuario + ", edad: " + edadDeUsuario + ", usted ha usado su tarjeta un total de: " + numeroUsosTarjeta + " veces " + ", este es el total de su deuda a pagar con descuento teniendo en cuenta su puntaje de credito: " + totalDescuento);

    }
}