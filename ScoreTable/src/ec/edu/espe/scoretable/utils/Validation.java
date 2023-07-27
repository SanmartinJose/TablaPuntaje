
package ec.edu.espe.scoretable.utils;


import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Validation {
     public String validateName(JTextField textField) {
        String text = textField.getText();
        
        if (isValidText(text)) {
            return text;
        } else {
            textField.setText("");
            
            JLabel invalidLabel = new JLabel("Cadena inválida");
            textField.add(invalidLabel);
            
            return validateName(textField);
        }
    }
    
    private boolean isValidText(String text) {
        return text.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$");
    }
         
      public int validateNumber(JTextField textField) {
        String text = textField.getText();
        try {
            int number = Integer.parseInt(text);
            return number;
        } catch (NumberFormatException e) {
            textField.setText("");

            JLabel invalidLabel = new JLabel("Número inválido");
            textField.add(invalidLabel);

            return -1;
        }
    }

}
