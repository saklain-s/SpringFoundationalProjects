package model;

import java.util.Date;

public class Task {
   public enum status{
        TODO,
        IN_PROGRESS,
        COMPLETED;
    }
    private Long id;
    private String title;
    private String description;
    private status status;
    private Date dueDate;

    public Long getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
