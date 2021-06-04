import java.util.StringTokenizer;

public abstract class Cipher
{
    private String message;
    StringBuffer encrypted_message;
    StringBuffer decrypted_message;

    public Cipher (String text)
    {
        this.message = text;
    }

    public final void encrypt()
    {
        // The message string is tokenized into individual words and
        // each word is encoded by calling the encode method

        this.encrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(this.message);

        while(words.hasMoreTokens())
        {
            String s = words.nextToken();
            s = encode(s) + " ";
            this.encrypted_message.append(s);

        }

    }

    public final void decrypt(String message)
    {
        //The encoded message string is tokenized into individual words
        // and each word is encoded by calling the decode method
        //Supply the code that will decrypt the encrypted string

        this.decrypted_message = new StringBuffer();
        StringTokenizer words = new StringTokenizer(this.encrypted_message.toString());
        while (words.hasMoreTokens())
        {
            String s= words.nextToken();
            s = decode(s) + "";
            this.decrypted_message.append(s);
        }
    }

    public String getEncodedMessage()
    {

        return this.encrypted_message.toString();
    }

    public String getDecodedMessage(){

        return this.decrypted_message.toString();
    }
    //encode String s
    public abstract String encode(String paramString);

    //decode String s
    public abstract String decode(String s);
}



