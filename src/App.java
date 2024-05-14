public class App {
    public static void main(String[] args) throws Exception {
        // Generics are a feature in Java that allows you to define classes,
        // interfaces and methods that operate on an unspecified type.
        // The idea is to allow type (Integer, String, … etc and user-defined types)
        // to be a parameter to methods, classes, and interfaces.
        // Generics are mostly used by classes like ArrayList, HashMap, etc.
        // Generics are used to create classes, interfaces, and methods that operate on
        // objects of specified type.
        // The classes, interfaces, and methods that use generics are known as generic
        // classes, interfaces, and methods.
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E", "B", "Y", "E" };

        HandleMyArrays.displayArray(intArray);
        HandleMyArrays.displayArray(doubleArray);
        HandleMyArrays.displayArray(charArray);
        HandleMyArrays.displayArray(stringArray);

        System.out.println("First element of intArray: " + HandleMyArrays.getFirstElement(intArray));
        System.out.println("First element of doubleArray: " + HandleMyArrays.getFirstElement(doubleArray));
        System.out.println("First element of charArray: " + HandleMyArrays.getFirstElement(charArray));
        System.out.println("First element of stringArray: " + HandleMyArrays.getFirstElement(stringArray));

        // Call the generic class MyGenericClass
        MyGenericClass<Integer, Character> myIntChar = new MyGenericClass<>(1, 'A');
        MyGenericClass<Double, String> myDoubleString = new MyGenericClass<>(3.14, "Pi");
        MyGenericClass<Character, Integer> myCharInteger = new MyGenericClass<>('@', 64);
        MyGenericClass<String, String> myStringString = new MyGenericClass<>("Hello", "World");

        System.out.println("myIntChar: " + myIntChar.getX() + myIntChar.getY());
        System.out.println("myDouble: " + myDoubleString.getX() + myDoubleString.getY());
        System.out.println("myChar: " + myCharInteger.getX() + myCharInteger.getY());
        System.out.println("myString: " + myStringString.getX() + myStringString.getY());

        System.out.println(myIntChar.toString());
        System.out.println(myDoubleString.toString());
        System.out.println(myCharInteger.toString());
        System.out.println(myStringString.toString());

    }

}
