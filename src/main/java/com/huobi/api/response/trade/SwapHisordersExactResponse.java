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
public class SwapHisordersExactResponse {
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
        private List<OrdersBean> orders;

        @Builder
        @Data
        @AllArgsConstructor
        public static class OrdersBean{
            @SerializedName("query_id")
            private Long queryId;
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
            @SerializedName("lever_rate")
            private Integer leverRate;
            private String direction;
            private String offset;
            private BigDecimal volume;
            private BigDecimal price;
            @SerializedName("create_date")
            private Long createDate;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            private BigDecimal profit;
            @SerializedName("real_profit")
            private BigDecimal realProfit;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            private Integer status;
            @SerializedName("order_type")
            private Integer orderType;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("liquidation_type")
            private String liquidationType;
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
