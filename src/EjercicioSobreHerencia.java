public class EjercicioSobreHerencia {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(27);
        cliente.setNombre("Falso McPato");
        cliente.setTelefono("44345564234234");
        cliente.setCredito(25000);

        cliente.mostrarDatos();

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(27);
        trabajador.setNombre("Asalariado Mil");
        trabajador.setTelefono("53483224554534");
        trabajador.setSalario(5000);

        trabajador.mostrarDatos();


    }



}
// Puede heredar porque la clase Persona está en la misma carpeta aunque en otro archivo
class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Crédito disponible: "+ credito + " euros");
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario:" + this.salario);
    }
}