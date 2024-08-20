package practice.algo;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class WordMachineTest {
    private WordMachine wordMachine;

    @Before
    public void setup() {
        wordMachine = new WordMachine();
    }

    @Test
    public void resultMatch() {
        String S = "13 DUP 4 POP 5 DUP + DUP + - ";
        assertEquals(7,wordMachine.wordMachine(S));

    }
}
