package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.DonViChiTiet;
import utils.DB_Connection;

public class DonViChiTietDao {
private static ArrayList<DonViChiTiet> _listDonViChiTiets = new ArrayList<DonViChiTiet>();
	
	public void them(DonViChiTiet donViChiTiet) {
		Session session = new DB_Connection().getSession(DonViChiTiet.class);
		session.beginTransaction();
		session.save(donViChiTiet);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(DonViChiTiet donViChiTiet) {
		Session session = new DB_Connection().getSession(DonViChiTiet.class);
		session.beginTransaction();
		session.update(donViChiTiet);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListDonViChiTiet() {
		Session session = new DB_Connection().getSession(DonViChiTiet.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from DonViChiTiet");
		query.addEntity(DonViChiTiet.class);
		_listDonViChiTiets = (ArrayList<DonViChiTiet>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<DonViChiTiet> getListDonViChiTiet() {
		return _listDonViChiTiets;
	}
	
}
