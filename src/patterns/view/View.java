package patterns.view;

import java.awt.Color;

/**
 *
 * @author kevinmont
 */
public interface View {
    
    void setNumber(int number);
    
    void setColor(Color color);
    
    void increase(java.awt.event.ActionEvent evt);
    
    void decrease(java.awt.event.ActionEvent evt);
}
