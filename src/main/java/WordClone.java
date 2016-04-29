import java.util.ArrayList;
import java.util.*;

public class WordClone{
  private String mWord;
  private int mId;

  public WordClone (String word, int id) {
    mWord = word;
    mId = id;
  }

  public String getWord() {
    return mWord;
  }

  public int getId() {
    return mId;
  }
}
