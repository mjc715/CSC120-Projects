//===============================================================================
public class Person {
//------------------------------------------------------------------------------
    private String name;
    private int age;
//------------------------------------------------------------------------------
    public Person() {
        name = "";
        age = 0;
    }
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public void incrementAge() {
        age = age + 1;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        String displayString;
        displayString = name + " is " + age + " years old.";
        return(displayString);
    }
}
