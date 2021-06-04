
import javax.swing.JOptionPane;


public class TestEncryption
{
    public static void main(String args[])
    {

        String code, output = "";

        String text = JOptionPane.showInputDialog("Enter Message");

        output += "The Original Message is \n "+ text +" \n";

        Cipher c = new Caeser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCaeser Cipher\nThe Encrypted message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();

        output += "The Decrypted Transpose message \n" + code + "\n";

        c = new Reverser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        code = ((Reverser)c).reverseText(code);
        output += "\nReverser\nThe Encrypted Reverse message is \n" + code +"\n";
        code = c.decode(code);
        output += "The Decrypted Reverse message is \n" + code;
        display(output);

    }

    static void display(String s){
        JOptionPane.showMessageDialog(null,s,"Encrypt/Decrypt",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

