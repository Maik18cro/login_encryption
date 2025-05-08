package project_with_springboot.services;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import project_with_springboot.model.responses.ResponseApiConsumption;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Scanner;

@RestController
public class ApiConsumption {
  @GetMapping("/consult-api")
  public List<ResponseApiConsumption> Api() {
    String url = "https://jsonplaceholder.typicode.com/todos";
    RestTemplate restTemplate = new RestTemplate();
    List<ResponseApiConsumption> response = restTemplate.getForObject(url, List.class);
    return response;
  }
}