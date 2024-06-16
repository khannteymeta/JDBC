import model.dao.CustomerImpl;
import model.dao.OrderDaoImpl;
import model.dao.ProductDaoImpl;
import model.entity.Customer;
import model.entity.Order;
import model.entity.Product;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
// insert customer
//        new CustomerImpl().addNewCustomer(new Customer(
//                1,"meta","meta@gmail.com","111",false, Date.valueOf(LocalDate.now())));


// get customer by id
//        new CustomerImpl().queryAllCustomers().stream().filter(e->e.getId().equals(1)).forEach(System.out::println);


//delete customer by id
//          new CustomerImpl().deletedCustomerById(2);

//insert product
//        new ProductDaoImpl().addNewProduct(new Product(
//                2,"coke","123",false,Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.of(20025,9,8)),"product in cambodia")
//        );


// get product  by id
//        new ProductDaoImpl().queryAllProduct().stream().filter(e->e.getId().equals(1)).forEach(System.out::println);



// insert order
//        new OrderDaoImpl().addNewOrder(Order.builder()
//                .id(7)
//                .orderName("grape")
//                .orderDescription("orange type of fruit")
//                .customer(Customer.builder()
//                        .id(3)
//                        .build())
//                        .productList(new ArrayList<>(
//                                List.of(Product.builder()
//                                        .id(4)
//                                        .build())
//                        ))
//                .build());


// getAll order
//        new OrderDaoImpl().queryAllOrders().forEach(System.out::println);


//search order
//        new OrderDaoImpl().searchOrderById(1);

// update order
//      new OrderDaoImpl().updateOrderById(1);



        String menu = """
             
                       ░▒▓█▓▒ ░▒▓███████▓▒░  ░▒▓███████▓▒░    ░▒▓██████▓▒░ \t
                       ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒  ░▒▓█▓▒░░▒▓█▓▒░\t
                       ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒  ░▒▓█▓▒░       \s
                       ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒ ░▒▓███████▓▒░   ░▒▓█▓▒░       \s
                ░▒▓█▓▒░░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒  ░▒▓█▓▒░       \s
                ░▒▓█▓▒░░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒ ░▒▓█▓▒░ ░▒▓█▓▒  ░▒▓█▓▒░░▒▓█▓▒░\s
                 ░▒▓██████▓▒░ ░▒▓███████▓▒░  ░▒▓███████▓▒░    ░▒▓██████▓▒░ \s
                                                                     \s
                                                                      \s
                             
                """;
        System.out.println(menu);
  }

}