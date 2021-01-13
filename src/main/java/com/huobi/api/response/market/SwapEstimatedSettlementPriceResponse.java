package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class SwapEstimatedSettlementPriceResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Builder
    @Data
    public static class DataBean{
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("estimated_settlement_price")
        private BigDecimal estimatedSettlementPrice;
        @SerializedName("settlement_type")
        private String settlementType;
    }
}
