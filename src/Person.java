public class Person {
    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number=number;
    }

    public void callAnotherPerson(Person who, Phone phone) {
        phone.call(who.getNumber());
        who.callFromAnotherPerson(this ,phone);
    }

    public void callFromAnotherPerson(Person who,Phone phone) {
        phone.ring(who.getNumber());
    }

    public int getNumber() {
        return number;
    }
}

