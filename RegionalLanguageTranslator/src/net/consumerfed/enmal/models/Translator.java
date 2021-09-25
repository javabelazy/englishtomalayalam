package net.consumerfed.enmal.models;

 /**
 * Developing for office use
 */


import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Virat kohli *
 */
public class Translator extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JTextArea typeArea = null;
    private JTextArea viewArea = null;
    private Translator thisClass = null;
    private Mozhi mozhiObj = null;


    
    /**
     * This method initializes Typing area
     *   
     * @return javax.swing.JButton  
     */
    private JTextArea getTypingArea() {
        if (typeArea == null) {
        	//typeArea = new JTextArea();
        	typeArea = new JTextArea(5, 10);
            typeArea.setBounds(new Rectangle(50, 50, 450, 600));
            Font engFont = new Font("Times New Roman", Font.PLAIN, 16);
            typeArea.setFont(engFont);
            typeArea.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                	//System.out.println(" Vipin C P");
                	 String engWord = typeArea.getText();
               	  	viewArea.setText(mozhiObj.getMalayalam(engWord));
                	
                }

                  public void keyTyped(KeyEvent e) {
                	  //System.out.println(" Developing language Translator ");
                	  /*
                	  String engWord = typeArea.getText();
                	  viewArea.setText(mozhiObj.getMalayalam(engWord));
                	  */
                  }



				public void keyPressed(KeyEvent e) {
                	  //System.out.println(" English to south indian language translation ");
					 
                  }
                });
        	}
        return typeArea;
    }
    
    



	/**
     * This method initializes Typing area
     *   
     * @return javax.swing.JButton  
     */
    private JTextArea getViewArea() {
        if (viewArea == null) {
        	viewArea = new JTextArea();
        	Font malFont = new Font("Kerala", Font.PLAIN, 15);
        	viewArea.setBounds(new Rectangle(550, 50, 750, 600));
        	viewArea.setEditable(false);
        	viewArea.setFont(malFont);
        }
        return viewArea;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Translator thisClass = new Translator();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }

    /**
     * This is the default constructor
     */
    public Translator() {
        super();
        initialize();
    }

    /**
     * This method initializes this
     *
     * @return void
     */
    private void initialize() {
        this.setSize(1340, 720);
        this.setContentPane(getJContentPane());
        this.setTitle("Kairali : English To Malayalam Transalator");
        mozhiObj = new Mozhi();
    }

    /**
     * This method initializes jContentPane
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getTypingArea(), null);
            jContentPane.add(getViewArea(), null);
        }
        return jContentPane;
    }
  
}

