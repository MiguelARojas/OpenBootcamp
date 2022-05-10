package EjerciciosTema4;

/*
    En este programa se vera la sentencia switch con las estaciones
*/

public class Switch {
    public static void main(String[] args) {
        String estacion = "INVIERNO";
        
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Te encuentras en la estacion de Primavera");
                break;

            case "VERANO":
                System.out.println("Te encuentras en la estación de Verano");
                break;

            case "OTOÑO":
                System.out.println("Te encuentras en la estacion de Otoño");
                break;

            case "INVIERNO":
                System.out.println("Te encuentras en la estacion de Invierno");
                break;
            default:
                System.out.println("ERROR -> La variable no es una estacion del año");
        }
    }
}
