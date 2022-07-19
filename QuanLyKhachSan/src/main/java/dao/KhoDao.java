package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Kho;
import entities.NhanVien;
import utils.DB_Connection;

public class KhoDao implements IKhoDao{
	private ArrayList<Kho> _listKhos = new ArrayList<Kho>();
	public void them(Kho kho) {
//		Session session = new DB_Connection().getSession(Kho.class);
//		session.beginTransaction();
//		session.save(kho);
//		session.getTransaction().commit();
//		session.close();
		
		Session session = new DB_Connection().getSession(Kho.class);
		session.beginTransaction();
		session.save(kho);
		session.getTransaction().commit();
		session.close();
		
		
//		Configuration configuration = new Configuration().configure().addAnnotatedClass(Kho.class);
//		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(kho);
//		session.getTransaction().commit();
//		session.close();
	}

	public void sua(Kho kho) {
		Session session = new DB_Connection().getSession(Kho.class);
		session.beginTransaction();
		session.update(kho);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListKho() {
		Session session = new DB_Connection().getSession(Kho.class);
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from Kho");
		query.addEntity(Kho.class);
		_listKhos = (ArrayList<Kho>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<Kho> getListKho() {
		return _listKhos;
	}
	
	public static void main(String[] args) {
		KhoDao khoDao = new KhoDao();
		Kho kho = new Kho();
		khoDao.them(kho);
	}
}