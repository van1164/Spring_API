package com.example.demo.src.user;


import com.example.demo.src.user.model.PostUserReq;
import com.example.demo.src.user.model.getCoupons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CopounDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired //readme 참고
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }



    public int CheckCoupon(getCoupons Coupon) {
        String createUserQuery = "select exists(select Copoun_id from Coupon where Coupon_id = ?)";
        Object[] createUserParams = new Object[]{Coupon.getUser_id(), Coupon.getCoupon_idx(), Coupon.getCOUPID()}; // 동적 쿼리의 ?부분에 주입될 값
        this.jdbcTemplate.update(createUserQuery, createUserParams);
        String lastInserIdQuery = "select last_insert_id()";
        return this.jdbcTemplate.queryForObject(lastInserIdQuery, int.class); // 해당 쿼리문의 결과 마지막으로 삽인된 유저의 userIdx번호를 반환한다.
    }


}
