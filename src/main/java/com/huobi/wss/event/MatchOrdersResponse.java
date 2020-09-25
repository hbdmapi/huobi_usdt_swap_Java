package com.huobi.wss.event;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
public class MatchOrdersResponse {
    private String op;
    private String topic;
    private Long ts;
    private String uid;
    private String symbol;
    @SerializedName("contract_code")
    private String contractCode;
    private Integer status;
    @SerializedName("order_id")
    private Long orderId;
    @SerializedName("order_id_str")
    private String orderIdStr;
    @SerializedName("client_order_id")
    private Long clientOrderId;
    @SerializedName("order_type")
    private String orderType;
    @SerializedName("trade_volume")
    private BigDecimal tradeVolume;
    private BigDecimal volume;
    private String direction;
    private String offset;
    @SerializedName("lever_rate")
    private Integer leverRate;
    private BigDecimal price;
    @SerializedName("created_at")
    private Long createdAt;
    @SerializedName("order_source")
    private String orderSource;
    @SerializedName("order_price_type")
    private String orderPriceType;
    private List<TradeBean> trade;

    @AllArgsConstructor
    @Data
    public static class TradeBean{
        private String id;
        @SerializedName("trade_id")
        private Long tradeId;
        @SerializedName("trade_price")
        private BigDecimal tradePrice;
        @SerializedName("trade_volume")
        private BigDecimal tradeVolume;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        @SerializedName("created_at")
        private Long createdAt;
        private String role;

    }

}
