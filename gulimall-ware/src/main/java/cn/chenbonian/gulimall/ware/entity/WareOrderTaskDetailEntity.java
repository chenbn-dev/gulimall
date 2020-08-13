package cn.chenbonian.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 库存工作单
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:52:48
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  /** id */
  @TableId private Long id;
  /** sku_id */
  private Long skuId;
  /** sku_name */
  private String skuName;
  /** 购买个数 */
  private Integer skuNum;
  /** 工作单id */
  private Long taskId;
}
