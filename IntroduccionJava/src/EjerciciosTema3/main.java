package EjerciciosTema3;

public class main {
    public static void main(String[] args) {
        int result = 0;

        result = suma(10, 15, 5);
        System.out.println("La suma de los numeros es: " + result);

        result = suma(1, 2, 3);
        System.out.println("La suma de los numeros es: " + result);
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}