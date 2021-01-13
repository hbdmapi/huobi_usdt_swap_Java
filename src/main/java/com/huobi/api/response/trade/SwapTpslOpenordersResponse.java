package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class SwapTpslOpenordersResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @Data
    @AllArgsConstructor
    public static class DataBean{
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("current_page")
        private Integer currentPage;
        private List<OrdersBean> orders;

        @Builder
        @Data
        @AllArgsConstructor
        public static class OrdersBean{
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_mode")
            private String marginMode;
            @SerializedName("margin_account")
            private String marginAccount;
            private BigDecimal volume;
            @SerializedName("order_type")
            private Integer orderType;
            @SerializedName("tpsl_order_type")
            private String tpslOrderType;
            private String direction;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("trigger_type")
            private String triggerType;
            @SerializedName("trigger_price")
            private BigDecimal triggerPrice;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("order_price")
            private BigDecimal orderPrice;
            private Integer status;
            @SerializedName("source_order_id")
            private String sourceOrderId;
            @SerializedName("relation_tpsl_order_id")
            private String relationTpslOrderId;
        }
    }
}
