public class HandleMyArrays {
    // The code below is a generic class that has a method to display an array of
    // any type
    // and a method to get the first element of an array of any type.
    public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static <T> T getFirstElement(T[] array) {
        return array[0];
    }
}
