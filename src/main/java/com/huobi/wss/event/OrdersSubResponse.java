package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class OrdersSubResponse {


    private String op;
    private String topic;
    private long ts;
    private String uid;
    private String symbol;
    @SerializedName("contract_code")
    private String contractCode;
    private BigDecimal volume;
    private BigDecimal price;
    @SerializedName("order_price_type")
    private String orderPriceType;
    private String direction;
    private String offset;
    private int status;
    @SerializedName("order_id")
    private long orderId;
    @SerializedName("order_id_str")
    private String orderIdStr;
    @SerializedName("client_order_id")
    private long clientOrderId;
    @SerializedName("order_source")
    private String orderSource;
    @SerializedName("order_type")
    private int orderType;
    @SerializedName("created_at")
    private long createdAt;
    @SerializedName("trade_volume")
    private BigDecimal tradeVolume;
    @SerializedName("trade_turnover")
    private BigDecimal tradeTurnover;
    private BigDecimal fee;
    @SerializedName("trade_avg_price")
    private BigDecimal tradeAvgPrice;
    @SerializedName("margin_frozen")
    private BigDecimal marginFrozen;
    @SerializedName("margin_asset")
    private String marginAsset;
    private BigDecimal profit;
    @SerializedName("liquidation_type")
    private BigDecimal liquidationType;
    @SerializedName("canceled_at")
    private Long canceledAt;
    @SerializedName("fee_asset")
    private String feeAsset;
    private List<TradeBean> trade;


    @Data
    @AllArgsConstructor
    public static class TradeBean {

        private String id;
        @SerializedName("trade_id")
        private long tradeId;
        @SerializedName("trade_volume")
        private BigDecimal tradeVolume;
        @SerializedName("trade_price")
        private BigDecimal tradePrice;
        @SerializedName("trade_fee")
        private BigDecimal tradeFee;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        @SerializedName("created_at")
        private long createdAt;
        @SerializedName("fee_asset")
        private String feeAsset;
        private String role;

    }
}
