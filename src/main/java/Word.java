import java.util.ArrayList;

public class Word{
  private String mWord;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private int mId;

  public Word (String word) {
   mWord = word;
   mId = instances.size();
   instances.add(this);
  }

  public String getWord() {
    return mWord;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try {
      return instances.get(id);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
