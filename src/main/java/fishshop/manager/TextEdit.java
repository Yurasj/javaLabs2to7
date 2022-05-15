package fishshop.manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEdit {
  public String reverseMiddleWord(String text) {
    StringBuilder result = new StringBuilder();
    Pattern p = Pattern.compile("[\\w+\\s]+\\?");
    Matcher m = p.matcher(text);

    while (m.find()) {

      StringBuilder middleOfSentence = new StringBuilder();
      StringBuilder startOfSentence = new StringBuilder();
      StringBuilder endOfSentence = new StringBuilder();
      StringBuilder fullSentence = new StringBuilder();
      String[] words = m.group().split(" ");
      int length = words.length;
      int i = 0;

      for (String word : words) {
        i += 1;

        if (length % 2 == 0) {
          if (i < length / 2) {
            startOfSentence.append(word);
            startOfSentence.append(" ");
          }
          if (i == length / 2 + 1 || i == length / 2) {
            middleOfSentence.append(word);
            if (i == length / 2)
              middleOfSentence.append(" ");
          }
          if (i > length / 2 + 1) {
            endOfSentence.append(word);
            endOfSentence.append(" ");
          }
        }
        if (length % 2 == 1) {
          if (i < length / 2 + 1) {
            startOfSentence.append(word);
            startOfSentence.append(" ");
          }
          if (i == length / 2 + 1) {
            middleOfSentence.append(word);
          }
          if (i > length / 2 + 1) {
            endOfSentence.append(word);
            endOfSentence.append(" ");
          }
        }
      }
      fullSentence.append(startOfSentence);
      fullSentence.append(middleOfSentence.reverse());
      fullSentence.append(" ");
      fullSentence.append(endOfSentence);
      String fullSentenceString = fullSentence.toString();
      result.append(fullSentenceString);
    }
    return result.toString();
  }
}


