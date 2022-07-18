package dp._2_creationalPatterns._4_prototype.code;

/**
 * @author apuchals
 */
public abstract class HandHeldDevice implements Cloneable {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public HandHeldDevice clone() {
        try {
            return (HandHeldDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
