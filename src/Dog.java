public class Dog extends Animal {

    public void makeNoise() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        Animal fido = new Dog();
        fido.makeNoises(3);
    }

}
