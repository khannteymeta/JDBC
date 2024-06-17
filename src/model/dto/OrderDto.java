package model.dto;

import model.entity.Customer;

import java.sql.Date;

public record OrderDto(
        String order_name, String order_description, Customer customer, Date ordered_at
        ) {
}
