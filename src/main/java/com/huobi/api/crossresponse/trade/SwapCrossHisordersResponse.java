package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossHisordersResponse {

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

            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
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
            @SerializedName("margin_asset")
            private String marginAsset;
            private BigDecimal profit;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            private Integer status;
            @SerializedName("order_type")
            private Integer orderType;
            @SerializedName("liquidation_type")
            private String liquidationType;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_frozen")
            private String marginAccount;
            @SerializedName("update_time")
            private Long updateTime;
            @SerializedName("is_tpsl")
            private Integer isTpsl;
            @SerializedName("real_profit")
            private BigDecimal realProfit;
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
