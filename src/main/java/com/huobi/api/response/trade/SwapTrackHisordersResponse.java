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
public class SwapTrackHisordersResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Builder
    @Data
    public static class DataBean{
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("current_page")
        private Integer currentPage;
        private List<OrdersBean> orders;

        @AllArgsConstructor
        @Builder
        @Data
        public static class OrdersBean{
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            private BigDecimal volume;
            @SerializedName("order_type")
            private Integer orderType;
            private String direction;
            private String offset;
            @SerializedName("lever_rate")
            private Integer leverRate;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("update_time")
            private Long updateTime;
            @SerializedName("order_price_type")
            private String orderPriceType;
            private Integer status;
            @SerializedName("canceled_at")
            private Long canceledAt;
            @SerializedName("fail_code")
            private Integer failCode;
            @SerializedName("fail_reason")
            private String failReason;
            @SerializedName("callback_rate")
            private BigDecimal callbackRate;
            @SerializedName("active_price")
            private BigDecimal activePrice;
            @SerializedName("is_active")
            private Integer isActive;
            @SerializedName("market_limit_price")
            private BigDecimal marketLimitPrice;
            @SerializedName("formula_price")
            private BigDecimal formulaPrice;
            @SerializedName("real_volume")
            private BigDecimal realVolume;
            @SerializedName("triggered_price")
            private BigDecimal triggeredPrice;
            @SerializedName("relation_order_id")
            private String relationOrderId;

        }

    }
}
