/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;

import DAO.nhanvienDAO;
import DTO.nhanvienDTO;
import java.util.ArrayList;

/**
 *
 * @author cdphuc
 */
public class nhanvienBUS {

    public static ArrayList<nhanvienDTO> getNhanVien(){
        return nhanvienDAO.getNhanVien();
    }
    public static ArrayList<nhanvienDTO> timKiemNhanVien(String tennv){
        ArrayList<nhanvienDTO> temp=new ArrayList<>();
        ArrayList<nhanvienDTO> nv = getNhanVien();
        for (int i = 0; i < nv.size(); i++) {
            if(nv.get(i).getTenNhanVien().toLowerCase().contains(tennv.toLowerCase())){
               
                temp.add(nv.get(i));
            }
        }
        if(temp.size()!=0){
            return temp;
        }
         for (int i = 0; i < nv.size(); i++) {
            if(nv.get(i).getSdt().toLowerCase().contains(tennv.toLowerCase())){
                
                temp.add(nv.get(i));
            }
        }
        if(temp.size()!=0){
            return temp;
        }
        for (int i = 0; i < nv.size(); i++) {
            if(nv.get(i).getDiaChi().toLowerCase().contains(tennv.toLowerCase())){
                
                temp.add(nv.get(i));
            }
        }
        if(temp.size()!=0){
            return temp;
        }else return null;
    }
   

}
