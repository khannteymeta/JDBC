package model.dao;

import model.entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl  implements  CustomerDao {
    @Override
    public List<Customer> queryAllCustomers() {
        String sql = """
                SELECT * FROM  "customer"
                """;
        try(Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "meta"
        );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
        ){
            List<Customer> customerList = new ArrayList<>();
            while (resultSet.next()){
                customerList.add(
                      new Customer(
                              resultSet.getInt("id"),
                              resultSet.getString("name"),
                              resultSet.getString("email"),
                              resultSet.getString("password"),
                              resultSet.getBoolean("is_deleted"),
                              resultSet.getDate("created_date")
                      )
                );
            }
            return customerList;
        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        return List.of();
    }

    @Override
    public int updateCustomerById(Integer id) {
        String sql = """
                UPDATE customer 
                SET name = ?, email =?
                WHERE id = ?
                """;
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "meta"
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            Customer customer = searchCustomerById(id);
            if(customer != null){
                System.out.println("[+] Insert name : ");
                preparedStatement.setString(1,new Scanner(System.in).next());
                System.out.println("[+] Insert email : ");
                preparedStatement.setString(2,new Scanner(System.in).next());
                preparedStatement.setInt(3,id);

                int rowAffed = preparedStatement.executeUpdate();
                String message = rowAffed >0? "Update successfully" : "Update failed";
            }
            else{
                System.out.println("customer not found");
            }

        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        return 0;
    }

    @Override
    public int deletedCustomerById(Integer id) {
        String sql = """
                DELETE FROM customer
                WHERE id = ?
                """;
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "meta"
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ){
            Customer customer = searchCustomerById(id);
            preparedStatement.setInt(1,id);
            if(customer == null){
                System.out.println("can not delete");
            }
            else {
                preparedStatement.setInt(1,id);
                int rowAffected = preparedStatement.executeUpdate();
                System.out.println("Deleted successfully");
            }


        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());

        }
        return 0;
    }

    @Override
    public int addNewCustomer(Customer customer) {
        String sql = """
                INSERT INTO "customer" (name,email, password,is_deleted,created_date)
                VALUES (?,?,?,?,?)
                """;
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "meta"
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getPassword());
            preparedStatement.setBoolean(4, customer.getIsDeleted());
            preparedStatement.setDate(5, customer.getCreatedDate());

            int rowAffrected = preparedStatement.executeUpdate();
            if (rowAffrected > 0) {
                System.out.println("customer added successfully");
            } else {
                System.out.println("customer not added successfully");
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return 0;
    }

    @Override
    public Customer searchCustomerById(Integer id) {
        String sql = """
                SELECT * FROM "customer"
                WHERE id = ? 
                """;
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "meta"
                );
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                ){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while(resultSet.next()){
                customer = Customer
                        .builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .email(resultSet.getString("email"))
                        .password(resultSet.getString("password"))
                        .isDeleted(resultSet.getBoolean("is_deleted"))
                        .createdDate(resultSet.getDate("created_date"))

            .build();
            }
            return customer;

        }catch (SQLException sqlException)
        {
            System.out.println(sqlException.getMessage());

        }
        return null;
    }
}
