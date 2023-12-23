package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.CustomerOrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO {
    ArrayList<CustomerOrderDetailDTO> customerOrderDetails() throws SQLException, ClassNotFoundException;
}
