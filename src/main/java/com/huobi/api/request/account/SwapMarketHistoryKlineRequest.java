package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SwapMarketHistoryKlineRequest {
    private String contractCode;//合约代码	"BTC-USDT" ...
    private String period;//K线类型	1min, 5min, 15min, 30min, 60min,4hour,1day,1week,1mon
    private Integer size;//获取数量，默认150	[1,2000]
    private Integer from;//开始时间戳 10位 单位S
    private Integer to;//结束时间戳 10位 单位S
}
