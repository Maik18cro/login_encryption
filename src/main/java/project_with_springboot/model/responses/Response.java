package project_with_springboot.model.responses;

public class Response {
  private String status;
  private int statusCode;
  private String message;

  public Response(String status, int statusCode, String message) {
    this.status = status;
    this.statusCode = statusCode;
    this.message = message;
  }

  public String getStatus() {
      return status;
  }

 public int getStatusCode() {
    return statusCode;
  }

  public String getMessage() {
    return message;
  }
}