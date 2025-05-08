package project_with_springboot.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project_with_springboot.model.Customers;
import project_with_springboot.model.responses.ResponseCustomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomersControlers {

  @GetMapping("/customers")
  public ResponseCustomer getCustomersListV2() {
    final List<Customers> customersList = new ArrayList<>(Arrays.asList(
            new Customers(1, "Juan", "juanito", "1234"),
            new Customers(2, "Pedro", "pedrito", "1234"),
            new Customers(3, "Maria", "maria", "1234"),
            new Customers(4, "Jose", "joseito", "1234"),
            new Customers(5, "Ana", "anita", "1234")
    ));

    return new ResponseCustomer(
            "success",
            200,
            "Customers list",
            customersList
    );
  }
}
