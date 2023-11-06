package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorPersonal {

    private ArrayList<Persona> personas;

    // Constructor
    public GestorPersonal() {
        personas = new ArrayList<>();
    }

    //getters y setters
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    //Métodos

    // Agrega una persona a la lista de personas
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // Agrega un automóvil a la persona con el rut indicado
    public void agregarAutomovil(String rut, Automovil automovil) {
        // Encuentra a la persona en la lista de personas
        Persona personaEncontrada = buscarPersonaPorRut(rut);

        // Agrega el automóvil a la persona si la persona existe
        if (personaEncontrada != null) {
            personaEncontrada.agregarAutomovil(automovil);
        }
    }


    // Agrega un correo electrónico a la persona con el rut indicado
    public void agregarCorreoElectronico(String rut, CorreoElectronico correo) {
        // Encuentra a la persona en la lista de personas
        Persona personaEncontrada = buscarPersonaPorRut(rut);

        // Agrega el correo electrónico a la persona si la persona existe
        if (personaEncontrada != null) {
            personaEncontrada.agregarCorreo(correo);
        }
    }

    // Obtiene una lista de personas que tienen un automóvil de la marca indicada
    public ArrayList<Persona> obtenerPersonasPorMarcaAutomovil(String marca) {
        ArrayList<Persona> personasConAutomovilMarca = new ArrayList<>();

        System.out.println("Personas con Automóvil de Marca " + marca + ":");

        for (Persona persona : personas) {
            if (persona.tieneAutomovilMarca(marca)) {
                personasConAutomovilMarca.add(persona);
            }
        }

        return personasConAutomovilMarca;
    }

    // Obtiene una lista de personas que tienen un nombre indicado
    public ArrayList<Persona> obtenerPersonasPorNombre(String nombre) {
        ArrayList<Persona> personasConNombre = new ArrayList<>();

        System.out.println("Personas con Nombre " + nombre + ":");

        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                personasConNombre.add(persona);
            }
        }

        return personasConNombre;
    }

    // Obtiene una persona por su rut
    public Persona obtenerPersonaPorRut(String rut) {
        return buscarPersonaPorRut(rut);
    }

    // Busca una persona por su rut
    private Persona buscarPersonaPorRut(String rut) {

        if (!(personas == null) && !(personas.isEmpty())) {
            for (Persona persona : personas) {
                if (persona.getRut().equals(rut)) {
                    return persona;
                }
            }
        }

        System.out.println("No existe la persona con rut " + rut + " en el sistema");
        return null;
    }


    // Imprime la lista de personas en el sistema
    public void imprimirListaPersonasAgregadas() {

        System.out.println("Personas en el sistema:");
        for (Persona persona : personas) {
            System.out.println(persona.getRut() + " - " + persona.getNombre() + " " + persona.getApellido());
        }

    }

    // Imprime lista de personas con parametro un ArrayList<Persona> paraa buscar si tienen autos de la marca indicada
    public void imprimirListaPersonasConAutoMarca(ArrayList<Persona> personas) {

        for (Persona persona : personas) {
            System.out.println(persona.getRut() + " - " + persona.getNombre() + " " + persona.getApellido());
            imprimirListaAutomoviles(persona.getRut());


        }

    }


    // Imprime la lista de automóviles para un rut indicado
    public void imprimirListaAutomoviles(String rut) {

        Persona personaEncontrada = buscarPersonaPorRut(rut);

        if (personaEncontrada != null) {
            System.out.println("Automoviles de la persona " + personaEncontrada.getNombre() + " " + personaEncontrada.getApellido() + ":");
            for (Automovil automovil : personaEncontrada.getAutomoviles()) {
                System.out.println(automovil.getMarca() + " - " + automovil.getModelo() + " " + automovil.getAño());
            }
        }



    }

    // Imprime la lista de correos para un rut indicado
    public void imprimirListaCorreos(String rut) {

        Persona personaEncontrada = buscarPersonaPorRut(rut);

        if (personaEncontrada != null) {
            System.out.println("Correos de la persona " + personaEncontrada.getNombre() + " " + personaEncontrada.getApellido() + ":");
            for (CorreoElectronico correo : personaEncontrada.getCorreos()) {
                System.out.println(correo.getDireccionCorreoElectronico() + " - " + correo.getProveedorCorreoElectronico());
            }
        }
    }

//Imprime lista de persoans cualquiera con parametro un arraylist<persona>

    public void imprimirListaPersonas(ArrayList<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getRut() + " - " + persona.getNombre() + " " + persona.getApellido());
            // Aquí también puedes imprimir otros atributos de la persona si lo deseas.
        }


    }

    //Método para imprimir una persona

    public void imprimirPersona(Persona persona) {
        System.out.println(persona.getRut() + " - " + persona.getNombre() + " " + persona.getApellido());
    }
}

