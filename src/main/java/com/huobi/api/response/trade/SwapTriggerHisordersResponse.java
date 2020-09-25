package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapTriggerHisordersResponse {
    /**
     * "status":"ok",
     * "data":{"orders":[{"symbol":"BTC","contract_code":"BTC-USDT","trigger_type":"le","volume":1.000000000000000000,"order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":3732,"order_id_str":"3732","relation_order_id":"-1","order_price_type":"limit","status":6,"order_source":"api","trigger_price":377.000000000000000000,"triggered_price":null,"order_price":377.000000000000000000,"created_at":1600918640191,"triggered_at":null,"order_insert_at":0,"canceled_at":1600918653036,"fail_code":null,"fail_reason":null}],"total_page":3,"current_page":1,"total_size":3},
     * "ts":1601021858599
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {
        /**
         * "orders":[{"symbol":"BTC","contract_code":"BTC-USDT","trigger_type":"le","volume":1.000000000000000000,"order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":3732,"order_id_str":"3732","relation_order_id":"-1","order_price_type":"limit","status":6,"order_source":"api","trigger_price":377.000000000000000000,"triggered_price":null,"order_price":377.000000000000000000,"created_at":1600918640191,"triggered_at":null,"order_insert_at":0,"canceled_at":1600918653036,"fail_code":null,"fail_reason":null}],
         * "total_page":3,
         * "current_page":1,
         * "total_size":3
         */

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
            /**
             * "symbol":"BTC",
             * "contract_code":"BTC-USDT",
             * "trigger_type":"le",
             * "volume":1,
             * "order_type":1,
             * "direction":"buy",
             * "offset":"open",
             * "lever_rate":5,
             * "order_id":3732,
             * "order_id_str":"3732",
             * "relation_order_id":"-1",
             * "order_price_type":"limit",
             * "status":6,
             * "order_source":"api",
             * "trigger_price":377,
             * "triggered_price":null,
             * "order_price":377,
             * "created_at":1600918640191,
             * "triggered_at":null,
             * "order_insert_at":0,
             * "canceled_at":1600918653036,
             * "fail_code":null,
             * "fail_reason":null
             */

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

        }
    }
}
