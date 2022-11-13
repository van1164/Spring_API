package com.example.demo.src.user.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // 해당 클래스에 대한 접근자 생성
@Setter // 해당 클래스에 대한 설정자 생성
@AllArgsConstructor // 해당
public class getCoupons {

    private int COUPID;
    private String user_id;
    private String shop_id;
    private int menu_id;
    private String name;
    private int percent;
    private boolean state;
}
