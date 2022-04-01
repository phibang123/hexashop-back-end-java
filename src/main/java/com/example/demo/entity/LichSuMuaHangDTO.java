package com.example.demo.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
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

    private String trangThai;

    private Date ngayDat;

    private Number tongTien;

    private Number soTienGiam;

    public LichSuMuaHangDTO(String idNguoiDung, String taiKhoan, String email, String diaChi, String hoTen, String avatar, String soDt, String trangThai, Date ngayDat, Number tongTien, Number soTienGiam) {
        this.idNguoiDung = idNguoiDung;
        this.taiKhoan = taiKhoan;
        this.email = email;
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.avatar = avatar;
        this.soDt = soDt;
        this.trangThai = trangThai;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.soTienGiam = soTienGiam;
    }
}
