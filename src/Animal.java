public class Animal {

    public void makeNoises(int n) {
        for (int i = 0; i < n; i++) {
            makeNoise();
        }
    }

    public void makeNoise() {
        System.out.println("Boing!");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeNoises(3);
    }

}
