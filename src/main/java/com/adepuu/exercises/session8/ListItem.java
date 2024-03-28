package src.main.java.com.adepuu.exercises.session8;

import java.util.HashMap;

public class ListItem {
    private HashMap<String, ListActivity> userTasks;

    public ListItem() {
        userTasks = new HashMap<>();
    }

    public void addUserTasks(String userId, ListActivity listActivity) {
        userTasks.put(userId, listActivity);
    }

    public ListActivity getUserTasks(String userId) {
        return userTasks.get(userId);
    }
}
