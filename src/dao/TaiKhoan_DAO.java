package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entities.TaiKhoan;
import entities.TaiKhoanNganHang;

public class TaiKhoan_DAO {
	TaiKhoanNganHang_DAO taiKhoanNganHang_DAO = new TaiKhoanNganHang_DAO();
	public TaiKhoan getTaiKhoan(String tenTaiKhoan) {
		TaiKhoan tk = null;
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stm = null;
		try {
			stm = con.prepareStatement("select * from TaiKhoan where tenTaiKhoan = ?");
			stm.setString(1, tenTaiKhoan);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				String taiKhoan = rs.getString(1);
				String matKhai = rs.getString(2);
				String loaiTaiKhoan = rs.getString(3);
				TaiKhoanNganHang taiKhoanNganHang = taiKhoanNganHang_DAO.getTaiKhoanNganHangTheoSTK(rs.getString(4));
				tk = new TaiKhoan(taiKhoan, matKhai, loaiTaiKhoan, taiKhoanNganHang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tk;
	}
}
