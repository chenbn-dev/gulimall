package cn.chenbonian.gulimall.order.dao;

import cn.chenbonian.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:29
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
