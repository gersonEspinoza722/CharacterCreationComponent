package Media;

import java.io.File;

public class AbstractMediaElement {

    public AbstractMediaElement() {
    }
    
    
    public AbstractMediaElement(String name, File file) {
        this.name = name;
        this.file = file;
    }
    

    protected String name;
    protected File file;
}
