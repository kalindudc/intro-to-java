package app;

public class Person {

    // single line comment
    /*
    * multi line comment
    */
    private static int nextID = 0;

    private String name;
    private int age;
    private double weight;
    private double height;
    private long SIN;
    private double money;

    /**
     * This is a java documentation comment
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param weight the weight of this person
     * @param height the height of this person
     */
    public Person(String name, int age, double weight, double height) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setHeight(height);
        this.money = 10000;

        this.setSIN(nextID);
        Person.nextID++;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    public void chargeFee(double fee) {
        this.money -= fee;
    }

    /**
     * @return the sIN
     */
    public long getSIN() {
        return SIN;
    }

    /**
     * @param sIN the sIN to set
     */
    public void setSIN(long sIN) {
        this.SIN = sIN;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("Hello! My name is " + this.name);
    }

    public void eat() {
        this.weight++;
    }

    public void sleep() {
        this.weight--;
    }
}