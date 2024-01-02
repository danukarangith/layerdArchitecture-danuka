package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {
     boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException;

     boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException;

     ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;
     public boolean exist(String code) throws SQLException, ClassNotFoundException;
      String generateId() throws SQLException, ClassNotFoundException;
}
