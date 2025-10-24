public class GymTest {
    public static void main(String[] args) {
        Gym Barbell = new Barbell();
        Gym Dumbell = new Dumbell();

        Barbell.pickupWeight();
        Barbell.makeGrunt();
        Barbell.slamWeight();

        System.out.println();

        Dumbell.pickupWeight();
        Dumbell.makeGrunt();
        Dumbell.slamWeight();
        
    }
}
