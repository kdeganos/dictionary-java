import org.junit.*;
import static org.junit.Assert.*;


public class WordTest {

 @Test
 public void word_instantiatesCorrectly_true() {
  Word testWord = new Word("test");
  assertEquals(true, testWord instanceof Word);
 }

 @Test
 public void getWord_WordInstantiatesWithWord_test() {
   Word testWord = new Word("test");
   assertEquals("test", testWord.getWord());
 }
}
