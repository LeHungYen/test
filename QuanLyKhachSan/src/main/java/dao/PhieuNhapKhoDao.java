package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.PhieuNhapKho;
import utils.DB_Connection;

public class PhieuNhapKhoDao {
private static ArrayList<PhieuNhapKho> _listPhieuNhapKhos = new ArrayList<PhieuNhapKho>();
	
	public void them(PhieuNhapKho phieuNhapKho) {
		Session session = new DB_Connection().getSession(PhieuNhapKho.class);
		session.beginTransaction();
		session.save(phieuNhapKho);
		session.getTransaction().commit();
		session.close();
	}

	public void sua(PhieuNhapKho phieuNhapKho) {
		Session session = new DB_Connection().getSession(PhieuNhapKho.class);
		session.beginTransaction();
		session.update(phieuNhapKho);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListPhieuNhapKho() {
		Session session = new DB_Connection().getSession(PhieuNhapKho.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from PhieuNhapKho");
		query.addEntity(PhieuNhapKho.class);
		_listPhieuNhapKhos = (ArrayList<PhieuNhapKho>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<PhieuNhapKho> getListPhieuNhapKho() {
		return _listPhieuNhapKhos;
	}
}