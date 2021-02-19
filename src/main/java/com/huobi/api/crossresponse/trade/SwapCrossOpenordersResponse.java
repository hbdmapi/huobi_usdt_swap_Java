package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossOpenordersResponse {

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<OrdersBean> orders;

        @Data
        @AllArgsConstructor
        public static class OrdersBean {
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            private BigDecimal volume;
            private BigDecimal price;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("order_type")
            private Integer orderType;
            private String direction;
            private String offset;
            @SerializedName("lever_rate")
            private Integer leverRate;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private Long orderIdStr;
            @SerializedName("client_order_id")
            private Long clientOrderId;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            private BigDecimal profit;
            private Integer status;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("margin_asset")
            private String marginAsset;
            @SerializedName("liquidation_type")
            private String liquidationType;
            @SerializedName("canceled_at")
            private String canceledAt;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_frozen")
            private String marginAccount;
            @SerializedName("is_tpsl")
            private Integer isTpsl;
            @SerializedName("real_profit")
            private BigDecimal realProfit;
            @SerializedName("update_time")
            private Long updateTime;
        }
    }
}
