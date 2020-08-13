package cn.chenbonian.gulimall.order.dao;

import cn.chenbonian.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {}
