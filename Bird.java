import java.awt.*;

public class Bird extends GameObject {
    private int velocityY = 0;
    private int gravity = 1;

    public Bird(int x, int y, int width, int height, Image img) {
        super(x, y, width, height, img);
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img, x, y, width, height, null);
    }

    public void update() {
        velocityY += gravity;
        y += velocityY;
        if (y < 0) y = 0; // prevent going above screen
    }

    public void flap() {
        velocityY = -9;
    }

    public void reset(int startY) {
        y = startY;
        velocityY = 0;
    }
}
