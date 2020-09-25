package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapOrderDetailResponse {
    /**
     *
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         *
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("lever_rate")
        private Integer leverRate;
        private String direction;
        private String offset;
        private BigDecimal volume;
        private BigDecimal price;
        @SerializedName("created_at")
        private Long createdAt;
        @SerializedName("canceled_at")
        private Long canceledAt;
        @SerializedName("order_source")
        private String orderSource;
        @SerializedName("order_price_type")
        private String orderPriceType;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        @SerializedName("margin_asset")
        private String marginAsset;
        private BigDecimal profit;
        @SerializedName("instrument_price")
        private BigDecimal instrumentPrice;
        @SerializedName("final_interest")
        private BigDecimal finalInterest;
        @SerializedName("adjust_value")
        private BigDecimal adjustValue;
        private BigDecimal fee;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("liquidation_type")
        private String liquidationType;
        @SerializedName("order_type")
        private Integer orderType;
        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
        @SerializedName("client_order_id")
        private Long clientOrderId;
        @SerializedName("trade_volume")
        private BigDecimal tradeVolume;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        @SerializedName("trade_avg_price")
        private BigDecimal tradeAvgPrice;
        private Integer status;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<TradesBean> trades;

        @Data
        @AllArgsConstructor
        public static class TradesBean {
            /**
             *
             */

            private String id;
            @SerializedName("trade_id")
            private Long tradeId;
            @SerializedName("trade_price")
            private BigDecimal tradePrice;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            @SerializedName("trade_fee")
            private BigDecimal tradeFee;
            private String role;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("fee_asset")
            private String feeAsset;

        }
    }
}
