package com.huobi.api.crossrequest.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class SwapCrossUserSettlementRecordsRequest {
    private String marginAccount;
    private Long startTime;
    private Long endTime;
    private Integer pageIndex;
    private Integer pageSize;
}
