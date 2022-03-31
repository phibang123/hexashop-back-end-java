package com.example.demo.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sanphamschemas")
public class SanPhamDTO {
  private String tenSanPham;

  private Number giaTien;

  private Boolean sale;

  @Field
  private Number phanTramSale = 0;

  @Field
  private Number thanhTien = 0;

  @Field
  private String hinhAnh = "https://img-cdn.2game.vn/2021/02/28/Hutao-va-nhung-dieu-can-biet-khi-co-nang-ra-mat-game-thu-Genshin-Impact-1.jpg";

  private String categories;

  private sanPhamThich luotThich;

  private List<comment> comment;

  private Number soLuong;
}
