/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.nhanvienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import untils.MysqlDataAccessHelper;

/**
 *
 * @author cdphuc
 */
public class nhanvienDAO {
    

    public static ArrayList<nhanvienDTO> getNhanVien(){

        ArrayList<nhanvienDTO> arr = new ArrayList<nhanvienDTO>();
        String sql = "select * from nhanvien";
        MysqlDataAccessHelper my = new MysqlDataAccessHelper();
      
        try {
            ResultSet rs = my.excuteQuery(sql);
            while(rs.next()){
                nhanvienDTO nv = new nhanvienDTO();
                nv.setMaNV(rs.getInt("id"));
                nv.setTenNhanVien(rs.getString("tennv"));
                nv.setSdt(rs.getString("sdt"));
                nv.setDiaChi(rs.getString("diachi"));
                arr.add(nv);
            }
        } catch (SQLException ex) {
            my.displayError(ex);
        } finally{
            my.close();
        }
        return arr;
    }
}
