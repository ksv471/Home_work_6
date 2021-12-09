package Home_work_6.Animals;

public class Dog extends Animal {
    private static int count;

    public Dog(String name,  int RunningDist, int SwimmingDist){
        super(name, "Собака", RunningDist, SwimmingDist);
        count++;
    }
    public Dog(String name) {
        super(name, "Собака", 500, 30 );
        count++;
    }
    public static int getCount() {
        return count;
    }
}
