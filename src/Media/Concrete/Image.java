package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaElement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends AbstractMediaElement implements IMediaElement {
    private BufferedImage image;

    public Image(String name, File file) {
        super(name, file);
        load();
    }

    @Override
    public void load() {
        try {
            this.image = ImageIO.read(this.file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void getPath() {

    }
}
