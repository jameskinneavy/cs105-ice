package edu.sbcc.cs105;

/**
 * Hello world!
 */
public final class App {
     /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(final String[] args) {

        final Dog fido = new Dog();
        fido.bark(3);

        fido.setHasSpots(true);
        System.out.printf("Fido has spots = %b%n", fido.hasSpots());

        fido.setAge(7);
        int fidosAge = fido.getAge();
        System.out.println(fidosAge);



    }
}
