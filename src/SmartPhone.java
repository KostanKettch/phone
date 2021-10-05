public class SmartPhone extends Phone {

    public SmartPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling though the Internet " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("You've got the Videocall..." + inputNumber);
    }
}
