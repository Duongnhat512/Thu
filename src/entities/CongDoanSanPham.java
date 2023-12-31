package entities;

import java.util.Objects;

public class CongDoanSanPham {
	private String idCongDoan;
	private String tenCongDoan;
	private double luongCongDoan;
	private SanPham sanPham;
	private String thiTuUuTien;
	public CongDoanSanPham(String idCongDoan, String tenCongDoan, double luongCongDoan, SanPham sanPham,
			String thiTuUuTien) {
		super();
		this.idCongDoan = idCongDoan;
		this.tenCongDoan = tenCongDoan;
		this.luongCongDoan = luongCongDoan;
		this.sanPham = sanPham;
		this.thiTuUuTien = thiTuUuTien;
	}
	public CongDoanSanPham() {
		super();
	}
	public String getIdCongDoan() {
		return idCongDoan;
	}
	public void setIdCongDoan(String idCongDoan) {
		this.idCongDoan = idCongDoan;
	}
	public String getTenCongDoan() {
		return tenCongDoan;
	}
	public void setTenCongDoan(String tenCongDoan) {
		this.tenCongDoan = tenCongDoan;
	}
	public double getLuongCongDoan() {
		return luongCongDoan;
	}
	public void setLuongCongDoan(double luongCongDoan) {
		this.luongCongDoan = luongCongDoan;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public String getThiTuUuTien() {
		return thiTuUuTien;
	}
	public void setThiTuUuTien(String thiTuUuTien) {
		this.thiTuUuTien = thiTuUuTien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idCongDoan);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CongDoanSanPham other = (CongDoanSanPham) obj;
		return Objects.equals(idCongDoan, other.idCongDoan);
	}
	
}
