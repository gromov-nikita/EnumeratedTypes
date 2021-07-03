package helpers;
import java.io.*;
import java.util.*;

public class TextFile {
    private BufferedReader reader;
    private List<String> list;
    public TextFile(String fileName, char split) throws IOException {
        reader = new BufferedReader(new FileReader(fileName));
        Scanner scan = new Scanner(reader);
        String str = "";
        while(scan.hasNext()) {
            str += scan.nextLine();
        }
        list = new LinkedList(Arrays.asList(str.split(String.valueOf(split))));
    }
    public Iterator<String> iterator() {
        return list.iterator();
    }
    public static void main(String[] args) throws IOException {
        TextFile f = new TextFile("src/VendingMachineInput.txt", ';');
        System.out.println(f.list.toString());
    }
}
