package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapOpenordersResponse {
    /**
     * "status":"ok",
     * "data":{"orders":[{"symbol":"BTC","contract_code":"BTC-USDT","volume":1000.000000000000000000,"price":9999.000000000000000000,"order_price_type":"limit","order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":758644298405408768,"client_order_id":null,"created_at":1600916495665,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":null,"margin_frozen":19998.000000000000000000,"profit":0E-18,"status":3,"order_source":"api","order_id_str":"758644298405408768","fee_asset":"USDT","liquidation_type":null,"canceled_at":null,"margin_asset":"USDT"},{"symbol":"BTC","contract_code":"BTC-USDT","volume":100.000000000000000000,"price":11100.000000000000000000,"order_price_type":"limit","order_type":1,"direction":"sell","offset":"open","lever_rate":5,"order_id":758644298199887872,"client_order_id":null,"created_at":1600916495610,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":null,"margin_frozen":2220.000000000000000000,"profit":0E-18,"status":3,"order_source":"api","order_id_str":"758644298199887872","fee_asset":"USDT","liquidation_type":null,"canceled_at":null,"margin_asset":"USDT"}],"total_page":1,"current_page":1,"total_size":2},
     * "ts":1601020656041
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "orders":[{"symbol":"BTC","contract_code":"BTC-USDT","volume":1000.000000000000000000,"price":9999.000000000000000000,"order_price_type":"limit","order_type":1,"direction":"buy","offset":"open","lever_rate":5,"order_id":758644298405408768,"client_order_id":null,"created_at":1600916495665,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":null,"margin_frozen":19998.000000000000000000,"profit":0E-18,"status":3,"order_source":"api","order_id_str":"758644298405408768","fee_asset":"USDT","liquidation_type":null,"canceled_at":null,"margin_asset":"USDT"},{"symbol":"BTC","contract_code":"BTC-USDT","volume":100.000000000000000000,"price":11100.000000000000000000,"order_price_type":"limit","order_type":1,"direction":"sell","offset":"open","lever_rate":5,"order_id":758644298199887872,"client_order_id":null,"created_at":1600916495610,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":null,"margin_frozen":2220.000000000000000000,"profit":0E-18,"status":3,"order_source":"api","order_id_str":"758644298199887872","fee_asset":"USDT","liquidation_type":null,"canceled_at":null,"margin_asset":"USDT"}],
         * "total_page":1,
         * "current_page":1,
         * "total_size":2
         */

        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<OrdersBean> orders;

        @Data
        @AllArgsConstructor
        public static class OrdersBean {
            /**
             * "symbol":"BTC",
             * "contract_code":"BTC-USDT",
             * "volume":100,
             * "price":11100,
             * "order_price_type":"limit",
             * "order_type":1,
             * "direction":"sell",
             * "offset":"open",
             * "lever_rate":5,
             * "order_id":758644298199887872,
             * "client_order_id":null,
             * "created_at":1600916495610,
             * "trade_volume":0,
             * "trade_turnover":0,
             * "fee":0,
             * "trade_avg_price":null,
             * "margin_frozen":2220,
             * "profit":0,
             * "status":3,
             * "order_source":"api",
             * "order_id_str":"758644298199887872",
             * "fee_asset":"USDT",
             * "liquidation_type":null,
             * "canceled_at":null,
             * "margin_asset":"USDT"
             */

            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            private BigDecimal volume;
            private BigDecimal price;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("order_type")
            private Integer orderType;
            private String direction;
            private String offset;
            @SerializedName("lever_rate")
            private Integer leverRate;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private Long orderIdStr;
            @SerializedName("client_order_id")
            private Long clientOrderId;
            @SerializedName("created_at")
            private Long createdAt;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            private BigDecimal profit;
            private Integer status;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("margin_asset")
            private String marginAsset;
            @SerializedName("liquidation_type")
            private String liquidationType;
            @SerializedName("canceled_at")
            private String canceledAt;

        }
    }
}
