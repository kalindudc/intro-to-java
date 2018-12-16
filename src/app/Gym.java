package app;

public class Gym {

    private static final double FEE = 35.0;

    private Person[] members;
    private int totalMembers;

    public Gym(int numberOfPeople) {

        this.members = new Person[numberOfPeople];
        this.totalMembers = 0;
    }

    public void enrollMember(Person person) {

        if (totalMembers < members.length) {
            this.members[totalMembers] = person;
            totalMembers++;
        }
        else {
            System.out.println("This gym is full!");
        }
    }

    public void chargeMembers() {
        for (int i = 0; i < totalMembers; i++) {
            this.members[i].chargeFee(FEE);
        }
    }

    public int getTotalMembers() {
        return totalMembers;
    }
}