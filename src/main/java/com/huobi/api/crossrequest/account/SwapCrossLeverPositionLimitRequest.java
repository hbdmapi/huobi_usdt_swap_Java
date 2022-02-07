package com.huobi.api.crossrequest.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SwapCrossLeverPositionLimitRequest {
    private String businessType;
    private String contractType;
    private String pair;
    private String contractCode;
    private Integer leverRate;
    private String tradePartition;
}
