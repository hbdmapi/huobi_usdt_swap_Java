package com.huobi.api.crossrequest.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class SwapCrossCancelallRequest {
    private String contractCode;//合约代码	"BTC-USDT"

}