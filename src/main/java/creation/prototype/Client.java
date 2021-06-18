package creation.prototype;

/**
 * @author zhangxinpeng
 * @date 2021/6/18
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototypeA = new ConcretePrototype("Tad");
        ConcretePrototype prototypeB = (ConcretePrototype) prototypeA.clone();
        System.out.println(prototypeA.getName());
        System.out.println(prototypeB.getName());
    }
}
