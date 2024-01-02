package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.entity.Customer;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO {
     boolean save(Customer entity) throws SQLException, ClassNotFoundException;

     ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException;

      boolean exist(String id) throws SQLException, ClassNotFoundException;

     boolean delete(String id) throws SQLException, ClassNotFoundException;

     String generateId()throws SQLException, ClassNotFoundException;

     CustomerDTO update(Customer dto) throws SQLException, ClassNotFoundException;
}
