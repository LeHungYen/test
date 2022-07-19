package services;

import java.util.ArrayList;

import dao.NhomSPVaDichVuDao;
import entities.NhomSPVaDichVu;
import models.NhomSPVaDichVuModel;
import utils.IoCContainer;

public class NhomSPVaDichVuService implements INhomSPvaDichVuService{
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<NhomSPVaDichVuModel> _listNhomSPVaDichVuModels = new ArrayList<NhomSPVaDichVuModel>();
	private NhomSPVaDichVuDao _NhomSPVaDichVuDao = (NhomSPVaDichVuDao) ioCContainer.getBean(NhomSPVaDichVuDao.class.toString());
	private NhomSPVaDichVu _NhomSPVaDichVu;
	private NhomSPVaDichVuModel _NhomSPVaDichVuModel = (NhomSPVaDichVuModel) IoCContainer.getBean(NhomSPVaDichVuModel.class.toString());;
	private int _stt = 0;

	public static NhomSPVaDichVu updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		NhomSPVaDichVu NhomSPVaDichVu = new NhomSPVaDichVu();
		NhomSPVaDichVu.setMaNhomSP(NhomSPVaDichVuModel.getMaNhomSP());
		NhomSPVaDichVu.setTenNhomSP(NhomSPVaDichVuModel.getTenNhomSP());
		NhomSPVaDichVu.setNhomHangHoa(NhomSPVaDichVuModel.getNhomHangHoa());
		NhomSPVaDichVu.setGhiChu(NhomSPVaDichVuModel.getGhiChu());
		NhomSPVaDichVu.setTrangThai(NhomSPVaDichVuModel.getTrangThai());
		NhomSPVaDichVu.setListSanPhamVaDichVu(NhomSPVaDichVuModel.getListSanPhamVaDichVu());
		return NhomSPVaDichVu;
	}

	public void them(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		_NhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel);
		_NhomSPVaDichVuDao.them(_NhomSPVaDichVu);
		NhomSPVaDichVuModel.setStt(_stt);
		_listNhomSPVaDichVuModels.add(_stt, NhomSPVaDichVuModel);
		_stt++;
	}

	public void sua(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		_NhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel);
		_NhomSPVaDichVuDao.sua(_NhomSPVaDichVu);
		int stt = NhomSPVaDichVuModel.getStt();
		_listNhomSPVaDichVuModels.remove(stt);
		_listNhomSPVaDichVuModels.add(stt, NhomSPVaDichVuModel);
	}
	
	public void updateListNhomSPVaDichVuModel() {
		_NhomSPVaDichVuDao.updateListNhomSPVaDichVu();
		ArrayList<NhomSPVaDichVu> listNhomSPVaDichVu = _NhomSPVaDichVuDao.getListNhomSPVaDichVu();
		for (NhomSPVaDichVu NhomSPVaDichVu : listNhomSPVaDichVu) {
			_NhomSPVaDichVuModel = new NhomSPVaDichVuModel();
			_NhomSPVaDichVuModel.setStt(_stt);
			_NhomSPVaDichVuModel.setMaNhomSP(NhomSPVaDichVu.getMaNhomSP());
			_NhomSPVaDichVuModel.setTenNhomSP(NhomSPVaDichVu.getTenNhomSP());
			_NhomSPVaDichVuModel.setNhomHangHoa(NhomSPVaDichVu.getNhomHangHoa());
			_NhomSPVaDichVuModel.setGhiChu(NhomSPVaDichVu.getGhiChu());
			_NhomSPVaDichVuModel.setTrangThai(NhomSPVaDichVu.getTrangThai());
			_NhomSPVaDichVuModel.setListSanPhamVaDichVu(NhomSPVaDichVu.getListSanPhamVaDichVu());
			_listNhomSPVaDichVuModels.add(_NhomSPVaDichVuModel);
			_stt++;
		}

	}

	public ArrayList<NhomSPVaDichVuModel> getListNhomSPVaDichVuModel() {
		return _listNhomSPVaDichVuModels;
	}
	
	public static void main(String[] args) {
		NhomSPVaDichVuService nhomSPVaDichVuService = new NhomSPVaDichVuService();
		NhomSPVaDichVuModel nhomSPVaDichVuModel = new NhomSPVaDichVuModel();
		nhomSPVaDichVuService.them(nhomSPVaDichVuModel);
	}

}
