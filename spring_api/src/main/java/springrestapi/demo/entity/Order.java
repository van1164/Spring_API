package springrestapi.demo.entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
public class Order {
    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private long order_id;

    @Column(nullable = false) // not null
    private long shop_id;

    @Column(nullable = false) // not null
    private long menu_id;

    @Column(length = 10, nullable = false) // 10글자 제한, not null
    private long user_id;

    @Column(nullable = false) // not null
    private String address;

    @Column(nullable = false) // not null
    private long price;

}
