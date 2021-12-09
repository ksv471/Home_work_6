package Home_work_6.Animals;

public class Cat extends Animal{
    private static int count;

    public Cat(String name, int RunningDist, int SwimmingDist){
        super(name, "Кот", RunningDist, SwimmingDist);
        count++;
    }

    public Cat(String name) {
        super(name,  "Кот", 200, 0 );
        count++;
    }

    public static int getCount() {
        return count;
    }
}
