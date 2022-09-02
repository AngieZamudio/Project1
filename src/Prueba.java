public class Prueba {
    public static void main(String[] args){
        System.out.println(suma(4,7,9));
        Coche cochecito = new Coche();
        cochecito.agregarPuerta(2);
        System.out.println(cochecito.numPuertas);
    }
 public static int suma(int a, int b, int c){
        return a + b + c;
 }



}
class Coche{
    int numPuertas;
    public void agregarPuerta( int puertasAgregadas)
    {
        this.numPuertas += puertasAgregadas;
    }
}