package org.example;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorPersonal gestor = new GestorPersonal();
        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Menú de Opciones:");
                System.out.println("1. Agregar Persona");
                System.out.println("2. Agregar Automóvil a Persona");
                System.out.println("3. Agregar Correo Electrónico a Persona");
                System.out.println("4. Obtener Personas por Marca de Automóvil");
                System.out.println("5. Obtener Personas por Nombre");
                System.out.println("6. Obtener Persona por Rut");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea en blanco

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el Rut de la Persona: ");
                        String rut = scanner.nextLine();
                        System.out.print("Ingrese el Nombre de la Persona: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el Apellido de la Persona: ");
                        String apellido = scanner.nextLine();

                        Persona persona = new Persona(rut, nombre, apellido);
                        gestor.agregarPersona(persona);
                        break;
                    case 2:
                        System.out.print("Ingrese el Rut de la Persona: ");
                        rut = scanner.nextLine();
                        System.out.print("Ingrese la Marca del Automóvil: ");
                        String marca = scanner.nextLine();
                        System.out.print("Ingrese el Modelo del Automóvil: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Ingrese el Año de Fabricación del Automóvil: ");
                        int año = scanner.nextInt();
                        System.out.print("Ingrese el Precio del Automóvil: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese el Kilometraje del Automóvil: ");
                        String kilometraje = scanner.nextLine();
                        System.out.println("Ingrese el número de Motor del Automóvil: ");
                        String numeroDeMotor = scanner.nextLine();
                        System.out.println("Ingrese cilindrada del motor: ");
                        String cilindrada = scanner.nextLine();
                        System.out.println("Ingrese número de chasis: ");
                        int numeroChasis = scanner.nextInt();
                        System.out.println("Ingrese el material del chasis: ");
                        String materialChasis = scanner.nextLine();


                        Motor motor = new Motor(numeroDeMotor, cilindrada);


                        Chasis chasis = new Chasis(numeroChasis, materialChasis);

                        Automovil automovil = new Automovil(marca, modelo, año, precio, kilometraje, motor, chasis);
                        gestor.agregarAutomovil(rut, automovil);
                        break;
                    case 3:
                        System.out.print("Ingrese el Rut de la Persona: ");
                        rut = scanner.nextLine();
                        System.out.print("Ingrese la Dirección de Correo Electrónico: ");
                        String direccion = scanner.nextLine();
                        System.out.print("Ingrese el Proveedor de Correo Electrónico: ");
                        String proveedor = scanner.nextLine();



                        CorreoElectronico nuevoCorreo = new CorreoElectronico(direccion, proveedor);
                        gestor.agregarCorreoElectronico(rut, nuevoCorreo);
                        break;
                    case 4:
                        System.out.print("Ingrese la Marca de Automóvil: ");
                        marca = scanner.nextLine();
                        System.out.println("Personas con Automóvil de Marca " + marca + ":");
                        for (Persona persona4 : gestor.obtenerPersonasPorMarcaAutomovil(marca)) {
                            System.out.println(persona4.getRut() + " - " + persona4.getNombre() + " " + persona4.getApellido());
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el Nombre de la Persona: ");
                        nombre = scanner.nextLine();
                        System.out.println("Personas con Nombre " + nombre + ":");
                        for (Persona persona5 : gestor.obtenerPersonasPorNombre(nombre)) {
                            System.out.println(persona5.getRut() + " - " + persona5.getNombre() + " " + persona5.getApellido());
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese el Rut de la Persona: ");
                        rut = scanner.nextLine();
                        Persona persona6 = gestor.obtenerPersonaPorRut(rut);
                        if (persona6 != null) {
                            System.out.println("Persona encontrada:");
                            System.out.println("Rut: " + persona6.getRut());
                            System.out.println("Nombre: " + persona6.getNombre() + " " + persona6.getApellido());
                        } else {
                            System.out.println("No se encontró a la persona con rut " + rut);
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }



        }


    }

