package cn.chenbonian.gulimall.product.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:50
 */
public interface AttrService extends IService<AttrEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
