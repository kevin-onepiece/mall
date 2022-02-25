package cn.hk.foo.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author foo
 * @date 2022-02-23 15:37
 * @description
 */
@Configuration
@MapperScan({"cn.hk.foo.mall.mbg.mapper", "cn.hk.foo.mall.dao"})
public class MybatisConfig {
}
