package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaElement;
import Patterns.IPrototype;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends AbstractMediaElement implements IMediaElement {
    private BufferedImage image;
    private String path;

    public Image() {
    }
    
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
        	System.out.println("No encontre: "+path);
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

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }
}
