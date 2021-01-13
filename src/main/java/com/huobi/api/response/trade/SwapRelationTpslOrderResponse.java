package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class SwapRelationTpslOrderResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Builder
    @Data
    public static class DataBean{
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("margin_account")
        private String marginAccount;
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
        @SerializedName("margin_frozen")
        private BigDecimal marginFrozen;
        private BigDecimal profit;
        private Integer status;
        @SerializedName("order_type")
        private Integer orderType;
        @SerializedName("order_source")
        private String orderSource;
        @SerializedName("fee_asset")
        private String feeAsset;
        @SerializedName("canceled_at")
        private Long canceledAt;
        @SerializedName("tpsl_order_info")
        private List<TpslOrderInfoBean> tpslOrderInfo;

        @AllArgsConstructor
        @Builder
        @Data
        public static class TpslOrderInfoBean{
            private BigDecimal volume;
            @SerializedName("tpsl_order_type")
            private String tpslOrderType;
            private String direction;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("trigger_type")
            private String triggerType;
            @SerializedName("trigger_price")
            private BigDecimal triggerPrice;
            @SerializedName("order_price")
            private BigDecimal orderPrice;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("order_price_type")
            private String orderPriceType;
            private Integer status;
            @SerializedName("relation_tpsl_order_id")
            private String relationTpslOrderId;
            @SerializedName("canceled_at")
            private Long canceledAt;
            @SerializedName("fail_code")
            private Integer failCode;
            @SerializedName("fail_reason")
            private String failReason;
            @SerializedName("triggered_price")
            private BigDecimal triggeredPrice;
            @SerializedName("relation_order_id")
            private String relationOrderId;
        }


    }
}
