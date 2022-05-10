package EjerciciosTema4;

/*
    En este programa veremos como funciona el do while
*/

public class Do_While {
    public static void main(String[] args) {
        int num = 0;

        do{

            System.out.println("El numero ahorita es " + num);
            // incrementamos nuestro numero
            num++;

            // el Do While se correra hasta mientras el num sea menor a 3
        }while (num < 3);
    }
}
