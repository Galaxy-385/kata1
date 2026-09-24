package software.ulpgc;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("pepe", 20);

        System.out.println("Nombre: " + student1.getName());
        System.out.println("Edad: " + student1.getAge());
        System.out.println("es adulto: " + student1.isAdult());
    }
}
