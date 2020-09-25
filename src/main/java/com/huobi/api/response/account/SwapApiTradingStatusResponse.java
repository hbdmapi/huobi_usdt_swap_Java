package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import sun.rmi.runtime.Log;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapApiTradingStatusResponse {

    /**
     * "status":"ok",
     * "ts":1601013022262
     * "data":{"is_disable":0,"order_price_types":"","disable_reason":"","disable_interval":0,"recovery_time":0,"COR":{"orders_threshold":3,"orders":0,"invalid_cancel_orders":0,"cancel_ratio_threshold":0.100000000000000000,"cancel_ratio":0,"is_trigger":0,"is_active":1},"TDN":{"disables_threshold":2,"disables":0,"is_trigger":0,"is_active":1}}
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {
        /**
         * "is_disable": 0,
         * "order_price_types": "",
         * "disable_reason": "",
         * "disable_interval": 0,
         * "recovery_time": 0,
         * "COR":{"orders_threshold":3,"orders":0,"invalid_cancel_orders":0,"cancel_ratio_threshold":0.100000000000000000,"cancel_ratio":0,"is_trigger":0,"is_active":1}
         * "TDN":{"disables_threshold":2,"disables":0,"is_trigger":0,"is_active":1}
         */

        @SerializedName("is_disable")
        private Integer isDisable;
        @SerializedName("order_price_types")
        private String orderPriceTypes;
        @SerializedName("disable_reason")
        private String DisableReason;
        @SerializedName("disable_interval")
        private Long disableInterval;
        @SerializedName("recovery_time")
        private Long recoveryTime;
        @SerializedName("COR")
        private List<CORBean> cor;
        @SerializedName("TDN")
        private List<TDNBean> tdn;

        @Data
        @AllArgsConstructor
        @Builder
        public static class CORBean {

            /**
             * "orders_threshold": 3,
             * "orders": 0,
             * "invalid_cancel_orders": 0,
             * "cancel_ratio_threshold": 0.100000000000000000,
             * "cancel_ratio": 0,
             * "is_trigger": 0,
             * "is_active": 1
             */

            @SerializedName("orders_threshold")
            private Long ordersThreshold;
            private Long orders;
            @SerializedName("invalid_cancel_orders")
            private Long invalidCancelOrders;
            @SerializedName("cancel_ratio_threshold")
            private BigDecimal cancelRatioThreshold;
            @SerializedName("cancel_ratio")
            private BigDecimal cancelRatio;
            @SerializedName("is_trigger")
            private Integer isTrigger;
            @SerializedName("is_active")
            private Integer isActive;
        }

        @Data
        @AllArgsConstructor
        @Builder
        public static class TDNBean {

            /**
             * "disables_threshold": 2,
             * "disables": 0,
             * "is_trigger": 0,
             * "is_active": 1
             */

            @SerializedName("disables_threshold")
            private Long disablesThreshold;
            private Long disables;
            @SerializedName("is_trigger")
            private Integer isTrigger;
            @SerializedName("is_active")
            private Integer isActive;
        }
    }
}
