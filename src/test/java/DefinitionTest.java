import org.junit.*;
import static org.junit.Assert.*;


public class DefinitionTest {
  @After
  public void tearDown() {
    Definition.clear();
  }

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

  @Test
  public void all_returnsAllInstancesofDefinition_true() {
    Definition testDefinitionOne = new Definition("test");
    Definition testDefinitionTwo = new Definition("two");
    assertEquals(true, Definition.all().contains(testDefinitionOne));
    assertEquals(true, Definition.all().contains(testDefinitionTwo));
  }

  @Test
  public void clear_emptiesAllDefinitionsFromList_0() {
    Definition testDefinition = new Definition("test");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
