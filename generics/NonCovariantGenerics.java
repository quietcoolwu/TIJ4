//: generics/NonCovariantGenerics.java
// {CompileTimeError} (Won't compile)

import java.util.ArrayList;

public class NonCovariantGenerics {
    // Compile Error: incompatible types:
    List<Fruit> flist = new ArrayList<Apple>();
} ///:~
