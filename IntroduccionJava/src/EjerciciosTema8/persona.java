package EjerciciosTema8;

/*
    Se creara una clase persona con sus atributos privados de edad, nombre y telefono.
    Se creara sus setters y getters para extraer la informacion y asignar informacion
*/

public class persona {
    public static void main(String[] args) {
        // creamos un objeto de nuestra clase persona
        Persona persona = new Persona();

        // hacemos uso de nuestros setters
        persona.setAge(22);
        persona.setName("Miguel");
        persona.setPhone(333391968);

        // hacemos uso de nuestros getters
        System.out.println(persona.getAge());
        System.out.println(persona.getName());
        System.out.println(persona.getPhone());

    }

    static class Persona {
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