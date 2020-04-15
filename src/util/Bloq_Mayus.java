package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
 *
 * @author Jose Manuel Estrada Diaz
 */
public class Bloq_Mayus extends PlainDocument
{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException
    {
        super.insertString(offs, str.toUpperCase(), a);
    }
}
