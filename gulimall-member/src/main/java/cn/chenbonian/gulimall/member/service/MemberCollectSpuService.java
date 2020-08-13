package cn.chenbonian.gulimall.member.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.member.entity.MemberCollectSpuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
