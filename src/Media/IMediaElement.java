package Media;

import Patterns.IPrototype;

import java.io.File;

public interface IMediaElement extends IPrototype<IMediaElement> {
    void load();
    void delete();
    String getPath();
    void setPath(String path);
}
