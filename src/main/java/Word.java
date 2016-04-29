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
    sortWords();
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

  public static List<WordClone> sortWords() {
    List<WordClone> clonedList = new ArrayList<WordClone>(instances.size());
    for (Word instance : instances) {
      clonedList.add(new WordClone(instance.getWord(), instance.getId()));
    }
    Collections.sort(clonedList, new Comparator<WordClone>() {
      @Override
      public int compare(WordClone s1, WordClone s2) {
        String word1 = s1.getWord();
        String word2 = s2.getWord();
        return word1.compareToIgnoreCase(word2);
      }
    });
    return clonedList;
  }
}
