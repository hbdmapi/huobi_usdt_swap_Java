package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class SwapMatchresultsExactResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @Data
    @AllArgsConstructor
    public static class DataBean{
        @SerializedName("remain_size")
        private Integer remainSize;
        @SerializedName("next_id")
        private Long nextId;
        private List<TradesBean> trades;

        @Builder
        @Data
        @AllArgsConstructor
        public static class TradesBean{
            private String id;
            @SerializedName("query_id")
            private Long queryId;
            @SerializedName("match_id")
            private Long matchId;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_account")
            private String marginAccount;
            private String direction;
            private String offset;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_price")
            private BigDecimal tradePrice;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            @SerializedName("create_date")
            private Long createDate;
            @SerializedName("offset_profitloss")
            private BigDecimal offsetProfitloss;
            @SerializedName("real_profit")
            private BigDecimal realProfit;
            @SerializedName("trade_fee")
            private BigDecimal tradeFee;
            private String role;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("order_source")
            private String orderSource;
            private String pair;
            @SerializedName("business_type")
            private String businessType;
            @SerializedName("contract_type")
            private String contractType;
            @SerializedName("trade_partition")
            private String tradePartition;
            @SerializedName("reduce_only")
            private String reduceOnly;
        }
    }
}
