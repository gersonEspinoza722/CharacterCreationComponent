package BoardElement.Tools;

public class AbstractTool {
    private String name;

    public AbstractTool(float simpleUseDecrement, String name, int defaultLife, int decrementableLife, int reach, float level, float minCharacterLevelReq, float minPlayerLevelReq) {
        this.name = name;
        this.defaultLife = defaultLife;
        this.decrementableLife = decrementableLife;
        this.reach = reach;
        this.level = level;
        this.minCharacterLevelReq = minCharacterLevelReq;
        this.minPlayerLevelReq = minPlayerLevelReq;
        this.simpleUseDecrement = simpleUseDecrement;
        //IMAGE AND MEDIA STORAGE NEEDED
    }

    private int defaultLife;
    private int decrementableLife;
    private int reach; //can be used as radial or linear effect
    private float level;
    private float minCharacterLevelReq;
    private float minPlayerLevelReq;
    private float simpleUseDecrement;
}
