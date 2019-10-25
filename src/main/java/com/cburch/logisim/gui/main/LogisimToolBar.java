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
    public LogisimToolBar(/*JFrame parent, Project proj*/){
        //this.parent = parent;
        //this.proj = proj;
        poke = new PokeTool();
        poke.getAccessibleContext();
        poke.setMnemonic(KeyEvent.VK_0);
        add(poke);
        text = new TextTool();
        text.getAccessibleContext();
        text.setMnemonic(KeyEvent.VK_1);
        add(text);
        select = new SelectTool();
        select.getAccessibleContext();
        select.setMnemonic(KeyEvent.VK_2);
        add(select);

    }


    //public static final EditTool edit = new EditTool();
    //public static final AddTool add = new AddTool();
    //private

}
