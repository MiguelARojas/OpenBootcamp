package EjerciciosTema3;

public class carro {
    public static void main(String[] args) {
        // creamos un objeto de nuestra clase
        Carro carro = new Carro();
        // le sumamos tres puerta a nuestro carro
        carro.moreDoors();
        carro.moreDoors();
        carro.moreDoors();

        // nos debe imprimir el numero de puertas
        System.out.println("El numero de puertas que tiene el carro es: " + carro.doors);
    }

    // creamos nuestra clase carro
    static class  Carro {
        int doors = 0;

        public void moreDoors(){
            // incrementamos el numero de puertas
            this.doors++;
        }
    }
}
