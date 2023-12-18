package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public String generateNextOrderId() throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");*/

        ResultSet rst = SQLUtil.excecute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");
        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
    }
    @Override
    public boolean isExists(String orderId) throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();

        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `orders` WHERE oid=?");
        stm.setString(1, orderId);*/
        return SQLUtil.excecute("SELECT oid FROM `orders` WHERE oid=?");

       // return stm.executeQuery() != null;
    }
    @Override
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();

        PreparedStatement stm = connection.prepareStatement("INSERT INTO `orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, dto.getOrderId());
        stm.setDate(2, Date.valueOf(dto.getOrderDate()));
        stm.setString(3, dto.getCustomerId());

        return stm.executeUpdate() > 0;*/

       return SQLUtil.excecute("INSERT INTO `orders` (oid, date, customerID) VALUES (?,?,?)");
    }
}
