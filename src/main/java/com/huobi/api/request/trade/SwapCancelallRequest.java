package com.huobi.api.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 * 全部撤单
 * 备注
 * 只要有contract_code，则撤销该code的合约
 */
@Data
@AllArgsConstructor
@Builder
public class SwapCancelallRequest {
    private String contractCode;//合约代码	"BTC-USDT"


}
