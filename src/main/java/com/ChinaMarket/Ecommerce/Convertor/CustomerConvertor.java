package com.ChinaMarket.Ecommerce.Convertor;

import com.ChinaMarket.Ecommerce.Model.Customer;
import com.ChinaMarket.Ecommerce.RequestDTO.CustomerRequestDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerConvertor {

    public static Customer CustomerRequestDtoToCustomer(CustomerRequestDto customerRequestDto){

        return Customer.builder()
                .name(customerRequestDto.getName())
                .age(customerRequestDto.getAge())
                .email(customerRequestDto.getEmail())
                .mobNo(customerRequestDto.getMobNo())
                .build();
    }
}
