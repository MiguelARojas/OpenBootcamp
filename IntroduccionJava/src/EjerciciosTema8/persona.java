package EjerciciosTema8;

/*
    Se creara una clase persona con sus atributos privados de edad, nombre y telefono.
    Se creara sus setters y getters para extraer la informacion y asignar informacion
*/

public class persona {
    public static void main(String[] args) {

    }

    class Persona {
        // declaramos nuestras variables privadas
        private int age;
        private String name;
        private int phone;


        // declaramos nuestros setters
        public void setAge(int age){
            this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setPhone(int phone){
            this.phone = phone;
        }


        // declaramos nuestros getters
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