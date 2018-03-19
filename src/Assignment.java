import java.time.LocalDateTime;

public class Assignment {
    private LocalDateTime time;
    private int priority;
    //private enum category;
    //private enum course;


    public Assignment(){
        time = LocalDateTime.now();
        priority = 3;
    }

    @Override
    public String toString() {
        return time + " | " + "PRIORITY: " + priority;
    }

    public Assignment(LocalDateTime time, int priority){
        this.time = time;
        this.priority = priority;
    }

    public Assignment copy(){
        Assignment answer = new Assignment(this.time,this.priority);

        return answer;


    }

    





}
