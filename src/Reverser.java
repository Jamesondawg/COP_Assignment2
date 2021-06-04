public class Reverser extends Transpose{

    public Reverser(String text)
    {
        super(text);
    }

    public String reverseText(String word)
    {
        String[] tokens = word.split(" ");
        String reverse = "";
        for (int i = tokens.length -1; i >=0; i--)
            reverse = reverse + tokens[i] + "";
        return reverse.trim();

    }
    @Override
    public String decode(String word)
    {
        return super.decode(word);

    }
}
