package software.ulpgc;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Lola", 15);

        System.out.println("Edad: " + student1.getAge());
        System.out.println("Nombre: " + student1.getName());
        System.out.println("Es adulta: " + student1.isAdult());
    }
}