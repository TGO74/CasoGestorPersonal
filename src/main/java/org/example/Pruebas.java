package org.example;
import java.util.ArrayList;

public class Pruebas {

    public static void main(String[] args) {

        // crear gestor de personas
        GestorPersonal gestorPersonal = new GestorPersonal();

        //Prueba método agregarPersona()
            System.out.println("Prueba método agregarPersona(): ");
         Persona persona1 = new Persona("Tomás", "Gutiérrez", "12345678-9");
            Persona persona2 = new Persona("Maria", "Gonzalez", "98765432-1");
            Persona persona3 = new Persona("Pedro", "Gonzalez", "10857432-1");
            Persona persona4 = new Persona("Maria", "Olcay", "108765432-1");

            gestorPersonal.agregarPersona(persona1);
            gestorPersonal.agregarPersona(persona2);
            gestorPersonal.agregarPersona(persona3);
            gestorPersonal.agregarPersona(persona4);

            //Mostrar lista de personas agregadas
            System.out.println("lista de personas agregadas");
            gestorPersonal.imprimirListaPersonasAgregadas();

            System.out.println("");

        System.out.println("");

       //Prueba método agregarAutomovil()
        System.out.println("Prueba método agregarAutomovil(): ");
        Motor motor1 = new Motor("12345678", "1.6");
        Chasis chasis1 = new Chasis(12345678, "Acero");
        Automovil automovil1 = new Automovil("Chevrolet", "onix", 2010, 5000000.0, "100000", motor1, chasis1);
        gestorPersonal.agregarAutomovil("12345678-9", automovil1);

        Motor motor2 = new Motor("98765432", "1.6");
        Chasis chasis2 = new Chasis(98765432, "Acero");
        Automovil automovil2 = new Automovil("Toyota", "Yaris", 2010, 5000000.0, "100000", motor2, chasis2);
        gestorPersonal.agregarAutomovil("12345678-9", automovil2);

        Motor motor3 = new Motor("984534432", "1.6");
        Chasis chasis3 = new Chasis(987664632, "Acero");
        Automovil automovil3 = new Automovil("Toyota", "rav 4", 2013, 505464500.0, "132000", motor3, chasis3);
        gestorPersonal.agregarAutomovil("98765432-1", automovil3);

        Motor motor4 = new Motor("984534432", "1.6");
        Chasis chasis4 = new Chasis(987645632, "Acero");
        Automovil automovil4 = new Automovil("Chevrolet", "camaro", 2012, 505464500.0, "132000", motor4, chasis4);
        gestorPersonal.agregarAutomovil("108765432-1", automovil4);
        
        gestorPersonal.imprimirListaAutomoviles("12345678-9");

        System.out.println("");
        System.out.println("");

        
        //Prueba método agregarCorreoElectronico()
        System.out.println("Prueba método agregarCorreoElectronico(): ");
        CorreoElectronico correo1 = new CorreoElectronico("t.gutierrez04@ufromail.cl", "ufro");
        CorreoElectronico correo2 = new CorreoElectronico("t.ego5645645@gmail.com", "gmail");

        gestorPersonal.agregarCorreoElectronico("12345678-9", correo1);
        gestorPersonal.agregarCorreoElectronico("12345678-9", correo2);

        gestorPersonal.imprimirListaCorreos("12345678-9");

        System.out.println("");
        System.out.println("");

        //Prueba método obtenerPersonasPorMarcaAutomovil()
        System.out.println("Prueba método obtenerPersonasPorMarcaAutomovil(): ");
        gestorPersonal.imprimirListaPersonasConAutoMarca(gestorPersonal.obtenerPersonasPorMarcaAutomovil("Toyota"));


        System.out.println("");
        System.out.println("");

        //Prueba método obtenerPersonasPorNombre()
        System.out.println("Prueba método obtenerPersonasPorNombre(): ");

        gestorPersonal.imprimirListaPersonas(gestorPersonal.obtenerPersonasPorNombre("Maria"));
        gestorPersonal.imprimirListaPersonas(gestorPersonal.obtenerPersonasPorNombre("Pedro"));

        System.out.println("");
        System.out.println("");

        //Prueba método obtenerPersonaPorRut()
        System.out.println("Prueba método obtenerPersonaPorRut(): ");
        gestorPersonal.imprimirPersona(gestorPersonal.obtenerPersonaPorRut("12345678-9"));
        gestorPersonal.imprimirPersona(gestorPersonal.obtenerPersonaPorRut("98765432-1"));


    }







}
