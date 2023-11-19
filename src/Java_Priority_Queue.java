
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import java.util.Comparator;
        import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */
class student {
    private final int id;
    private final String name;
    private final double cgpa;

    public student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    private final PriorityQueue<student> queue = new PriorityQueue<>(
            Comparator.comparing(student::getCGPA).reversed()
                    .thenComparing(student::getName)
                    .thenComparing(student::getID));

    public List<student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });

        List<student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}



public class Java_Priority_Queue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}