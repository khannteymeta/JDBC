import controller.CustomerContoller;
import controller.OrderController;
import controller.ProductController;
import model.dao.CustomerImpl;
import model.dao.OrderDaoImpl;
import model.dao.ProductDaoImpl;
import model.dto.CustomerDto;
import model.dto.OrderDto;
import model.dto.ProductDto;
import model.entity.Customer;
import model.entity.Order;
import model.entity.Product;
import view.View;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        CustomerContoller customerContoller = new CustomerContoller();
        ProductController productController = new ProductController();
        OrderController orderController = new OrderController();
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                View.menu();
                System.out.print("\nInsert option : ");
                Integer op = sc.nextInt();
                switch (op){
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.print("\nInput product code : ");
                        String proCode = sc.next();
                        System.out.print("\nInput product name : ");
                        String proName = sc.next();
                        System.out.print("\nInput product description : ");
                        String description = sc.next();

                        boolean isDeleted = false;
                        Date important_at = Date.valueOf(LocalDate.now());
                        Date expired_at = Date.valueOf(LocalDate.of(2030,02,03));
                        productController.addNewProduct(new ProductDto(proName,proCode,false,important_at,expired_at,description));
                        break;

                    case 2:
                        productController.queryAllProduct().forEach(System.out::println);
                        break;

                    case 3:
                        System.out.print("Input id for search : ");
                        Integer id = sc.nextInt();
                        productController.searchProductById(id);
                         break;

                    case 4:
                        System.out.print("Input id for delete : ");
                        Integer _id =sc.nextInt();
                        productController.deletedProductById(_id);
                        break;

                    case 5:
                        System.out.print("Input id to search for update : ");
                        Integer _id1 = sc.nextInt();
                        productController.updateProductById(_id1);

                    case 6:
                        System.out.print("Input customer code  : ");
                        Integer cusCode = sc.nextInt();
                        System.out.print("Input customer name : ");
                        String cusName = sc.nextLine();
                        System.out.print("Input customer email : ");
                        String email = sc.nextLine();
                        System.out.print("Input customer password :");
                        String password = sc.nextLine();

                        boolean is_deleted = false;
                        Date created_date = Date.valueOf(LocalDate.now());
                        customerContoller.addNewCustomer(new CustomerDto(cusCode,cusName,email));
                        break;
                    case 7:
                        customerContoller.queryAllCustomer().forEach(System.out::println);
                        break;
                    case 8:
                        System.out.print("Input id for search : ");
                        Integer cus_id =sc.nextInt();
                        customerContoller.searchCustomerById(cus_id);
                        break;
                    case 9:
                        System.out.print("Input id for delete : ");
                        Integer del_id = sc.nextInt();
                        customerContoller.deleteCustomerById(del_id);
                        break;

                    case 10:
                        System.out.print("Input id to search for update : ");
                        Integer up_id = sc.nextInt();
                        customerContoller.updateCustomerById(up_id);
                        break;
                    case 11:
                        System.out.print("Input order code : ");
                        Integer or_code = sc.nextInt();
                        System.out.print("Input order name : ");
                        String or_name = sc.nextLine();
                        System.out.print("Input order description : ");
                        String or_des = sc.nextLine();

                        System.out.println("Input customer id : ");
                        Integer or_cusId = sc.nextInt();

                        Customer customer = Customer.builder()
                                .id(or_cusId)
                                .build();
                        Date ordered_at = Date.valueOf(LocalDate.now());
                        orderController.addNewOrder(new OrderDto(or_name,or_des,customer,ordered_at));
                        break;
                    case 12:
                        orderController.queryAllOrders().forEach(System.out::println);
                        break;
                    case 13:
                        System.out.print("Input id to search  : ");
                        Integer s_id = sc.nextInt();
                        orderController.searchOrderById(s_id);
                        break;
                    case 14:
                        System.out.print("Input id to delete : ");
                        Integer d_id = sc.nextInt();
                        orderController.deleteOrderById(d_id);
                        break;

                    case 15:
                        System.out.print("Input id to search for update : ");
                        Integer u_id = sc.nextInt();
                        orderController.updateOrderById(u_id);
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

  }
}