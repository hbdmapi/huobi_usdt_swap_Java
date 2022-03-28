package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossMatchresultsResponse {

    private DataBean data;
    private String status;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<TradesBean> trades;

        @Data
        @AllArgsConstructor
        public static class TradesBean {

            @SerializedName("match_id")
            private Long matchId;
            private String id;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private Long orderIdStr;
            private String symbol;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("contract_code")
            private String contractCode;
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
            @SerializedName("trade_fee")
            private double tradeFee;
            @SerializedName("fee_asset")
            private String feeAsset;
            private String role;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_frozen")
            private String marginAccount;
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
