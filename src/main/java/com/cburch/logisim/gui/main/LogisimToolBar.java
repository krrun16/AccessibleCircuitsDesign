package com.cburch.logisim.gui.main;

import com.cburch.logisim.proj.Project;
import com.cburch.logisim.tools.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LogisimToolBar extends JMenuBar {
    //private JFrame parent;
    //private Project proj;
    private PokeTool poke;
    private TextTool text;
    private SelectTool select;
    private WiringTool wiring;
    public LogisimToolBar(/*JFrame parent, Project proj*/){
        //this.parent = parent;
        //this.proj = proj;
        poke = new PokeTool();

        poke.setMnemonic(KeyEvent.VK_0);
        poke.getAccessibleContext().setAccessibleDescription("poke");
        add(poke);
        text = new TextTool();
        text.setMnemonic(KeyEvent.VK_1);
        text.getAccessibleContext().setAccessibleDescription("text");
        add(text);
        select = new SelectTool();
        select.setMnemonic(KeyEvent.VK_2);
        select.getAccessibleContext().setAccessibleDescription("select");
        add(select);
        wiring = new WiringTool();
        wiring.setMnemonic(KeyEvent.VK_2);
        wiring.getAccessibleContext().setAccessibleDescription("wiring");
        add(wiring);

    }


    //public static final EditTool edit = new EditTool();
    //public static final AddTool add = new AddTool();
    //private

}
