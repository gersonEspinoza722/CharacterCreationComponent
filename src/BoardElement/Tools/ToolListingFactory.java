package BoardElement.Tools;

import java.util.HashMap;

public class ToolListingFactory {

    private static ToolListingFactory singleton = null;

    public static final int TOOL_ARRAY = 0;

    private ToolListingFactory() {
    }

    public static ToolListingFactory getInstance(){
        if(singleton == null){
            singleton = new ToolListingFactory();
        }
        return singleton;
    }

    public IToolListing getToolListing(int type, String name){
        switch (type){
            case TOOL_ARRAY:
                return new ToolArray(name);
        }
        return null;
    }
}
