public class Barbell implements Gym{
    @Override
    public void pickupWeight() {
        System.out.println("The squat bar is HEAAAVY!!");
    }

    @Override
    public void makeGrunt() {
        System.out.println("GRRRRRRRRRRRRRRRT!!!! RAH!");
    }

    @Override
    public void slamWeight() {
        System.out.println("RERACK TIME! BOOYAH!");
    }
}
