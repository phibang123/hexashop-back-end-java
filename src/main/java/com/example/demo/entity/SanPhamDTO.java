package com.example.demo.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "sanphamschemas")
public class SanPhamDTO {
  @NotNull(message = "ten san pham must not be null")
  private String tenSanPham;

  @NotNull(message = "gia tien must not be null")
  private Number giaTien;

  private boolean sale;

  private Number phanTramSale = 0;

  private Number thanhTien = 0;

  private String hinhAnh = "https://img-cdn.2game.vn/2021/02/28/Hutao-va-nhung-dieu-can-biet-khi-co-nang-ra-mat-game-thu-Genshin-Impact-1.jpg";

  @NotNull(message = "categories must not be null")
  private String categories;

  @Field
  private List<sanPhamThichArray> luotThich;

  @Field
  private List<commentArray> comment;

  private Number soLuong;

  private String moTa = "Sản Phẩm mới";


}
