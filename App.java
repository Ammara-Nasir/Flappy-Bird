import javax.swing.*;

public class App{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird OOP");
        FlappyBird1 game = new FlappyBird1();

        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
