package example7;

import java.text.CollationKey;
import java.text.Collator;

class Person implements Comparable {

    private String firstName;
    private String lastName;
    private int age;
    private Collator locCollator = Collator.getInstance();
    private CollationKey[] keys = new CollationKey[2];

    public Person(String fName, String lName, int age) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        keys[0] = locCollator.getCollationKey(lastName + firstName);
        keys[1] = locCollator.getCollationKey(firstName + lastName);
    }

    public CollationKey[] getKeys() {
        return keys;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if (this.age < ((Person)o).age) {
            return -1;
        } else if (this.age > ((Person)o).age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String outPut = "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age;
        return outPut;
    }
}
