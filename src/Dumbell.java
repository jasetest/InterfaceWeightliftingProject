public class Dumbell implements Gym {
    @Override
    public void pickupWeight() {
        System.out.println("Picking up weight, LIGHTWEIGHT BABY!");
    }

    @Override
    public void makeGrunt() {
        System.out.println("GRRRRRUNNNNNNT!!!");
    }

    @Override
    public void slamWeight() {
        System.out.println("BANG! SLAMMED!");
    }
}
