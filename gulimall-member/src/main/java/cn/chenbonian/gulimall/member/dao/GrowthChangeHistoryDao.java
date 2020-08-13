package cn.chenbonian.gulimall.member.dao;

import cn.chenbonian.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:29:09
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {}
