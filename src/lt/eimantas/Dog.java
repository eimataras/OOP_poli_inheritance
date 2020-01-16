package lt.eimantas;

public class Dog extends Animal implements IWalking {
    private String walkAction = "";

    public Dog(String name) {
        super.setName(name);
        setWalk("Skuodzia");
    }

    @Override
    public void doWalk() {
        System.out.println(this.walkAction);
    }

    @Override
    public void setWalk(String walk) {
        this.walkAction = walk;
    }
}
