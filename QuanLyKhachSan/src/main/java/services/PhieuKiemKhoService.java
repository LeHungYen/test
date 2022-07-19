package services;

import java.util.ArrayList;

import dao.PhieuKiemKhoDao;
import entities.PhieuKiemKho;
import models.PhieuKiemKhoModel;
import utils.IoCContainer;

public class PhieuKiemKhoService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<PhieuKiemKhoModel> _listPhieuKiemKhoModels = new ArrayList<PhieuKiemKhoModel>();
	private PhieuKiemKhoDao _PhieuKiemKhoDao = (PhieuKiemKhoDao) ioCContainer.getBean(PhieuKiemKhoDao.class.toString());
	private PhieuKiemKho _PhieuKiemKho;
	private PhieuKiemKhoModel _PhieuKiemKhoModel = (PhieuKiemKhoModel) IoCContainer.getBean(PhieuKiemKhoModel.class.toString());;
	private int _stt = 0;

	public static PhieuKiemKho updateDataKiemKhoDependOnKiemKhoModel(PhieuKiemKhoModel PhieuKiemKhoModel) {
		PhieuKiemKho PhieuKiemKho = new PhieuKiemKho();
		PhieuKiemKho.setMaKiemKho(PhieuKiemKhoModel.getMaKiemKho());
		PhieuKiemKho.setNgayKiemKho(PhieuKiemKhoModel.getNgayKiemKho());
		PhieuKiemKho.setNhanVien(PhieuKiemKhoModel.getNhanVien());
		PhieuKiemKho.setMaNV(PhieuKiemKhoModel.getMaNV());
		PhieuKiemKho.setKho(PhieuKiemKhoModel.getKho());
		PhieuKiemKho.setMaKho(PhieuKiemKhoModel.getMaKho());
		PhieuKiemKho.setListPhieuKiemKhoChiTiet(PhieuKiemKhoModel.getListPhieuKiemKhoChiTiet());
		return PhieuKiemKho;
	}

	public void them(PhieuKiemKhoModel PhieuKiemKhoModel) {
		_PhieuKiemKho = updateDataKiemKhoDependOnKiemKhoModel(PhieuKiemKhoModel);
		_PhieuKiemKhoDao.them(_PhieuKiemKho);
		PhieuKiemKhoModel.setStt(_stt);
		_listPhieuKiemKhoModels.add(_stt, PhieuKiemKhoModel);
		_stt++;
	}

	public void sua(PhieuKiemKhoModel PhieuKiemKhoModel) {
		_PhieuKiemKho = updateDataKiemKhoDependOnKiemKhoModel(PhieuKiemKhoModel);
		_PhieuKiemKhoDao.sua(_PhieuKiemKho);
		int stt = PhieuKiemKhoModel.getStt();
		_listPhieuKiemKhoModels.remove(stt);
		_listPhieuKiemKhoModels.add(stt, PhieuKiemKhoModel);
	}
	
	public void updateListPhieuKiemKhoModel() {
		_PhieuKiemKhoDao.updateListPhieuKiemKho();
		ArrayList<PhieuKiemKho> listPhieuKiemKho = _PhieuKiemKhoDao.getListPhieuKiemKho();
		for (PhieuKiemKho PhieuKiemKho : listPhieuKiemKho) {
			_PhieuKiemKhoModel = new PhieuKiemKhoModel();
			_PhieuKiemKhoModel.setStt(_stt);
			_PhieuKiemKhoModel.setMaKiemKho(PhieuKiemKho.getMaKiemKho());
			_PhieuKiemKhoModel.setNgayKiemKho(PhieuKiemKho.getNgayKiemKho());
			_PhieuKiemKhoModel.setNhanVien(PhieuKiemKho.getNhanVien());
			_PhieuKiemKhoModel.setMaNV(PhieuKiemKho.getMaNV());
			_PhieuKiemKhoModel.setKho(PhieuKiemKho.getKho());
			_PhieuKiemKhoModel.setMaKho(PhieuKiemKho.getMaKho());
			_PhieuKiemKhoModel.setListPhieuKiemKhoChiTiet(PhieuKiemKho.getListPhieuKiemKhoChiTiet());
			_listPhieuKiemKhoModels.add(_PhieuKiemKhoModel);
			_stt++;
		}

	}

	public ArrayList<PhieuKiemKhoModel> getListPhieuKiemKhoModel() {
		return _listPhieuKiemKhoModels;
	}

}
