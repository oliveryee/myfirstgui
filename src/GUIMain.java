import javax.swing.*;

/**
 * Created by Oliver on 2017-03-06.
 * This class will instantiate our JPanel subclass (MyFirstGUI.java) and places it insider a JFrame
 */
public class GUIMain {

    public static void main(String[] args) {

        //set the look and feel of our GUI
        //note this may grow throw an exception
        try { //try - catch will handle Exceptions
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        Indicate to the Java VM and the GUI system that we want to call a function
        "asynchronously" meaning "sometime later"
        and this function will set up our GUI

        We're going to use the Runnable class that is related to MultiThreading
        MultiThreading is technically outside the scope of the course however you can reuse this code
        for your assignment.
         */

        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            //override the run() method inherited from Runnable
            public void run(){
                createAndShowGUI();
            }
        });

    }
        /*
        This method instantiates and sets up our JPanel (MyFirstGUI)
         */
        private static void createAndShowGUI(){
            //create a JFrame that is going to be the outer container for our GUI
            JFrame frame = new JFrame();
            //we have to specify what happens to our program when the user closes the window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //instantiate and set up the content pane (JPanel - MyFirstGUI)
            JComponent myPanel = new MyFirstGUI(); //JComponent is an ancestor of JPanel - this is the only line to change in assignment
            //make the content pane opaque (visible to the user)
            myPanel.setOpaque(true);
            //associate myPanel (has the content) with the JFrame container
            frame.setContentPane(myPanel);

            //make the GUI visible
            frame.pack();
            frame.setVisible(true);

    }

    }
