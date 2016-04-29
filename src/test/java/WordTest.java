import org.junit.*;
import static org.junit.Assert.*;


public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
  }

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

 @Test
 public void clear_emptiesAllWordsFromList_0() {
   Word testWord = new Word("test");
   Word.clear();
   assertEquals(Word.all().size(), 0);
 }

 @Test
 public void getId_WordInstantiatesWithId_0() {
   Word testWord = new Word("test");
   assertEquals(0, testWord.getId());
 }

 @Test
 public void find_returnsWordWithSameId_testWordTwo() {
   Word testWordOne = new Word("test");
   Word testWordTwo = new Word("two");
   assertEquals(Word.find(testWordTwo.getId()), testWordTwo);
 }
}
