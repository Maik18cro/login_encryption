package project_with_springboot.model.responses;

public class ResponseApiConsumption {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public ResponseApiConsumption(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public  String getTitle() {
      return title;
    }

    public boolean getCompleted() {
        return completed;
    }

}
