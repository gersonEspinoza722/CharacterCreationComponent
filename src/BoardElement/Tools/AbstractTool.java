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
    protected int type;

    public AbstractTool() {
    }

    public AbstractTool(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq,IMediaListing media,int type) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.reach = reach;
        this.level = level;
        this.minCharacterLevelReq = minCharacterLevelReq;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.simpleUseDecrement = simpleUseDecrement;
        this.media = media;
        this.type = type;
        //IMAGE AND MEDIA STORAGE NEEDED
    }
}
