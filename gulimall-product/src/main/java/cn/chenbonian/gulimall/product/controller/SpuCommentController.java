package cn.chenbonian.gulimall.product.controller;

import cn.chenbonian.common.utils.PageUtils;
import cn.chenbonian.common.utils.R;
import cn.chenbonian.gulimall.product.entity.SpuCommentEntity;
import cn.chenbonian.gulimall.product.service.SpuCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 商品评价
 *
 * @author chenbonian
 * @email 284049379@qq.com
 * @date 2020-08-11 23:38:49
 */
@RestController
@RequestMapping("/porduct/spucomment")
public class SpuCommentController {
  @Autowired private SpuCommentService spuCommentService;

  /** 列表 */
  @RequestMapping("/list")
  // @RequiresPermissions("porduct:spucomment:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = spuCommentService.queryPage(params);

    return R.ok().put("page", page);
  }

  /** 信息 */
  @RequestMapping("/info/{id}")
  // @RequiresPermissions("porduct:spucomment:info")
  public R info(@PathVariable("id") Long id) {
    SpuCommentEntity spuComment = spuCommentService.getById(id);

    return R.ok().put("spuComment", spuComment);
  }

  /** 保存 */
  @RequestMapping("/save")
  // @RequiresPermissions("porduct:spucomment:save")
  public R save(@RequestBody SpuCommentEntity spuComment) {
    spuCommentService.save(spuComment);

    return R.ok();
  }

  /** 修改 */
  @RequestMapping("/update")
  // @RequiresPermissions("porduct:spucomment:update")
  public R update(@RequestBody SpuCommentEntity spuComment) {
    spuCommentService.updateById(spuComment);

    return R.ok();
  }

  /** 删除 */
  @RequestMapping("/delete")
  // @RequiresPermissions("porduct:spucomment:delete")
  public R delete(@RequestBody Long[] ids) {
    spuCommentService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }
}
