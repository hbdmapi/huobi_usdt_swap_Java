package com.huobi.api.request.account;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class SwapMasterSubTransferRequest {
    private Long subUid;//子账号uid
    private String asset;//币种	"USDT"...
    private String fromMarginAccount;//转出的保证金账户	"BTC-USDT"...
    private String toMarginAccount;//转入的保证金账户	"BTC-USDT"...
    private BigDecimal amount;//划转金额
    private String type;//划转类型	master_to_sub：母账户划转到子账户， sub_to_master：子账户划转到母账户

}
