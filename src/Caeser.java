public class Caeser extends Cipher {

    public Caeser (String text)
    {
        super(text);        //Super (s)
    }
    public String encode (String word)
    {
        return code(word,3);
    }

    public String decode (String word)
    {
        //Complete this method so that it decodes
        //the encoded string
        return code(word,3);
    }

    String code (String word, int SHIFT)
    {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = determineCharacter(ch,SHIFT);
            result.append(ch);
        }
        return result.toString();
    }

    public char determineCharacter (char ch, final int shift)
    {
        if(Character.isUpperCase(ch))
        // Complete the if/else so that lower case letters are accounted fo
        {
            ch = (char)(65 + (ch - 65 + shift) % 26);
        } else
        {
            ch = (char)(97 + (ch - 97 + shift) % 26);
        }
        return ch;
    }
}
