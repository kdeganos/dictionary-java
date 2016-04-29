import org.junit.*;
import static org.junit.Assert.*;


public class WordCloneTest {
  @Test
  public void wordClone_instantiatesCorrectly_true() {
    WordClone testWord = new WordClone("test", 0);
    assertEquals(true, testWord instanceof WordClone);
  }

  @Test
  public void getWord_WordCloneInstantiatesWithWord_test() {
    WordClone testWord = new WordClone("test", 0);
    assertEquals("test", testWord.getWord());
  }

  @Test
  public void getId_WordCloneInstantiatesWithId_0() {
    WordClone testWord = new WordClone("test", 0);
    assertEquals(0, testWord.getId());
  }
}
