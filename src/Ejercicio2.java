public class Ejercicio2 {

    public static void main(String[] args) {
        //uso de un if en una función
        positivoOnegativo(4);
        bucleWhile(1);
        bucleDoWhile(3);
        ejercicioSwitch("invierno");
    }

    public static void positivoOnegativo(int numeroIf)
    {
        if(numeroIf > 0)
            System.out.println(numeroIf + " es positivo");
        else if (numeroIf < 0)
            System.out.println(numeroIf + " es negativo");
        else
            System.out.println(numeroIf + " es igual a cero");

    }

    public static void bucleWhile( int numeroWhile) {
        while (numeroWhile < 3){
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }
    }
    public static void bucleDoWhile(int numeroWhile) {
        do{
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);
    }
    public static void ejercicioSwitch(String estacion){
        switch (estacion){
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println(estacion + " no es una estación del año");

        }

    }
}
