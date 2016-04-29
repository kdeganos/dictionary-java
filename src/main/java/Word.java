import java.util.ArrayList;
import java.util.*;

public class Word{
  private String mWord;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private int mId;
  private ArrayList<Definition> mDefinitions;

  public Word (String word) {
   mWord = word;
   mId = instances.size();
   instances.add(this);
   mDefinitions = new ArrayList<Definition>();
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

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

  public static ArrayList<Word> sortWords() {
    ArrayList<Word> list = instances;
    Collections.sort(list, new Comparator<Word>() {
      @Override
      public int compare(Word s1, Word s2) {
        String word1 = s1.getWord();
        String word2 = s2.getWord();
        return word1.compareToIgnoreCase(word2);
      }
    });
    return list;
  }
}
