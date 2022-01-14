package com.xiaoju.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 *
 * @author didi
 * @date 2020/11/26
 */
@SpringBootApplication
//@MapperScan("com.xiaoju.framework.mapper")
public class CaseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseServerApplication.class, args);
    }

}
