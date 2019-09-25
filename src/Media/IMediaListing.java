package Media;

import BoardElement.Tools.ITool;
import Media.Concrete.Image;
import java.io.File;
import java.util.ArrayList;

public interface IMediaListing {
    void loadMedia(String name, File file);
    void deleteMediaElement(String name);
    AbstractMediaElement getElement(String name);
    ArrayList<Image> getImages();
}
