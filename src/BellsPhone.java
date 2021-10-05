public class BellsPhone extends Phone {
    public BellsPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Mr. Watson – Come here");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Mr. Watson – Come here");
    }
}