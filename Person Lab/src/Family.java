import java.util.ArrayList;
import java.util.Objects;

public class Family {
    private static final int MAX_FAMILY_MEMBERS = 10;
    private int familyMembers;
    private ArrayList<Person> familyArray = new ArrayList<>();
    public Family() {
        familyMembers = 0;
    }
    public boolean addPerson(String name, int age) {

        Person name1;
        boolean addSuccess = true;

        name1 = new Person (name, age);
        if (familyArray.size() < 10) {
            familyArray.add(name1);
        }
        else {
            addSuccess = false;
        }

        return(addSuccess);
    }
    public int getNumberOfPeople() {
        int numMembers;
        numMembers = familyArray.size();
        return (numMembers);
    }
    public int getTotalAge() {
        int i = 0;
        int totalAge = 0;

        for (i = 0; i < familyArray.size(); i++) {
            totalAge += familyArray.get(i).getAge();
        }
        return(totalAge);
    }
    public void display() {
        int i = 0;

        for (i = 0; i < familyArray.size(); i++) {
            System.out.println(familyArray.get(i).toString());
        }
    }
    public void birthday(String name) {
        int i = 0;
        for (i = 0; i < familyArray.size(); i++) {
            if (Objects.equals(name, familyArray.get(i).getName())) {
                familyArray.get(i).incrementAge();
            }
        }

    }
}
