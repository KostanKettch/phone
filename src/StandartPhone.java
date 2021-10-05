public class StandartPhone extends Phone {

    public StandartPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling number " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Phone is ringing");
    }
}