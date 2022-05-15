package fishshop.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextEditTest {

  @Test
  void reverseMiddleWord() {
    TextEdit editor = new TextEdit();
    String text = "How are you doing?I am doing great.How old are you?I am 6 years old!How can I get to city Lviv?";
    String actual = "How uoy era doing? How era dlo you? How can I teg to city Lviv? ";

      String result = editor.reverseMiddleWord(text);
      Assertions.assertFalse(result.isEmpty());
      Assertions.assertEquals(result, actual);
  }
}