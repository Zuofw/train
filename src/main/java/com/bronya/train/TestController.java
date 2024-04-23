package com.bronya.train;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author bronya
 * @create 2024/4/23
 * @since 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

        @RequestMapping("/hello")
        public String hello(){
            return "Hello World!ssds";
        }

}