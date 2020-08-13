package cn.chenbonian.gulimall.member.service;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
