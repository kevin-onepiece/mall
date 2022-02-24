package cn.hk.foo.mall.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author foo
 * @date 2022-02-23 15:37
 * @description
 */
@Configuration
@MapperScan(basePackages = {"cn.hk.foo"}, annotationClass = Mapper.class)
public class MybatisConfig {
}
