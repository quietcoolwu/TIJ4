//: generics/ExplicitTypeSpecification.java

import net.mindview.util.New;
import typeinfo.pets.Pet;

import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
