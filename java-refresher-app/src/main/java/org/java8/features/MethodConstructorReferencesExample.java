package org.java8.features;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class MethodConstructorReferencesExample {
    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter1 = something::startsWith;
        Converter<String, String> converter2 = something::endsWith;

        System.out.println(converter1.convert("Test"));
        System.out.println(converter2.convert("Test1"));

        //constructor Reference -
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

        System.out.println(person.toString());
    }
}

class Something {
    String startsWith(String str) {
        return String.valueOf(str.charAt(0));
    }

    String endsWith(String str) {
        return String.valueOf(str.charAt(str.length() - 1));
    }
}

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        //return "[First Name: " + this.firstName +", Last Name: " + this.lastName + "]";
        return new StringBuilder("[First Name: ").append(this.firstName).append(", Last Name: ").append(this.lastName).append("]").toString();
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}


