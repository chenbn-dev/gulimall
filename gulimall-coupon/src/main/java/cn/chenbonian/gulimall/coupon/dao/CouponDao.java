package cn.chenbonian.gulimall.coupon.dao;

import cn.chenbonian.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {}
