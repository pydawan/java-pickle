import java.io.File;
import java.io.Serializable;

import br.com.serializers.Pickle;


class Person implements Serializable {

// Instance attributes.
    private String name;
    private int age;

//  Constructors.
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//  Getters.
    public String getName() {
        return this.name;
    }

    public String name() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int age() {
        return this.age;
    }

//  Setters.
    public void setName(String name) {
        this.name = name;
    }

    public void name(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void age(int age) {
        this.age = age;
    }

//  Defining the textual representation of the objects of this class.
    public String toString() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }
}


public class PickleApplication {

//  Method that executes the application.
    public static void main(String[] args) {

        Person p1 = new Person("Joe Satriani", 57);
        
        String s = Pickle.dumps(p1);

        System.out.println(s);

        Person p2 = (Person) Pickle.loads(s);

        System.out.println(p2);

//      Writting to a file in append mode.
        Pickle.dump(p2, new File("people.ser"), true);

        Person p3 = (Person) Pickle.load(new File("people.ser") );

        p3.name("Steve Vai");

        p3.age(53);

        System.out.println(p3);
    }
}
