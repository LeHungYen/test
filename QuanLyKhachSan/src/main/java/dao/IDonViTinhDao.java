package dao;

import java.util.ArrayList;

import entities.DonViChiTiet;
import entities.Kho;

public interface IDonViTinhDao {
	public void them(Kho kho);
	public void sua(Kho kho);
	public void updateListKho();
	public ArrayList<Kho> getListKho();
}
