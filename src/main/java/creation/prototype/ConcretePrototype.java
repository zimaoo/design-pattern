package creation.prototype;

/**
 * @author zhangxinpeng
 * @date 2021/6/18
 */
public class ConcretePrototype extends Prototype {
    private String name;

    public ConcretePrototype(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
