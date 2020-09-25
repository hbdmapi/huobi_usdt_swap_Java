package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SwapLiquidationOrdersRequest {
    private String contractCode;//合约代码	"BTC-USDT" ...
    private Integer tradeType;//合约代码	"BTC-USDT" ...
    private Integer createDate;//日期	7，90（7天或者90天）
    private Integer pageIndex;//页码,不填默认第1页
    private Integer pageSize;//不填默认20，不得多于50
}
