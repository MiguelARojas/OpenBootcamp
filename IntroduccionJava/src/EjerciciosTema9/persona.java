package EjerciciosTema9;

public class persona {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
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
}
