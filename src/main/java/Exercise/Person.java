package Exercise;

public class Person {

    private int age;
    private String name;
    private String adress;

    public Person(int age, String name, String adress) {
        this.age = age;
        this.name = name;
        this.adress = adress;
    }

    public int tele = 12345;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
