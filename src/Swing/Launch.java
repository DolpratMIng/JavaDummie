package Swing;

import javax.swing.SwingUtilities;
/*
SwingUtilities.invokeLater
= In a Swing application, most of the processing takes place in a single, special thread - EDT(even dispatched thread)

=This thread will become active after a component becomes realized: either pack, show, or setVisible(true) has been called

=Almost all calls to realized components should execute in the event dispatch thread.
 */
public class Launch {
    public static void main(String[] args) {

        /* line 17-27
        Answer from StackOverFlow
        Answer 1-You are creating an instance of an anonymous implementation of the Runnable interface and
        passing it to invokeLater, which will put it on a queue.
        Another thread, the Even Dispatch Thread, pops Runnables off that queue and invokes their run method.

        Answer 2 - add a task to the tasks queue of the java thread which is in charge of the rendering
        & events for your whole application
         */
        SwingUtilities.invokeLater(new Runnable() { // method call invokeLater from SwingUtilities class
            // invokeLater require instance of runnable to ensure that all of our swing related code is run on the same thread


            // override method
            @Override
            public void run() {
                MainWindow main =  new MainWindow(); // create MainWindow class
                main.show(); //

            }
        });
    }
}
