public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;

        if (numeroIf > 0)
        {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {

            System.out.println("El numero es negativo");

        }
        else{
            System.out.println("El numero es 0");
        }


        int numeroWhile = 2;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;

        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "invierno";
        switch (estacion){
            case "verano":
                System.out.println("Estamos en "+ estacion);
                break;
            case "invierno":
                System.out.println("Estamos en "+ estacion);
                break;
            case "otoño":
                System.out.println("Estamos en "+ estacion);
                break;
            case "primavera":
                System.out.println("Estamos en "+ estacion);
                break;
            default:
                System.out.println("Ingrese una estacion valida");
        }
    }
}