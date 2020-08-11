package cn.chenbonian.gulimall.product.dao;

import cn.chenbonian.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {}
