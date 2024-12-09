package LearnJavaProgramming.solutii_exercitii_recapitulative.ex3;

// Clasa Task
public class Task {
    // Câmpuri
    private String taskName;
    private String priority;
    private String status;
    private boolean completed;

    // Constructor
    public Task(String taskName, String priority, String status, boolean completed) {
        this.taskName = taskName;
        this.priority = priority;
        this.status = status;
        this.completed = completed;
    }

    // Metode getter și setter
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Task [" +
                "taskName='" + taskName + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", completed=" + completed +
                '}';
    }
}
