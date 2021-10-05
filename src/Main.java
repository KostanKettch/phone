public class Main {
    public static void main(String[] args) {
        Phone firstPhone = new BellsPhone(1876);
        Phone phone = new StandartPhone(1984);
        Phone videoPhone=new SmartPhone(2018);
        Person person1 = new Person("mr.Bell",113355);
        Person person2 = new Person("mr.Watson",224466);
        person1.callAnotherPerson(person2, firstPhone);
        person1.callAnotherPerson(person2, phone);
        person1.callAnotherPerson(person2, videoPhone);

    }
}
