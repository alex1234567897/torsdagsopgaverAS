package Task1;

public class ArrayFejl {
    public static void printTreForsteElementer(String[] array) {
        System.out.println("Første element: " + array[0]);
        System.out.println("Andet element: " + array[1]);
        System.out.println("Tredje element: " + array[2]);
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        try {
            printTreForsteElementer(navne1);
            printTreForsteElementer(navne2);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error array to short");
        }
    }
}
