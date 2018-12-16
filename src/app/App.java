package app;

public class App {

    public static void main(String[] args) {
        Person bob = new Person("Bob", 21, 176, 178.5);
        Person alice = new Person("Alice", 24, 123, 163.2);
        Person jane = new Person("Jane", 22, 145, 183.4);

        Gym gym = new Gym(2);

        bob.setAge(bob.getAge() + 1);

        System.out.println(bob.getName() + " is " + bob.getAge() + " years old.");
        System.out.println(bob.getName() + "'s' SIN  is " + bob.getSIN());
        System.out.println(alice.getName() + "'s' SIN  is " + alice.getSIN());
        System.out.println(jane.getName() + "'s' SIN  is " + jane.getSIN());

        bob.talk();
        alice.talk();
        jane.talk();

        System.out.println(bob.getName() + " weighs " + bob.getWeight() + "lbs");
        System.out.println(alice.getName() + " weighs " + alice.getWeight() + "lbs");
        System.out.println(jane.getName() + " weighs " + jane.getWeight() + "lbs");

        bob.eat();
        alice.sleep();
        jane.eat();

        System.out.println(bob.getName() + " weighs " + bob.getWeight() + "lbs");
        System.out.println(alice.getName() + " weighs " + alice.getWeight() + "lbs");
        System.out.println(jane.getName() + " weighs " + jane.getWeight() + "lbs");

        System.out.println(bob.getName() + " has $" + bob.getMoney());
        System.out.println(alice.getName() + " has $" + alice.getMoney());
        System.out.println(jane.getName() + " has $" + jane.getMoney());

        gym.enrollMember(bob);
        gym.enrollMember(alice);
        gym.enrollMember(jane);

        gym.chargeMembers();

        System.out.println(bob.getName() + " has $" + bob.getMoney());
        System.out.println(alice.getName() + " has $" + alice.getMoney());
        System.out.println(jane.getName() + " has $" + jane.getMoney());

    }
}