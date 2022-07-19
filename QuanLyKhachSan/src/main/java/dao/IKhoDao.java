package dao;

import java.util.ArrayList;

import entities.DonViTinh;
import entities.Kho;

public interface IKhoDao {
	public void them(Kho Kho);
	public void sua(Kho donViTinh);
	public void updateListKho();
	public ArrayList<Kho> getListKho();
}
