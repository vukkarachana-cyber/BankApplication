
package com.github.derickfelix.bankapplication;

import com.github.derickfelix.bankapplication.utilities.DBUtility;
import com.github.derickfelix.bankapplication.utilities.MessageUtility;
import com.github.derickfelix.bankapplication.views.LoginForm;
import javax.swing.UnsupportedLookAndFeelException;

public class BankApplication {
    
   
    public static void main(String args[])
    {

        try {
            String systemLookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(systemLookAndFeel);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            MessageUtility.error(null, "Failed to use system look and feel", e);
        }
      

        DBUtility.prepare();

     
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
