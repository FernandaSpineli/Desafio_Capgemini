
public class Escada {
  public static void main(String[] args) {
    String input = "0";
    
    if (args != null && args.length > 0) {
      input = args[0];
    }
    
    int lines = Integer.parseInt(input);

    for (int i = 1; i <= lines; i++) {
      createLine(i, lines);
    }
  }

  public static void createLine(int lineNumber, int totalLines) {
    String result = "";
    int whiteSpaces = (totalLines - lineNumber);

    int count = 0;

    while (count < totalLines) {
      String newCharacter = (whiteSpaces > count) ? " " : "*";
      result += newCharacter;
      count++;
    }
    System.out.println(result);
  }
}
