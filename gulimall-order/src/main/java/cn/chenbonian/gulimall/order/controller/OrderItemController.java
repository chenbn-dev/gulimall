package cn.chenbonian.gulimall.order.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.order.entity.OrderItemEntity;
import cn.chenbonian.gulimall.order.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 订单项信息
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:42:29
 */
@RestController
@RequestMapping("/order/orderitem")
public class OrderItemController {
  @Autowired private OrderItemService orderItemService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("order:orderitem:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = orderItemService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("order:orderitem:info")
  public R info(@PathVariable("id") Long id) {
    OrderItemEntity orderItem = orderItemService.getById(id);

    return R.ok().put("orderItem", orderItem);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("order:orderitem:save")
  public R save(@RequestBody OrderItemEntity orderItem) {
    orderItemService.save(orderItem);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("order:orderitem:update")
  public R update(@RequestBody OrderItemEntity orderItem) {
    orderItemService.updateById(orderItem);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("order:orderitem:delete")
  public R delete(@RequestBody Long[] ids) {
    orderItemService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
