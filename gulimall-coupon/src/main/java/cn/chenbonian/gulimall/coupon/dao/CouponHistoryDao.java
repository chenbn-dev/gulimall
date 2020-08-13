package cn.chenbonian.gulimall.coupon.dao;

import cn.chenbonian.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:24
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
