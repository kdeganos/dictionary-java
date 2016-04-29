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

 @Test
 public void all_returnsAllInstancesofWord_true() {
   Word testWordOne = new Word("test");
   Word testWordTwo = new Word("two");
   assertEquals(true, Word.all().contains(testWordOne));
   assertEquals(true, Word.all().contains(testWordTwo));
 }
}
