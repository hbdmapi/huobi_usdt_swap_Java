package com.huobi.api.request.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/*
* 现货-期权合约账户间进行资金的划转
* */

@Data
@AllArgsConstructor
@Builder
public class UsdtSwapTransferRequest {
    private String from;//来源业务线账户，取值：spot(币币)、linear-swap(正向永续合约)	e.g. spot
    private String to;//目标业务线账户，取值：spot(币币)、linear-swap(正向永续合约)	e.g. linear-swap
    private String currency;//币种,支持大小写	e.g. usdt
    private BigDecimal amount;//划转金额
    private String margin_account;//保证金账户	e.g. btc-usdt、eth-usdt
}
