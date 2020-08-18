package cn.chenbonian.gulimall.member.feign;

import cn.chenbonian.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 *
 * @author chbn
 * @create 2020-08-18
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

  @RequestMapping("/coupon/coupon/member/list")
  public R membercoupons();
}
