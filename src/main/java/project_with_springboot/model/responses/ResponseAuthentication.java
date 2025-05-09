package project_with_springboot.model.responses;

public class ResponseAuthentication extends Response {

  public ResponseAuthentication(String status, int statusCode, String message) {
    super(status, statusCode, message);
  }

}
