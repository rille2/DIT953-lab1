import controller.Controller;
import model.Model;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {
    private Model model;

    public static void main(String[] args) {
        Application app = new Application();
    }


    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int DELAY = 50;

    private Application() {
        model = new Model();
        Controller controller = new Controller(model);
        View view = new View(model, controller);

        new Timer(DELAY, new TimerListener()).start();
    }

    /**
     * Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.update();
        }
    }
}
