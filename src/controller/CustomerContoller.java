package controller;

import model.dto.CustomerDto;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;

import java.util.List;

public class CustomerContoller {
    CustomerService customerService = new CustomerServiceImpl();
    public  void addNewCustomer(CustomerDto customerDto){
        customerService.addNewCustomer(customerDto);
    }
    public List<CustomerDto> queryAllCustomer(){
        return customerService.queryAllCustomers();
    }
    public CustomerDto updateCustomerById(Integer id){
        return customerService.updateCustomerById(id);
    }

    public CustomerDto deleteCustomerById(Integer id){
        return customerService.deleteCustomerById(id);
    }

    public CustomerDto searchCustomerById(Integer id){
        return  customerService.searchCustomerById(id);
    }

}
