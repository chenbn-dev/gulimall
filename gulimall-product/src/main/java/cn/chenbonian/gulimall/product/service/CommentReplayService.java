package cn.chenbonian.gulimall.product.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
