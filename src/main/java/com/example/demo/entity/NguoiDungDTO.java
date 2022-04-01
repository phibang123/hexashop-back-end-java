package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "nguoidungschemas")
public class NguoiDungDTO {


    @NotNull
    @Indexed(unique = true)
    private String taiKhoan;

    @NotNull
    private sex sex;

    private Boolean adminInWeb;

    private String diaChi;

    @NotNull
    @Indexed(unique = true)
    private String email;

    @NotNull
    private String hoTen;

    private String matKhau;

    @NotNull
    @Indexed(unique = true)
    private String soDt;


    private String avatar;

    private List<gioHang> gioHang;

    private List<thich> thich;

}
