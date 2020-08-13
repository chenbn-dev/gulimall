package cn.chenbonian.gulimall.order.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:28
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
