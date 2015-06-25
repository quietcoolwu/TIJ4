//: generics/SimplerPets.java

import net.mindview.util.New;
import typeinfo.pets.Pet;

import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} ///:~
