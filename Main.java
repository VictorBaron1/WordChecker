import java.util.ArrayList;
public class Main
{
    public static void main(String[]args)
    {
       WordChecker w = new WordChecker();
       ArrayList<String> words = new ArrayList<String>();
       words.add("an");
       words.add("band");
       words.add("band");
       words.add("abandon");
       System.out.println(words);
       WordChecker x = new WordChecker(words);
       System.out.println(x.isWordChain());

       WordChecker y = new WordChecker();
       ArrayList<String> letters = new ArrayList<String>();
       letters.add("to");
       letters.add("too");
       letters.add("stool");
       letters.add("tools");
       System.out.println(letters);
       WordChecker z = new WordChecker(letters);
       System.out.println(z.isWordChain());

       WordChecker p = new WordChecker();
       ArrayList<String> word = new ArrayList<String>();
       word.add("catch");
       word.add("bobcat");
       word.add("catchacat");
       word.add("cat");
       word.add("at");
       System.out.println(word);
       WordChecker a = new WordChecker(word);
       System.out.println(a.isWordChain());
       WordChecker b = new WordChecker(word);
       System.out.println(b.createList("cat"));
       WordChecker c = new WordChecker(word);
       System.out.println(c.createList("catch"));
       WordChecker d = new WordChecker(word);
       System.out.println(d.createList("dog"));
    }

} 
    
