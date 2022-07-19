package services;

import java.util.ArrayList;

import dao.SanPhamVaDichVuDao;
import dao.SanPhamVaDichVuDao;
import entities.SanPhamVaDichVu;
import entities.SanPhamVaDichVu;
import utils.IoCContainer;
import models.SanPhamVaDichVuModel;
import models.SanPhamVaDichVuModel;
public class SanPhamVaDichVuService implements ISanPhamVaDichVuService{
	private IoCContainer ioCContainer = new IoCContainer();
	private ArrayList<SanPhamVaDichVuModel> _listSanPhamVaDichVuModels = new ArrayList<SanPhamVaDichVuModel>();
	private SanPhamVaDichVuDao _SanPhamVaDichVuDao = (SanPhamVaDichVuDao) ioCContainer.getBean(SanPhamVaDichVuDao.class.toString());
	private SanPhamVaDichVu _SanPhamVaDichVu;
	private SanPhamVaDichVuModel _SanPhamVaDichVuModel = (SanPhamVaDichVuModel) IoCContainer.getBean(SanPhamVaDichVuModel.class.toString());;
	private int _stt = 0;

	public static SanPhamVaDichVu updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(SanPhamVaDichVuModel SanPhamVaDichVuModel) {
		SanPhamVaDichVu SanPhamVaDichVu = new SanPhamVaDichVu();
		SanPhamVaDichVu.setMaDichVu(SanPhamVaDichVuModel.getMaDichVu());
		SanPhamVaDichVu.setTenHangHoa(SanPhamVaDichVuModel.getTenHangHoa());
		SanPhamVaDichVu.setNhomSPVaDichVu(SanPhamVaDichVuModel.getNhomSPVaDichVu());
		SanPhamVaDichVu.setMaNhomSp(SanPhamVaDichVuModel.getMaNhomSp());
		SanPhamVaDichVu.setSoLuongTon(SanPhamVaDichVuModel.getSoLuongTon());
		SanPhamVaDichVu.setGiaVon(SanPhamVaDichVuModel.getGiaVon());
		SanPhamVaDichVu.setKho(SanPhamVaDichVuModel.getKho());
		SanPhamVaDichVu.setMaKho(SanPhamVaDichVuModel.getMaKho());
		SanPhamVaDichVu.setTrangThai(SanPhamVaDichVuModel.getTrangThai());
		SanPhamVaDichVu.setListDonViChiTiet(SanPhamVaDichVuModel.getListDonViChiTiet());
		SanPhamVaDichVu.setListPhieuKiemKhoChiTiet(SanPhamVaDichVuModel.getListPhieuKiemKhoChiTiet());
		SanPhamVaDichVu.setListDichVuPhong(SanPhamVaDichVuModel.getListDichVuPhong());
		SanPhamVaDichVu.setListPhieuNhapKhoChiTiet(SanPhamVaDichVuModel.getListPhieuNhapKhoChiTiet());
		return SanPhamVaDichVu;
	}

	public void them(SanPhamVaDichVuModel SanPhamVaDichVuModel) {
		_SanPhamVaDichVu = updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(SanPhamVaDichVuModel);
		_SanPhamVaDichVuDao.them(_SanPhamVaDichVu);
		SanPhamVaDichVuModel.setStt(_stt);
		_listSanPhamVaDichVuModels.add(_stt, SanPhamVaDichVuModel);
		_stt++;
	}

	public void sua(SanPhamVaDichVuModel SanPhamVaDichVuModel) {
		_SanPhamVaDichVu = updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(SanPhamVaDichVuModel);
		_SanPhamVaDichVuDao.sua(_SanPhamVaDichVu);
		int stt = SanPhamVaDichVuModel.getStt();
		_listSanPhamVaDichVuModels.remove(stt);
		_listSanPhamVaDichVuModels.add(stt, SanPhamVaDichVuModel);
	}
	
	public void updateListSanPhamVaDichVuModel() {
		_SanPhamVaDichVuDao.updateListSanPhamVaDichVu();
		ArrayList<SanPhamVaDichVu> listSanPhamVaDichVu = _SanPhamVaDichVuDao.getListSanPhamVaDichVu();
		for (SanPhamVaDichVu SanPhamVaDichVu : listSanPhamVaDichVu) {
			_SanPhamVaDichVuModel = new SanPhamVaDichVuModel();
			_SanPhamVaDichVuModel.setStt(_stt);
			_SanPhamVaDichVuModel.setMaDichVu(SanPhamVaDichVu.getMaDichVu());
			_SanPhamVaDichVuModel.setTenHangHoa(SanPhamVaDichVu.getTenHangHoa());
			_SanPhamVaDichVuModel.setNhomSPVaDichVu(SanPhamVaDichVu.getNhomSPVaDichVu());
			_SanPhamVaDichVuModel.setMaNhomSp(SanPhamVaDichVu.getMaNhomSp());
			_SanPhamVaDichVuModel.setSoLuongTon(SanPhamVaDichVu.getSoLuongTon());
			_SanPhamVaDichVuModel.setGiaVon(SanPhamVaDichVu.getGiaVon());
			_SanPhamVaDichVuModel.setKho(SanPhamVaDichVu.getKho());
			_SanPhamVaDichVuModel.setMaKho(SanPhamVaDichVu.getMaKho());
			_SanPhamVaDichVuModel.setTrangThai(SanPhamVaDichVu.getTrangThai());
			_SanPhamVaDichVuModel.setListDonViChiTiet(SanPhamVaDichVu.getListDonViChiTiet());
			_SanPhamVaDichVuModel.setListPhieuKiemKhoChiTiet(SanPhamVaDichVu.getListPhieuKiemKhoChiTiet());
			_SanPhamVaDichVuModel.setListDichVuPhong(SanPhamVaDichVu.getListDichVuPhong());
			_SanPhamVaDichVuModel.setListPhieuNhapKhoChiTiet(SanPhamVaDichVu.getListPhieuNhapKhoChiTiet());
			_listSanPhamVaDichVuModels.add(_SanPhamVaDichVuModel);
			_stt++;
		}

	}

	public ArrayList<SanPhamVaDichVuModel> getListSanPhamVaDichVuModel() {
		return _listSanPhamVaDichVuModels;
	}

}
