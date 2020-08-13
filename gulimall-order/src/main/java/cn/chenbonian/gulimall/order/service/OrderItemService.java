package cn.chenbonian.gulimall.order.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:29
 */
public interface OrderItemService extends IService<OrderItemEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
