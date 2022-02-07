package com.huobi.api.request.trade;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class SwapTpslOpenordersRequest {
    private String contractCode;
    private Integer pageIndex;
    private Integer pageSize;
    private Integer tradeType;
    private String pair;
    private String tradePartition;
}
