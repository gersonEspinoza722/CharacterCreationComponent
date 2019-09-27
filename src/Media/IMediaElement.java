package Media;

import java.io.File;

public interface IMediaElement {
    void load();
    void delete();
    String getPath();
    void setPath(String path);
}
