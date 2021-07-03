package generators;

import enums.Input;
import generators.interfaces.Generator;
import helpers.TextFile;

import java.io.IOException;
import java.util.Iterator;

public class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;
    public FileInputGenerator(String fileName) throws IOException {
        input = new TextFile(fileName, ';').iterator();
    }
    public Input next() {
        if(!input.hasNext())
            return null;
        return Enum.valueOf(Input.class, input.next().trim());
    }
}
