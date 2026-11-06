package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 医疗系统健康检查 / 欢迎接口
 */
@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("system", "医疗健康系统");
        result.put("message", "欢迎使用医疗健康系统 Demo");
        result.put("status", "OK");
        result.put("time", LocalDateTime.now());
        return result;
    }
}
