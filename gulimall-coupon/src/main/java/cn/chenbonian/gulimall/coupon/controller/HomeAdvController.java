package cn.chenbonian.gulimall.coupon.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.coupon.entity.HomeAdvEntity;
import cn.chenbonian.gulimall.coupon.service.HomeAdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-13 22:13:23
 */
@RestController
@RequestMapping("/coupon/homeadv")
public class HomeAdvController {
  @Autowired private HomeAdvService homeAdvService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("coupon:homeadv:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = homeAdvService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("coupon:homeadv:info")
  public R info(@PathVariable("id") Long id) {
    HomeAdvEntity homeAdv = homeAdvService.getById(id);

    return R.ok().put("homeAdv", homeAdv);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("coupon:homeadv:save")
  public R save(@RequestBody HomeAdvEntity homeAdv) {
    homeAdvService.save(homeAdv);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("coupon:homeadv:update")
  public R update(@RequestBody HomeAdvEntity homeAdv) {
    homeAdvService.updateById(homeAdv);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("coupon:homeadv:delete")
  public R delete(@RequestBody Long[] ids) {
    homeAdvService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
