package cn.chenbonian.gulimall.ware.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:52:48
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
