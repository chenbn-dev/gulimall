package cn.chenbonian.gulimall.product.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.product.entity.SpuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
