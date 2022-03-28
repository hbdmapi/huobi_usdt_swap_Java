package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapCrossTriggerHisordersResponse {

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {

        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("current_page")
        private Integer currentPage;
        private List<OrdersBean> orders;

        @Data
        @AllArgsConstructor
        @Builder
        public static class OrdersBean {

            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("trigger_type")
            private String triggerType;
            private BigDecimal volume;
            @SerializedName("order_type")
            private Integer orderType;
            private String direction;
            private String offset;
            @SerializedName("lever_rate")
            private Integer leverRate;
            @SerializedName("order_id")
            private BigDecimal orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("relation_order_id")
            private String relationOrderId;
            @SerializedName("order_price_type")
            private String orderPriceType;
            private Integer status;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("trigger_price")
            private BigDecimal triggerPrice;
            @SerializedName("triggered_price")
            private BigDecimal triggeredPrice;
            @SerializedName("order_price")
            private BigDecimal orderPrice;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("triggered_at")
            private Long triggeredAt;
            @SerializedName("order_insert_at")
            private Long orderInsertAt;
            @SerializedName("canceled_at")
            private Long canceledAt;
            @SerializedName("fail_code")
            private Integer failCode;
            @SerializedName("fail_reason")
            private String failReason;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_frozen")
            private String marginAccount;
            @SerializedName("update_time")
            private String updateTime;
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
