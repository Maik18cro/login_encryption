package project_with_springboot.controlers;

import org.springframework.web.bind.annotation.*;
import project_with_springboot.model.responses.Response;


@RestController
public class Main {

  @GetMapping("/")
  public String mainPage() {
    return ("<h1>Bienvenido a la API de Palindromos</h1>" +
            "<p>Para comprobar si una palabra es un palíndromo, utiliza la siguiente ruta:</p>" +
            "<p>/palindrome/{nombre}</p>" +
            "<p>Ejemplo: /palindrome/ana</p>");
  }

  @PostMapping("/")
  public String[] mainPagePost(@RequestParam String name, @RequestParam String lastName) {
    final String[] nameArray = {name, lastName};
    return nameArray;
  }

  @PostMapping("/register")
  public Response registerUser() {

    return new Response(
            "success",
            200,
            "User registered successfully"
    );
  }


}











