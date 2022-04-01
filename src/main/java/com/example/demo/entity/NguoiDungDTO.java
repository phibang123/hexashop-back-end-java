package com.example.demo.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Data
@Document(collection = "nguoidungschemas")
public class NguoiDungDTO {

    @Id
    private String id;

    @Indexed(unique = true)
    @NotNull(message = "tai khoan must not be null")
    private String taiKhoan;


    private String diaChi;

    @Indexed(unique = true)
    @NotNull(message = "email must not be null")
    private String email;

    @NotNull(message = "ho ten must not be null")
    private String hoTen;

    private String matKhau;

    @NotNull(message = "soDt must not be null")
    @Email(message = "email invalid")
    @Indexed(unique = true)
    private String soDt;

    private String avatar;

    private boolean adminInWeb;


    private List<thichArray> thich;


    private List<giohangArray> gioHang;

    public NguoiDungDTO(String taiKhoan, String diaChi, String email, String hoTen, String matKhau, String soDt, String avatar, boolean adminInWeb, List<thichArray> thich, List<giohangArray> gioHang) {
        this.taiKhoan = taiKhoan;
        this.diaChi = diaChi;
        this.email = email;
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.soDt = soDt;
        this.avatar = avatar;
        this.adminInWeb = adminInWeb;
        this.thich = thich;
        this.gioHang = gioHang;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isAdminInWeb() {
        return adminInWeb;
    }

    public void setAdminInWeb(boolean adminInWeb) {
        this.adminInWeb = adminInWeb;
    }

    public List<thichArray> getThich() {
        return thich;
    }

    public void setThich(List<thichArray> thich) {
        this.thich = thich;
    }

    public List<giohangArray> getGioHang() {
        return gioHang;
    }

    public void setGioHang(List<giohangArray> gioHang) {
        this.gioHang = gioHang;
    }
}
