package Media;

import BoardElement.Character.IFactoryCreationComponent;
import Media.Concrete.ImageArray;

public class MediaListingFactory implements IFactoryCreationComponent {

    public static final int IMAGE_ARRAY = 0;

    public IMediaListing getMediaListing(int type){
        switch (type){
            case IMAGE_ARRAY:
                return new ImageArray();
        }
        return null;
    }
}
