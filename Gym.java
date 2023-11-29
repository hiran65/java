package Lab4.gym;
import Lab4.gym.machines.ExerciseMachine;
import Lab4.gym.people.GymMember;
import Lab4.gym.objects.WaterBottle;

public class Gym {
    public static void main(String[] args) {
        // Creating a treadmill
        ExerciseMachine treadmill = new ExerciseMachine() {
            @Override
            public void start() {
                System.out.println("Treadmill started. Begin running!");
            }

            @Override
            public void stop() {
                System.out.println("Treadmill stopped. Workout complete.");
            }
        };

        // Creating a gym member
        GymMember gymMember = new GymMember() {
            @Override
            public void workout() {
                System.out.println("Working out intensively!");
            }

            @Override
            public void rest() {
                System.out.println("Taking a break and resting.");
            }
        };

        // Using a water bottle
        WaterBottle waterBottle = new WaterBottle(500);
        waterBottle.drink();

        // Simulating a workout session
        gymMember.workout();
        treadmill.start();
        gymMember.rest();
        treadmill.stop();
    }
}
