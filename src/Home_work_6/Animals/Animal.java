package Home_work_6.Animals;

public class Animal {
    String name;
    String type;
    private static int count;

    int RunningDist;
    int SwimmingDist;

    public Animal(String name, String type, int RunningDist, int SwimmingDist) {
        this.name = name;
        this.type = type;
        this.RunningDist = RunningDist;
        this.SwimmingDist = SwimmingDist;
        count++;
    }

    public void running(int x) {
        if (RunningDist == 0){
        System.out.printf("%s %s не умеет бегать\n", type, name);
        return;
    }
        if (x < 0) {
            System.out.println("Необходимо ввести положительное число");
            return;
        }

        if(x <= RunningDist) {
            System.out.printf("%s %s пробежал(-а) %d метров\n", type, name, x);
        } else {
            System.out.printf("%s %s не смог пробежать %d метров\n", type, name, x);
        }
    }

    public void swimming(int x) {
        if (RunningDist == 0) {
            System.out.printf("%s %s не умеет плавать\n", type, name);
            return;
        }

        if (x < 0) {
            System.out.println("Необходимо ввести положительное число");
            return;
        }
        if (x <= RunningDist) {
            System.out.printf("%s %s проплыл(-а) %d метров\n",type, name, x);
        } else {
            System.out.printf("%s %s не смог проплыть %d метров \n", type, name, x);
        }
    }
    public static int getCount() {
        return count;
    }
}
