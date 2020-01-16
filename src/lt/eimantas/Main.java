package lt.eimantas;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal dog = new Dog("Sunis");
        Animal cat = new Cat("Kate");

        showAnimalName(dog);
        showWalkingAction((IWalking) dog);
        showAnimalName(cat);
        showWalkingAction((IWalking) cat);

    }

    private static void showAnimalName(Animal animal){
        System.out.println(animal.getName());
    }

    private static void showWalkingAction(IWalking walker) {
        walker.doWalk();
    }
}
