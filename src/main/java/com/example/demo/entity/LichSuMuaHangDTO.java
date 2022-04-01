package com.example.demo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "lichsumuahangschemas")
public class LichSuMuaHangDTO {

    private String idNguoiDung;

    private String taiKhoan;

    private String email;

    private String diaChi;

    private String hoTen;

    private String avatar;

    private String soDt;

    private sex sex;

    private String trangThai;

    private Date ngayDat;

    private Number tongTien;

    private Number soTienGiam;

    private List<ArrayTongSanPham> tongSanPham;
}
