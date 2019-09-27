package BoardElement.Tools;

import BoardElement.Character.IFactoryCreationComponent;

import java.util.HashMap;

public class ToolListingFactory implements IFactoryCreationComponent {

    private static ToolListingFactory singleton = null;

    public static final int TOOL_ARRAY = 0;

    public ToolListingFactory() {
    }

    public static ToolListingFactory getInstance(){
        if(singleton == null){
            singleton = new ToolListingFactory();
        }
        return singleton;
    }

    public IToolListing getToolListing(int type){
        switch (type){
            case TOOL_ARRAY:
                return new ToolArray();
        }
        return null;
    }
}
