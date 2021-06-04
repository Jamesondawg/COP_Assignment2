public class Transpose extends Cipher
{
    public Transpose(String text)
    {
        super(text); //(s)
    }

    public String encode(String word)
    {
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }

    public String decode(String word)
    {
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }
}
