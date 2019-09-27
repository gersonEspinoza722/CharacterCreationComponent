package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaElement;
import Media.IMediaListing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class ImageArray implements IMediaListing {
    ArrayList<IMediaElement> mediaList;
    public ImageArray() {
        mediaList=new ArrayList<>();
    }
    public ImageArray(ArrayList<Image> images) {
        this.images = images;
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

}
