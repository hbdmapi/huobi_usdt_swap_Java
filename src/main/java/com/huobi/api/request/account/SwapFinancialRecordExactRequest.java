package com.huobi.api.request.account;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class SwapFinancialRecordExactRequest {
    private String marginAccount;
    private String contractCode;
    private String type;
    private Long startTime;
    private Long endTime;
    private Long fromId;
    private Integer size;
    private String direct;
}
