package enums;

import interfaces.IGenerator;

import java.util.Random;

public enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    public static CartoonCharacter next() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}
