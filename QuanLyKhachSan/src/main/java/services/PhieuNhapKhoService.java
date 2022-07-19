package services;

import java.util.ArrayList;

import dao.PhieuNhapKhoDao;
import entities.PhieuNhapKho;
import models.PhieuNhapKhoModel;
import utils.IoCContainer;

public class PhieuNhapKhoService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<PhieuNhapKhoModel> _listPhieuNhapKhoModels = new ArrayList<PhieuNhapKhoModel>();
	private PhieuNhapKhoDao _PhieuNhapKhoDao = (PhieuNhapKhoDao) ioCContainer.getBean(PhieuNhapKhoDao.class.toString());
	private PhieuNhapKho _PhieuNhapKho;
	private PhieuNhapKhoModel _PhieuNhapKhoModel = (PhieuNhapKhoModel) IoCContainer.getBean(PhieuNhapKhoModel.class.toString());;
	private int _stt = 0;

	public static PhieuNhapKho updateDataNhapDependOnNhapModel(PhieuNhapKhoModel PhieuNhapKhoModel) {
		PhieuNhapKho PhieuNhapKho = new PhieuNhapKho();
		PhieuNhapKho.setMaNhap(PhieuNhapKhoModel.getMaNhap());
		PhieuNhapKho.setGhiChu(PhieuNhapKhoModel.getGhiChu());
		PhieuNhapKho.setNgayNhap(PhieuNhapKhoModel.getNgayNhap());
		PhieuNhapKho.setTinhTrang(PhieuNhapKhoModel.getTinhTrang());
		PhieuNhapKho.setNhanVien(PhieuNhapKhoModel.getNhanVien());
		PhieuNhapKho.setMaNV(PhieuNhapKhoModel.getMaNV());
		PhieuNhapKho.setGiamGia(PhieuNhapKhoModel.getGiamGia());
		PhieuNhapKho.setVat(PhieuNhapKhoModel.getVat());
		PhieuNhapKho.setPhiShip(PhieuNhapKhoModel.getPhiShip());
		PhieuNhapKho.setListPhieuNhapKhoChiTiet(PhieuNhapKhoModel.getListPhieuNhapKhoChiTiet());
		return PhieuNhapKho;
	}

	public void them(PhieuNhapKhoModel PhieuNhapKhoModel) {
		_PhieuNhapKho = updateDataNhapDependOnNhapModel(PhieuNhapKhoModel);
		_PhieuNhapKhoDao.them(_PhieuNhapKho);
		PhieuNhapKhoModel.setStt(_stt);
		_listPhieuNhapKhoModels.add(_stt, PhieuNhapKhoModel);
		_stt++;
	}

	public void sua(PhieuNhapKhoModel PhieuNhapKhoModel) {
		_PhieuNhapKho = updateDataNhapDependOnNhapModel(PhieuNhapKhoModel);
		_PhieuNhapKhoDao.sua(_PhieuNhapKho);
		int stt = PhieuNhapKhoModel.getStt();
		_listPhieuNhapKhoModels.remove(stt);
		_listPhieuNhapKhoModels.add(stt, PhieuNhapKhoModel);
	}
	
	public void updateListPhieuNhapKhoModel() {
		_PhieuNhapKhoDao.updateListPhieuNhapKho();
		ArrayList<PhieuNhapKho> listPhieuNhapKho = _PhieuNhapKhoDao.getListPhieuNhapKho();
		for (PhieuNhapKho PhieuNhapKho : listPhieuNhapKho) {
			_PhieuNhapKhoModel = new PhieuNhapKhoModel();
			_PhieuNhapKhoModel.setStt(_stt);
			_PhieuNhapKhoModel.setMaNhap(PhieuNhapKho.getMaNhap());
			_PhieuNhapKhoModel.setGhiChu(PhieuNhapKho.getGhiChu());
			_PhieuNhapKhoModel.setNgayNhap(PhieuNhapKho.getNgayNhap());
			_PhieuNhapKhoModel.setTinhTrang(PhieuNhapKho.getTinhTrang());
			_PhieuNhapKhoModel.setNhanVien(PhieuNhapKho.getNhanVien());
			_PhieuNhapKhoModel.setMaNV(PhieuNhapKho.getMaNV());
			_PhieuNhapKhoModel.setGiamGia(PhieuNhapKho.getGiamGia());
			_PhieuNhapKhoModel.setVat(PhieuNhapKho.getVat());
			_PhieuNhapKhoModel.setPhiShip(PhieuNhapKho.getPhiShip());
			_PhieuNhapKhoModel.setListPhieuNhapKhoChiTiet(PhieuNhapKho.getListPhieuNhapKhoChiTiet());
			_listPhieuNhapKhoModels.add(_PhieuNhapKhoModel);
			_stt++;
		}

	}

	public ArrayList<PhieuNhapKhoModel> getListPhieuNhapKhoModel() {
		return _listPhieuNhapKhoModels;
	}

}
