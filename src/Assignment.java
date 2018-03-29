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

    public Assignment compareTo(Assignment assign){
        Assignment answer = new Assignment(this.time,this.priority);
        if (answer.time.equals(assign.time)){
            System.out.println("SAME");

        }

        else{
            System.out.println("DIFFERENT");
    }

    return answer;

    }

    public Assignment comeFirst(Assignment assign1, Assignment assign2, Assignment assign3){
        if (assign1.priority > assign2.priority && assign1.priority > assign3.priority) {
            return assign1;
        }
          if (assign2.priority > assign1.priority && assign2.priority > assign3.priority) {
              return assign2;

        }
          if (assign3.priority > assign2.priority && assign3.priority > assign1.priority) {
              return assign1;
}
    }
