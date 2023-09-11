package dev.salted.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.salted.common.utils.PageUtils;
import dev.salted.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author salted
 * @email saltedf@qq.com
 * @date 2023-09-11 15:03:42
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

