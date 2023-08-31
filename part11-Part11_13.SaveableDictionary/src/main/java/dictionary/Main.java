package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        
        dictionary.load();

        dictionary.add("djhgfgdfh", "monkasdadassdsdfsfey");
        dictionary.add("baddffgdfgasdasnaani", "sdfsadsdfsdf");
        dictionary.delete("asdasdasdfsdsd");
        
        dictionary.save();

    }
}
