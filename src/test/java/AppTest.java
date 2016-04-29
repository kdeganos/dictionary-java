import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;
import static org.junit.Assert.*;


public class AppTest extends FluentTest{

  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @After
  public void tearDown() {
    Word.clear();
    // Definition.clear();
  }

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary");
  }

  @Test
  public void wordIsCreatedandDisplayed() {
    goTo("http://localhost:4567");
    click("a", withText("Add a New Word"));
    fill("#word").with("test");
    submit(".btn");
    assertThat(pageSource()).contains("test");
  }

  @Test
  public void wordShowPageDisplaysWord() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("test");
    submit(".btn");
    click("a", withText("test"));
    assertThat(pageSource()).contains("test");
  }

  @Test
  public void definitionFormIsDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("test");
    submit(".btn");
    click("a", withText("test"));
    click("a", withText("Add a New Definition"));
    assertThat(pageSource()).contains("test");
  }

  @Test
  public void definitionIsAddedAndDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("test");
    submit(".btn");
    click("a", withText("test"));
    click("a", withText("Add a New Definition"));
    fill("#definition").with("A procedure for critical evaluation.");
    submit(".btn");
    assertThat(pageSource()).contains("A procedure for critical evaluation.");
  }

}
