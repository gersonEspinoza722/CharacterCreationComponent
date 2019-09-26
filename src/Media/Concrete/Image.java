package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaElement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends AbstractMediaElement implements IMediaElement {
    private BufferedImage image;
    private String path;

    public Image(String name, File file) {
        super(name, file);
        this.path=file.getPath();
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
    public String getPath() {
        return path;
    }
}
