import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Block Breaker");

        BlockBreakerPanel panel = new BlockBreakerPanel();

        jFrame.getContentPane().add(panel);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(580,600);


        jFrame.setResizable(false);
    }
}
