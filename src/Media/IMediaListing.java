package Media;

import java.io.File;

public interface IMediaListing {
    void loadMedia(String name, File file);
    void deleteMediaElement(String name);
    AbstractMediaElement getElement(String name);

}
