package BoardElement.Tools;

import Media.IMediaListing;

public class AbstractTool {
    protected String name;
    protected int defaultLife;
    protected int decrementableLife;
    protected int reach; //can be used as radial or linear effect
    protected float level;
    protected float minCharacterLevelReq;
    protected float minPlayerLevelReq;
    protected float simpleUseDecrement;
    protected IMediaListing media;

    public AbstractTool() {
    }

    public AbstractTool(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq,IMediaListing media) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.reach = reach;
        this.level = level;
        this.minCharacterLevelReq = minCharacterLevelReq;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.simpleUseDecrement = simpleUseDecrement;
        this.media = media;
        //IMAGE AND MEDIA STORAGE NEEDED
    }
}
