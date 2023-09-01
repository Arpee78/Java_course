package methodpass.window;

import java.util.List;

public class WindowOperation {

    public void riseSize(List<Window> windows, int plusSize) {
        for (Window w : windows) {
            w.setHeight(w.getHeight()+plusSize);
        }
    }
}
