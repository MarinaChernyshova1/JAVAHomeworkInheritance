package ru.netology.javaqa;

public class Epic extends Task {
    private String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;

    }

  //  private Subtasks[] addToArray(Task[] current, Task task) {
        // private Task[] addToArray(Task[] current, Task task) {
   // }
      //  Task[] tmp = new Task[current.length + 1];
    //    for (int i = 0; i < current.length; i++) {
      //      tmp[i] = current[i];
     //   }
      //  tmp[tmp.length - 1] = task;
     //   return tmp;

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }
        }
        return false;
    }


    public String[] getSubtasks() {
        return subtasks;
    }
}
