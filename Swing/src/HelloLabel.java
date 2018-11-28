import javax.swing.*;

public class HelloLabel {
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello Swing");
        JLabel jLabel = new JLabel("A Label");
        frame.add(jLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,100);
    }
}
