package Features;

import java.time.LocalDate;

public class Deadline extends Task{
    public Deadline(String description, String userDate) {
       super(description);
       this.dateToCompleteString = userDate;
    }
    public Deadline(String description, LocalDate userDate, String userTime) {
        super(description);
        this.timeToComplete = userTime;
        this.dateToCompleteLocalDate = userDate;
    }
    public String getType() {
        return "Deadline";
    }
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + this.getTimeToComplete() + ")";
    }
}
