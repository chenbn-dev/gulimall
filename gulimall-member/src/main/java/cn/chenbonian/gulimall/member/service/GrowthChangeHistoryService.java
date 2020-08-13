package cn.chenbonian.gulimall.member.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
