package lt.eimantas;

public class Cat extends Animal implements  IWalking{

    private String walkAction ="";

    public Cat(String name){
        super.setName(name);
        this.setWalk("Selina");
    }

    @Override
    public void doWalk() {
        System.out.println(this.walkAction);
        System.out.println(this.walkAction);
        System.out.println(this.walkAction);
    }

    @Override
    public void setWalk(String walk) {
        this.walkAction=walk;
    }
}
