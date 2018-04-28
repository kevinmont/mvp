package patterns.presenter;

import java.awt.Color;
import patterns.model.Stack;
import patterns.view.View;

/**
 *
 * @author kevinmont
 */
public class Presenter {

    private View view;
    private Stack stack;

    public void setView(View view) {
        this.view = view;
        this.stack = new Stack();
    }

    public void increase() {
        int newValue = this.stack.increase();
        setNumberUI(newValue);
        change(newValue);
    }

    public void decrease() {
        int newValue = this.stack.decrease();
        setNumberUI(newValue);
        change(newValue);
    }

    private void setNumberUI(int value) {
        this.view.setNumber(value);
    }

    private void change(int value) {
        if (value > 5)
            this.view.setColor(Color.RED);
        else if (value < 0)
            this.view.setColor(Color.BLUE);
        else
            this.view.setColor(Color.YELLOW);
        
    }

}
