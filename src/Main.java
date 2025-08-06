class Robot {
    private String name;
    private int batteryLevel;

    public Robot(String name) {
        this.name = name;
        batteryLevel = 100;
    }

    public String getName(String name) {
        return name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void performTask(Task t) {
        if (batteryLevel >= t.getenegergyRequired()) {
            System.out.println("PERFORMING TASK");
            batteryLevel = batteryLevel - t.getenegergyRequired();
            System.out.println("BATTERY REMAINING;" + batteryLevel + "%");

        } else {
            System.out.println("Battery too low.");
        }
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot("Robot");
        Task task1 = new Task("lifting object", 70);
        Task task2 = new Task("Weld panel", 80);
        robot.performTask(task1);
        robot.performTask(task2);

    }
}
