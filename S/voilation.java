package solid.S;
class Book1{
    private String name;
    private String author;
    private String text;

    public String replaceWordInText(String word){
        return text.replaceAll(word,text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    void PrintTextToConsole(String text){
        System.out.println(text);
    }
}
public class voilation {
    // Book1 is voilating the rule of single responsibility
    // it is doing two task together printing and searching
}
