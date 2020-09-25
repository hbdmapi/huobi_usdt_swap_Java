package com.huobi.api.request.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class LinearSwapBasisRequest {
    private String contractCode;//	合约代码	如"BTC-USDT"
    private String period;//周期	1min,5min, 15min, 30min, 60min,4hour,1day,1week,1mon
    private String basisPriceType;//基差价格类型，表示在周期内计算基差使用的价格类型， 不填，默认使用开盘价	开盘价：open，收盘价：close，最高价：high，最低价：low，平均价=（最高价+最低价）/2：average
    private Integer size;//基差获取数量，默认 150	[1,2000]
}
