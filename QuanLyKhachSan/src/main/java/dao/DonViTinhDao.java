package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.DonViChiTiet;
import entities.DonViTinh;
import utils.DB_Connection;

public class DonViTinhDao {
	private static ArrayList<DonViTinh> _listDonViTinhs = new ArrayList<DonViTinh>();
	public void them(DonViTinh donViTinh) {
		Session session = new DB_Connection().getSession(DonViTinh.class);
		session.beginTransaction();
		session.save(donViTinh);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(DonViTinh donViTinh) {
		Session session = new DB_Connection().getSession(DonViTinh.class);
		session.beginTransaction();
		session.update(donViTinh);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListDonViTinh() {
		Session session = new DB_Connection().getSession(DonViTinh.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from DonViTinh");
		query.addEntity(DonViTinh.class);
		_listDonViTinhs = (ArrayList<DonViTinh>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<DonViTinh> getListDonViTinh() {
		return _listDonViTinhs;
	}
	
}