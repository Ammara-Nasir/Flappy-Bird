import java.awt.*;

public class Pipe extends GameObject {
    boolean passed = false;
    boolean isTop;

    public Pipe(int x, int y, int width, int height, Image img, boolean isTop) {
        super(x, y, width, height, img);
        this.isTop = isTop;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img, x, y, width, height, null);
    }
}
