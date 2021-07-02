package generators;

import enums.Input;
import generators.interfaces.Generator;

public class RandomInputGenerator implements Generator<Input> {
    public Input next() { return Input.randomSelection(); }
}
