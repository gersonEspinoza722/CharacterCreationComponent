package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaElement;
import Media.IMediaListing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class ImageArray implements IMediaListing {
    ArrayList<Image> images;
    public ImageArray() {
        images=new ArrayList<>();
    }

    @Override
    public void loadMedia(String name, File file) {
        Image image = new Image(name,file);
        images.add(image);
    }

    @Override
    public void deleteMediaElement(String name) {

    }

    @Override
    public AbstractMediaElement getElement(String name) {
        return null;
    }

    @Override
    public ArrayList<Image> getImages() {
        return images;
    }
}
