package cn.chenbonian.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 专题商品
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  /** id */
  @TableId private Long id;
  /** 专题名字 */
  private String name;
  /** 专题id */
  private Long subjectId;
  /** spu_id */
  private Long spuId;
  /** 排序 */
  private Integer sort;
}
