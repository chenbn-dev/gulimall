package cn.chenbonian.gulimall.ware.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品库存
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:52:48
 */
public interface WareSkuService extends IService<WareSkuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
