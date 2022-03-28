package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossOrderInfoResponse {

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private BigDecimal volume;
        private BigDecimal price;
        @SerializedName("order_price_type")
        private String orderPriceType;
        private String direction;
        private String offset;
        @SerializedName("lever_rate")
        private Integer leverRate;
        @SerializedName("order_id")
        private Long orderId;
        @SerializedName("order_id_str")
        private String orderIdStr;
        @SerializedName("client_order_id")
        private Long clientOrderId;
        @SerializedName("created_at")
        private Long createdAt;
        @SerializedName("trade_volume")
        private BigDecimal tradeVolume;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        private BigDecimal fee;
        @SerializedName("trade_avg_price")
        private BigDecimal tradeAvgPrice;
        @SerializedName("margin_asset")
        private String marginAsset;
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        private BigDecimal profit;
        private Integer status;
        @SerializedName("order_type")
        private String orderType;
        @SerializedName("order_source")
        private String orderSource;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("liquidation_type")
        private String liquidationType;
        @SerializedName("canceled_at")
        private Long canceledAt;
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("margin_account")
        private String marginAccount;
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
