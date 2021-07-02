import enums.CartoonCharacter;
import interfaces.IGenerator;

public class EnumImplementation {
    public static <T> void printNext() {
        System.out.print(CartoonCharacter.next() + ", ");
    }
    public static void main(String[] args) {
        // Choose any instance:
        for(int i = 0; i < 10; i++)
            printNext();
    }
}
