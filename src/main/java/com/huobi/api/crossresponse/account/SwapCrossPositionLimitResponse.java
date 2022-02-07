package com.huobi.api.crossresponse.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossPositionLimitResponse {

    private String status;
    private long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("buy_limit")
        private BigDecimal buyLimit;
        @SerializedName("sell_limit")
        private BigDecimal sellLimit;
        private String pair;
        @SerializedName("business_type")
        private String businessType;
        @SerializedName("contract_type")
        private String contractType;
        @SerializedName("lever_rate")
        private Integer leverRate;
        @SerializedName("buy_limit_value")
        private BigDecimal buyLimitValue;
        @SerializedName("sell_limit_value")
        private BigDecimal sellLimitValue;
        @SerializedName("mark_price")
        private BigDecimal markPrice;
        @SerializedName("trade_partition")
        private String tradePartition;
    }
}
