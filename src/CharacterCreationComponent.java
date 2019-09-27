import BoardElement.Character.CharacterFactory;
import BoardElement.Character.IFactoryCreationComponent;
import BoardElement.Tools.ToolFactory;
import BoardElement.Tools.ToolListingFactory;
import Media.MediaElementFactory;
import Media.MediaListingFactory;

public class CharacterCreationComponent {

    public static final int CHARACTER_FACTORY = 0;
    public static final int TOOL_FACTORY = 1;
    public static final int TOOL_LISTING_FACTORY = 2;
    public static final int MEDIA_ELEMENT_FACTORY = 3;
    public static final int MEDIA_LISTING_FACTORY = 4;

    public IFactoryCreationComponent getCharacterCreationComponent(int type){
        switch (type){
            case CHARACTER_FACTORY:
                return CharacterFactory.getInstance();
            case TOOL_FACTORY:
                return new ToolFactory();
            case TOOL_LISTING_FACTORY:
                return new ToolListingFactory();
            case MEDIA_ELEMENT_FACTORY:
                return new MediaElementFactory();
            case MEDIA_LISTING_FACTORY:
                return new MediaListingFactory();
        }
        return null;
    }
}
