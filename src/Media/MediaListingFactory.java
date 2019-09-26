package Media;

import Media.Concrete.ImageArray;

public class MediaListingFactory {

    public static final int IMAGE_ARRAY = 0;

    public IMediaListing getMediaListing(int type){
        switch (type){
            case IMAGE_ARRAY:
                return new ImageArray();
        }
        return null;
    }
}
