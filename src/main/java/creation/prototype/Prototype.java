package creation.prototype;

/**
 * @author zhangxinpeng
 * @date 2021/6/18
 */
public class Prototype implements Cloneable {
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch(CloneNotSupportedException e) {
            return null;
        }
    }
}
