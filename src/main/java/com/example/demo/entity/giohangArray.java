package com.example.demo.entity;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class giohangArray {
    private String _idSanPham;

    private String tenSanPham;

    private Number soLuong;

    private boolean sale;

    private Number phanTramSale;

    private Number thanhTien;

    private Number giaTien;

    private String hinhAnh;

    private ZonedDateTime ngayThem;
}
