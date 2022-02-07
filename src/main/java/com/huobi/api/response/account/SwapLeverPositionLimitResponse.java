package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class SwapLeverPositionLimitResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    @Builder
    public static class DataBean{
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("trade_partition")
        private String tradePartition;
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("business_type")
        private String businessType;
        @SerializedName("contract_type")
        private String contractType;
        private String pair;
        private List<ListBean> list;

        @AllArgsConstructor
        @Data
        @Builder
        public static class ListBean{
            @SerializedName("lever_rate")
            private Long leverRate;
            @SerializedName("buy_limit_value")
            private BigDecimal buyLimitValue;
            @SerializedName("sell_limit_value")
            private BigDecimal sellLimitValue;
        }
    }
}
