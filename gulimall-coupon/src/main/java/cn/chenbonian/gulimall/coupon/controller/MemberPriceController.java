package cn.chenbonian.gulimall.coupon.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.coupon.entity.MemberPriceEntity;
import cn.chenbonian.gulimall.coupon.service.MemberPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
@RestController
@RequestMapping("/coupon/memberprice")
public class MemberPriceController {
  @Autowired private MemberPriceService memberPriceService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:memberprice:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = memberPriceService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:memberprice:info")
  public R info(@PathVariable("id") Long id) {
    MemberPriceEntity memberPrice = memberPriceService.getById(id);

    return R.ok().put("memberPrice", memberPrice);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:memberprice:save")
  public R save(@RequestBody MemberPriceEntity memberPrice) {
    memberPriceService.save(memberPrice);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:memberprice:update")
  public R update(@RequestBody MemberPriceEntity memberPrice) {
    memberPriceService.updateById(memberPrice);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:memberprice:delete")
  public R delete(@RequestBody Long[] ids) {
    memberPriceService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
