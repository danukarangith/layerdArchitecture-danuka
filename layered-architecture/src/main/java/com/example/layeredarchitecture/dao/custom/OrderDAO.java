package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SuperDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderDAO extends SuperDAO {
    String generateNextOrderId() throws SQLException, ClassNotFoundException;

    boolean isExists(String orderId) throws SQLException, ClassNotFoundException;

    boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
