package main.com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WordSpinTest {
    @Test
    public void test() {
        assertEquals(WordSpin.spinWord("Welcome"), "emocleW");
        assertEquals(WordSpin.spinWord("Hey fellow warriors"), "Hey wollef sroirraw");
        assertEquals(WordSpin.spinWord("This is a test"), "This is a test");
        assertEquals(WordSpin.spinWord("This is another test"), "This is rehtona test");
        assertEquals(WordSpin.spinWord("You are almost to the last test"), "You are tsomla to the last test");
        assertEquals(WordSpin.spinWord("Just kidding there is still one more"), "Just gniddik ereht is llits one more");
        assertEquals(WordSpin.spinWord("Seriously this is the last one"), "ylsuoireS this is the last one");
    }
}