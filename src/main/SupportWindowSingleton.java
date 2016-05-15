package main;

import GUILook.SupportWindow;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SupportWindowSingleton {

    private static SupportWindow spw;

    private SupportWindowSingleton() {
    }

    public static SupportWindow getSWInstance() {
        if (spw == null) {
            spw = new SupportWindow();
            spw.setVisible(true);
            spw.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent windowEvent) {
                    spw.dispose();
                    spw = null;
                }
            });
        }
        return spw;
    }
}
