package cn.chenbonian.gulimall.product.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * sku图片
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:50
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
