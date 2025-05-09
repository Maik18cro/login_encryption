package project_with_springboot.model.responses;

import project_with_springboot.model.Customers;

import java.util.List;

public class ResponseCustomer extends Response {
    List<Customers> data;

    public ResponseCustomer(String status, int statusCode, String message, List<Customers> customersList) {
        super(status, statusCode, message);
        this.data = customersList;
    }

    public List<Customers> getData() {
        return data;
    }
}
