package Media.Concrete;

import Media.AbstractMediaElement;
import Media.IMediaListing;

import java.io.File;

public class ImageCharacterBasic implements IMediaListing {
    @Override
    public void loadMedia(String name, File file) {
        
    }

    @Override
    public void deleteMediaElement(String name) {

    }

    @Override
    public AbstractMediaElement getElement(String name) {
        return null;
    }
}
