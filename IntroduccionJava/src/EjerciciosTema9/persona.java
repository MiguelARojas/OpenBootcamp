package EjerciciosTema9;

public class persona {
    public static void main(String[] args) {

        // Creacion de mis objetos
        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        // asignamos la informacion a nuestro objeto persona
        persona.setName("Miguel");
        persona.setAge(23);
        persona.setPhone(333391968);

        // asignamos la informacion a nuestro objeto cliente
        cliente.setName("Valente");
        cliente.setAge(22);
        cliente.setPhone(333391967);
        cliente.setCredito(1300);

        // asignamos la informacion a nuestro objeto trabajador
        trabajador.setName("Victor");
        trabajador.setAge(21);
        trabajador.setPhone(333391966);
        trabajador.setSalario(1500);


        // imprimimos la informacion con nuestros getters
        System.out.println("\nLa informacion de nuestro objeto Persona");
        System.out.println(persona.getName());
        System.out.println(persona.getAge());
        System.out.println(persona.getPhone());
        System.out.println("\n");

        System.out.println("La informacion de nuestro objeto Cliente");
        System.out.println(cliente.getName());
        System.out.println(cliente.getAge());
        System.out.println(cliente.getPhone());
        System.out.println(cliente.getCredito());
        System.out.println("\n");

        System.out.println("La informacion de nuestro objeto Trabajador");
        System.out.println(trabajador.getName());
        System.out.println(trabajador.getAge());
        System.out.println(trabajador.getPhone());
        System.out.println(trabajador.getSalario());
    }

    // creacion de nuestra clase persona
    static class Persona {

        // declaracion de nuestras varibles privadas
        private int age;
        private String name;
        private int phone;


        // declaracion de nuestros setters
        public void setAge(int age){
            this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setPhone(int phone){
            this.phone = phone;
        }


        // declaracion de nuestros getters
        public int getAge(){
            return this.age;
        }

        public String getName(){
            return this.name;
        }

        public int getPhone(){
            return this.phone;
        }
    }


    static class Cliente extends Persona{
        // creamos nuestra variable credito
        private int credito;

        // crearemos el set y el get de la variable credito
        public void setCredito(int credito){
            this.credito = credito;
        }

        public int getCredito(){
            return this.credito = credito;
        }
    }

    static class Trabajador extends Persona {
        // creamos nuestra variable salario
        private int salario;

        // crearemos el set y get
        public void setSalario(int salario){
            this.salario = salario;
        }

        public int getSalario(){
            return this.salario;
        }

    }


}
