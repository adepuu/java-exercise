package src.main.java.com.adepuu.exercises.session8;
import java.util.ArrayList;
import java.util.List;

public class ListActivity {
    private List<String> storedTasks;

    public ListActivity() {
        storedTasks = new ArrayList<>();
    }

    public void storeTask(String taskDesc){
        storedTasks.add(taskDesc);
    }

    public void viewTask(){
        if(storedTasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (String task : storedTasks) {
                System.out.println(task);
            }
        }
    }

    public void deleteTask(String taskDesc){
        if (storedTasks.contains(taskDesc)){
            storedTasks.remove(taskDesc);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }
}
