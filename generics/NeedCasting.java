//: generics/NeedCasting.java

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class NeedCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        List<Widget> shapes = (List<Widget>) in.readObject();
    }
} ///:~