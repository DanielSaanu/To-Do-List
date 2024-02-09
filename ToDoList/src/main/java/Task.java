import java.time.LocalDate;
public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    //Constructor
    public Task(String title, String description, LocalDate dueDate)
    {
        this.title=title;
        this.description=description;
        this.dueDate=dueDate;
        this.completed=false;//defaults to not completed
    }

    //getters and setters
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate)
    {
        this.dueDate = dueDate;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(Boolean completed)
    {
        this.completed = completed;
    }

    // Other methods
    public void markAsCompleted()
    {
        this.completed = true;
    }
    public String toString()
    {

        return title+":" +
                "description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", completed=" + completed;
    }
}
