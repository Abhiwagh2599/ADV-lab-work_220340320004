package com.cdac.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("CPI1")
public class CarPartsInventoryimp1 implements CarPartsInventory{

	public void addCarParts(CarParts cp) {
		Connection conn=null;
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			PreparedStatement st=conn.prepareStatement("insert into tbl_carparts(part_no,part_name,car_model,price,quantity)values (?,?,?,?,?) ");
			
			st.setInt(1, cp.getPartNo());
			st.setString(2,cp.getPartName());
			st.setString(3,cp.getCarModel());
			st.setDouble(4, cp.getPrice());
			st.setInt(5, cp.getQuantity());
			
			st.executeUpdate();
			System.out.println("method executed");
			}catch (Exception e) {
				// TODO: handle exception
			}
			finally {
				try{conn.close();}catch (Exception e) {}
			}
	}

	public List<CarParts> getCarParts() {
		// TODO Auto-generated method stub
		return null;
	}

}
