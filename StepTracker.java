public class StepTracker {
    private int steps;
    private int days;
    private int activeDays;
    private int minSteps;

    public StepTracker(int minSteps){
        this.minSteps = minSteps;
    }

    public int activeDays(){
        return activeDays;
    }

    public Double averageSteps(){
        if (days == 0) return 0.0;
        return (double) steps / days;
    }

    public void addDailySteps(int steps){
        days++;
        this.steps += steps;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

}
