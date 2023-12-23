package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.CustomerOrderDetailDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public ArrayList<CustomerOrderDetailDTO> customerOrderDetails() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.excecute("SELECT o.oid,c.name,o.date,sum(od.qty * od.unitPrice) " +
                "FROM Orders o " +
                "JOIN Customer c " +
                "ON o.customerID = c.id " +
                "JOIN OrderDetails od " +
                "ON o.oid = od.oid " +
                "GROUP BY o.oid,c.name " +
                "ORDER BY o.oid ASC  ");

        ArrayList<CustomerOrderDetailDTO> customerOrderDetailDTOs = new ArrayList<>();

        while (rst.next()){
            CustomerOrderDetailDTO customerOrderDetailDTO = new CustomerOrderDetailDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            );
            customerOrderDetailDTOs.add(customerOrderDetailDTO);
        }
        return customerOrderDetailDTOs;
        //joinQuery
    }

}
