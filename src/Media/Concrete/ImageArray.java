package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaElement;
import Media.IMediaListing;
import Patterns.IPrototype;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class ImageArray implements IMediaListing {
    ArrayList<IMediaElement> mediaList;
    public ImageArray() {
        mediaList=new ArrayList<>();
    }

    @Override
    public void loadMedia(IMediaElement media) {
        mediaList.add(media);
    }

    @Override
    public void deleteMediaElement(String name) {

    }

    @Override
    public AbstractMediaElement getElement(String name) {
        return null;
    }

    @Override
    public ArrayList<IMediaElement> getImages() {
        return this.mediaList;
    }

    //faltan implementar
    @Override
    public IPrototype clone() {
        return null;
    }

    //faltan implementar
    @Override
    public IPrototype deepClone() {
        return null;
    }
}
