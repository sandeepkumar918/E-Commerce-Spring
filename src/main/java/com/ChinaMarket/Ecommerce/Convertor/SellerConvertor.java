package com.ChinaMarket.Ecommerce.Convertor;

import com.ChinaMarket.Ecommerce.Model.Seller;
import com.ChinaMarket.Ecommerce.RequestDTO.SellerRequestDto;


public class SellerConvertor {

    public static Seller SellerRequestDtoToSeller(SellerRequestDto sellerRequestDto){

        return Seller.builder()
                .name(sellerRequestDto.getName())
                .email(sellerRequestDto.getEmail())
                .mobNo(sellerRequestDto.getMobNo())
                .panNo(sellerRequestDto.getPanNo())
                .build();
    }
}
