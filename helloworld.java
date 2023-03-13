public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Class HelloWorld");
        Animal.main(args);
        Animal myAnimal = new Animal();
        System.out.println(myAnimal.s);
    }
}