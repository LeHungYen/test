package services;

import java.util.ArrayList;

import dao.PhieuNhapKhoChiTietDao;
import entities.PhieuNhapKhoChiTiet;
import models.PhieuNhapKhoChiTietModel;
import utils.IoCContainer;

public class PhieuNhapKhoChiTietService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<PhieuNhapKhoChiTietModel> _listPhieuNhapKhoChiTietModels = new ArrayList<PhieuNhapKhoChiTietModel>();
	private PhieuNhapKhoChiTietDao _PhieuNhapKhoChiTietDao = (PhieuNhapKhoChiTietDao) ioCContainer.getBean(PhieuNhapKhoChiTietDao.class.toString());
	private PhieuNhapKhoChiTiet _PhieuNhapKhoChiTiet;
	private PhieuNhapKhoChiTietModel _PhieuNhapKhoChiTietModel = (PhieuNhapKhoChiTietModel) IoCContainer.getBean(PhieuNhapKhoChiTietModel.class.toString());;
	private int _stt = 0;

	public static PhieuNhapKhoChiTiet updateDataPhieuNhapKhoChiTietDependOnPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietModel PhieuNhapKhoChiTietModel) {
		PhieuNhapKhoChiTiet PhieuNhapKhoChiTiet = new PhieuNhapKhoChiTiet();
		PhieuNhapKhoChiTiet.setPhieuNhapKho(PhieuNhapKhoChiTietModel.getPhieuNhapKho());
		PhieuNhapKhoChiTiet.setMaNhap(PhieuNhapKhoChiTietModel.getMaNhap());
		PhieuNhapKhoChiTiet.setSanPhamVaDichVu(PhieuNhapKhoChiTietModel.getSanPhamVaDichVu());
		PhieuNhapKhoChiTiet.setMaDichVu(PhieuNhapKhoChiTietModel.getMaDichVu());
		PhieuNhapKhoChiTiet.setSoLuong(PhieuNhapKhoChiTietModel.getSoLuong());
		PhieuNhapKhoChiTiet.setGiaNhap(PhieuNhapKhoChiTietModel.getGiaNhap());
		PhieuNhapKhoChiTiet.setGhiChu(PhieuNhapKhoChiTietModel.getGhiChu());
		return PhieuNhapKhoChiTiet;
	}

	public void them(PhieuNhapKhoChiTietModel PhieuNhapKhoChiTietModel) {
		_PhieuNhapKhoChiTiet = updateDataPhieuNhapKhoChiTietDependOnPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietModel);
		_PhieuNhapKhoChiTietDao.them(_PhieuNhapKhoChiTiet);
		PhieuNhapKhoChiTietModel.setStt(_stt);
		_listPhieuNhapKhoChiTietModels.add(_stt, PhieuNhapKhoChiTietModel);
		_stt++;
	}

	public void sua(PhieuNhapKhoChiTietModel PhieuNhapKhoChiTietModel) {
		_PhieuNhapKhoChiTiet = updateDataPhieuNhapKhoChiTietDependOnPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietModel);
		_PhieuNhapKhoChiTietDao.sua(_PhieuNhapKhoChiTiet);
		int stt = PhieuNhapKhoChiTietModel.getStt();
		_listPhieuNhapKhoChiTietModels.remove(stt);
		_listPhieuNhapKhoChiTietModels.add(stt, PhieuNhapKhoChiTietModel);
	}
	
	public void updateListPhieuNhapKhoChiTietModel() {
		_PhieuNhapKhoChiTietDao.updateListPhieuNhapKhoChiTiet();
		ArrayList<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet = _PhieuNhapKhoChiTietDao.getListPhieuNhapKhoChiTiet();
		for (PhieuNhapKhoChiTiet PhieuNhapKhoChiTiet : listPhieuNhapKhoChiTiet) {
			_PhieuNhapKhoChiTietModel = new PhieuNhapKhoChiTietModel();
			_PhieuNhapKhoChiTietModel.setStt(_stt);
			_PhieuNhapKhoChiTietModel.setPhieuNhapKho(PhieuNhapKhoChiTiet.getPhieuNhapKho());
			_PhieuNhapKhoChiTietModel.setMaNhap(PhieuNhapKhoChiTiet.getMaNhap());
			_PhieuNhapKhoChiTietModel.setSanPhamVaDichVu(PhieuNhapKhoChiTiet.getSanPhamVaDichVu());
			_PhieuNhapKhoChiTietModel.setMaDichVu(PhieuNhapKhoChiTiet.getMaDichVu());
			_PhieuNhapKhoChiTietModel.setSoLuong(PhieuNhapKhoChiTiet.getSoLuong());
			_PhieuNhapKhoChiTietModel.setGiaNhap(PhieuNhapKhoChiTiet.getGiaNhap());
			_PhieuNhapKhoChiTietModel.setGhiChu(PhieuNhapKhoChiTiet.getGhiChu());
			_listPhieuNhapKhoChiTietModels.add(_PhieuNhapKhoChiTietModel);
			_stt++;
		}

	}

	public ArrayList<PhieuNhapKhoChiTietModel> getListPhieuNhapKhoChiTietModel() {
		return _listPhieuNhapKhoChiTietModels;
	}

}
