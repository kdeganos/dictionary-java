import org.junit.*;
import static org.junit.Assert.*;


public class DefinitionTest {
  @Test
  public void word_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("test");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getDefinition_DefinitionInstantiatesWithDefinition_test() {
    Definition testDefinition = new Definition("test");
    assertEquals("test", testDefinition.getDefinition());
  }
}
