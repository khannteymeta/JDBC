package model.service;

import model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    void addNewCustomer(CustomerDto customerDto);
    List<CustomerDto> queryAllCustomers();
    CustomerDto deleteCustomerById(Integer id);
    CustomerDto updateCustomerById(Integer id);
    CustomerDto searchCustomerById(Integer id);
}
