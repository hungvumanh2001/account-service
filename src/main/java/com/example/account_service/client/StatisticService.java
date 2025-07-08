package com.example.account_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.account_service.model.StatisticDTO;

@FeignClient(name = "statistic-service", url = "http://localhost:9082")
public interface StatisticService {
	@PostMapping("/statistic")
    public StatisticDTO add(@RequestBody StatisticDTO statisticDTO);
}
