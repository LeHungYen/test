package services;

import java.util.ArrayList;

import dao.PhieuKiemKhoChiTietDao;
import entities.PhieuKiemKhoChiTiet;
import models.PhieuKiemKhoChiTietModel;
import utils.IoCContainer;

public class PhieuKiemKhoChiTietService {
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<PhieuKiemKhoChiTietModel> _listPhieuKiemKhoChiTietModels = new ArrayList<PhieuKiemKhoChiTietModel>();
	private PhieuKiemKhoChiTietDao _PhieuKiemKhoChiTietDao = (PhieuKiemKhoChiTietDao) ioCContainer.getBean(PhieuKiemKhoChiTietDao.class.toString());
	private PhieuKiemKhoChiTiet _PhieuKiemKhoChiTiet;
	private PhieuKiemKhoChiTietModel _PhieuKiemKhoChiTietModel = (PhieuKiemKhoChiTietModel) IoCContainer.getBean(PhieuKiemKhoChiTietModel.class.toString());;
	private int _stt = 0;

	public static PhieuKiemKhoChiTiet updateDataPhieuKiemKhoChiTietDependOnPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietModel PhieuKiemKhoChiTietModel) {
		PhieuKiemKhoChiTiet PhieuKiemKhoChiTiet = new PhieuKiemKhoChiTiet();
		PhieuKiemKhoChiTiet.setPhieuKiemKho(PhieuKiemKhoChiTietModel.getPhieuKiemKho());
		PhieuKiemKhoChiTiet.setMaKiemKho(PhieuKiemKhoChiTietModel.getMaKiemKho());
		PhieuKiemKhoChiTiet.setSanPhamVaDichVu(PhieuKiemKhoChiTietModel.getSanPhamVaDichVu());
		PhieuKiemKhoChiTiet.setMaDichVu(PhieuKiemKhoChiTietModel.getMaDichVu());
		PhieuKiemKhoChiTiet.setSoLuongTruocKhiKiem(PhieuKiemKhoChiTietModel.getSoLuongTruocKhiKiem());
		PhieuKiemKhoChiTiet.setSoLuongThucTe(PhieuKiemKhoChiTietModel.getSoLuongThucTe());
		PhieuKiemKhoChiTiet.setSoLuongChenhLech(PhieuKiemKhoChiTietModel.getSoLuongChenhLech());
		PhieuKiemKhoChiTiet.setGhiChuLiDoChenhLech(PhieuKiemKhoChiTietModel.getGhiChuLiDoChenhLech());
		return PhieuKiemKhoChiTiet;
	}

	public void them(PhieuKiemKhoChiTietModel PhieuKiemKhoChiTietModel) {
		_PhieuKiemKhoChiTiet = updateDataPhieuKiemKhoChiTietDependOnPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietModel);
		_PhieuKiemKhoChiTietDao.them(_PhieuKiemKhoChiTiet);
		PhieuKiemKhoChiTietModel.setStt(_stt);
		_listPhieuKiemKhoChiTietModels.add(_stt, PhieuKiemKhoChiTietModel);
		_stt++;
	}

	public void sua(PhieuKiemKhoChiTietModel PhieuKiemKhoChiTietModel) {
		_PhieuKiemKhoChiTiet = updateDataPhieuKiemKhoChiTietDependOnPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietModel);
		_PhieuKiemKhoChiTietDao.sua(_PhieuKiemKhoChiTiet);
		int stt = PhieuKiemKhoChiTietModel.getStt();
		_listPhieuKiemKhoChiTietModels.remove(stt);
		_listPhieuKiemKhoChiTietModels.add(stt, PhieuKiemKhoChiTietModel);
	}
	
	public void updateListPhieuKiemKhoChiTietModel() {
		_PhieuKiemKhoChiTietDao.updateListPhieuKiemKhoChiTiet();
		ArrayList<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet = _PhieuKiemKhoChiTietDao.getListPhieuKiemKhoChiTiet();
		for (PhieuKiemKhoChiTiet PhieuKiemKhoChiTiet : listPhieuKiemKhoChiTiet) {
			_PhieuKiemKhoChiTietModel = new PhieuKiemKhoChiTietModel();
			_PhieuKiemKhoChiTietModel.setStt(_stt);
			_PhieuKiemKhoChiTietModel.setPhieuKiemKho(PhieuKiemKhoChiTiet.getPhieuKiemKho());
			_PhieuKiemKhoChiTietModel.setMaKiemKho(PhieuKiemKhoChiTiet.getMaKiemKho());
			_PhieuKiemKhoChiTietModel.setSanPhamVaDichVu(PhieuKiemKhoChiTiet.getSanPhamVaDichVu());
			_PhieuKiemKhoChiTietModel.setMaDichVu(PhieuKiemKhoChiTiet.getMaDichVu());
			_PhieuKiemKhoChiTietModel.setSoLuongTruocKhiKiem(PhieuKiemKhoChiTiet.getSoLuongTruocKhiKiem());
			_PhieuKiemKhoChiTietModel.setSoLuongThucTe(PhieuKiemKhoChiTiet.getSoLuongThucTe());
			_PhieuKiemKhoChiTietModel.setSoLuongChenhLech(PhieuKiemKhoChiTiet.getSoLuongChenhLech());
			_PhieuKiemKhoChiTietModel.setGhiChuLiDoChenhLech(PhieuKiemKhoChiTiet.getGhiChuLiDoChenhLech());
			_listPhieuKiemKhoChiTietModels.add(_PhieuKiemKhoChiTietModel);
			_stt++;
		}

	}

	public ArrayList<PhieuKiemKhoChiTietModel> getListPhieuKiemKhoChiTietModel() {
		return _listPhieuKiemKhoChiTietModels;
	}

}
