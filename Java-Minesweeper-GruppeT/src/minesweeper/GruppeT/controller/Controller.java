package minesweeper.GruppeT.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import minesweeper.GruppeT.model.Field;
import minesweeper.GruppeT.model.Game;

/**
 * Controller 
 * 
 * @author Cafer Ucarli
 */
public class Controller extends MouseAdapter {

    private Field field;
    private Game model;

    /**
     * Constructor
     *
     * @param field field of the game
     */
    public Controller(Field field) {
        this.field = field;
    }

    /**
     * Change the field
     * @param field
     */
    public void updateField(Field field) {
        this.field = field;
    }

    /**
     * Constructor
     *
     * @param model
     */
    public Controller(Game model) {
        this.model = model;
    }
    
    /**
     * Checks for Mouseclicks
     *
     * @param e the MouseEvent that just happened
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                if (this.model == null) {
                    if (!field.isFlag()) {
                        field.reveal();

                    }
                } else {
                    model.Init();
                }
                break;
            case MouseEvent.BUTTON3:
                if (this.model == null) {
                    field.changeState();
                }
                break;
            default:
                break;
        }
    }
}

