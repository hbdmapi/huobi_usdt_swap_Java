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
public class SwapTriggerOpenordersResponse {
    /**
     * "status":"ok",
     * "data":{"orders":[{"symbol":"BTC","contract_code":"BTC-USDT","trigger_type":"le","volume":10.000000000000000000,"order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":3734,"order_id_str":"3734","order_source":"web","trigger_price":10300.000000000000000000,"order_price":10300.000000000000000000,"created_at":1600918851407,"order_price_type":"limit","status":2},{"symbol":"BTC","contract_code":"BTC-USDT","trigger_type":"le","volume":1.000000000000000000,"order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":3733,"order_id_str":"3733","order_source":"api","trigger_price":377.000000000000000000,"order_price":377.000000000000000000,"created_at":1600918780316,"order_price_type":"limit","status":2}],"total_page":1,"current_page":1,"total_size":2},
     * "ts":1601021973968
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {
        /**
         * "orders":[{"symbol":"BTC","contract_code":"BTC-USDT","trigger_type":"le","volume":10.000000000000000000,"order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":3734,"order_id_str":"3734","order_source":"web","trigger_price":10300.000000000000000000,"order_price":10300.000000000000000000,"created_at":1600918851407,"order_price_type":"limit","status":2},{"symbol":"BTC","contract_code":"BTC-USDT","trigger_type":"le","volume":1.000000000000000000,"order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":3733,"order_id_str":"3733","order_source":"api","trigger_price":377.000000000000000000,"order_price":377.000000000000000000,"created_at":1600918780316,"order_price_type":"limit","status":2}],
         * "total_page":1,
         * "current_page":1,
         * "total_size":2
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
             * "order_id":3733,
             * "order_id_str":"3733",
             * "order_source":"api",
             * "trigger_price":377,
             * "order_price":377,
             * "created_at":1600918780316,
             * "order_price_type":"limit",
             * "status":2
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
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("trigger_price")
            private BigDecimal triggerPrice;
            @SerializedName("order_price")
            private BigDecimal orderPrice;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("order_price_type")
            private String orderPriceType;
            private Integer status;

        }

    }
}
