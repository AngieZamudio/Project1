public class Ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(27);
        persona.setNombre("Falso McPato");
        persona.setTelefono("44345564234234");

        int edad = persona.getEdad();
        String telefono = persona.getTelefono();
        String nombre = persona.getNombre();

        System.out.println("La persona se llama "+ nombre);
        System.out.println("Tiene "+ edad + " años");
        System.out.println("Su número de telefono es "+ telefono);

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
