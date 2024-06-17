package model.service;

import model.dto.CustomerDto;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public void addNewCustomer(CustomerDto customerDto) {

    }

    @Override
    public List<CustomerDto> queryAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDto deleteCustomerById(Integer id) {
        return null;
    }

    @Override
    public CustomerDto updateCustomerById(Integer id) {
        return null;
    }

    @Override
    public CustomerDto searchCustomerById(Integer id) {
        return null;
    }
}
