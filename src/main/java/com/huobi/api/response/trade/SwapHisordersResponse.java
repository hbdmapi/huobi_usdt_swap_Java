package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapHisordersResponse {
    /**
     * {"status":"ok",
     * "data":{"orders":[{"order_id":759079311113506816,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"buy","offset":"open","volume":1000.000000000000000000,"price":333.000000000000000000,"create_date":1601020210775,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":1000.000000000000000000,"trade_turnover":3320.000000000000000000,"fee":-1.328000000000000000,"trade_avg_price":332.000000,"status":6,"order_id_str":"759079311113506816","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":759079310895403008,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"sell","offset":"open","volume":100.000000000000000000,"price":456.000000000000000000,"create_date":1601020210717,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":0,"status":7,"order_id_str":"759079310895403008","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":759077984358682624,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"sell","offset":"open","volume":100.000000000000000000,"price":455.000000000000000000,"create_date":1601019894444,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":0,"status":7,"order_id_str":"759077984358682624","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":759077085095710720,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"buy","offset":"open","volume":1000.000000000000000000,"price":333.000000000000000000,"create_date":1601019680045,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":1000.000000000000000000,"trade_turnover":3284.209175160000000000,"fee":-1.313683670064000000,"trade_avg_price":328.420917,"status":6,"order_id_str":"759077085095710720","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":757651577548611584,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"sell","offset":"close","volume":9.000000000000000000,"price":400.000000000000000000,"create_date":1600679812556,"order_source":"web","order_price_type":3,"order_type":1,"margin_frozen":0E-18,"profit":-2.211489149999999999,"trade_volume":9.000000000000000000,"trade_turnover":36.000000000000000000,"fee":-0.018000000000000000,"trade_avg_price":400.000000,"status":6,"order_id_str":"757651577548611584","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"}],"total_page":2,"current_page":1,"total_size":10},
     * "ts":1601020316961
     */

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "orders":[{"order_id":759079311113506816,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"buy","offset":"open","volume":1000.000000000000000000,"price":333.000000000000000000,"create_date":1601020210775,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":1000.000000000000000000,"trade_turnover":3320.000000000000000000,"fee":-1.328000000000000000,"trade_avg_price":332.000000,"status":6,"order_id_str":"759079311113506816","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":759079310895403008,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"sell","offset":"open","volume":100.000000000000000000,"price":456.000000000000000000,"create_date":1601020210717,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":0,"status":7,"order_id_str":"759079310895403008","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":759077984358682624,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"sell","offset":"open","volume":100.000000000000000000,"price":455.000000000000000000,"create_date":1601019894444,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":0E-18,"trade_turnover":0E-18,"fee":0E-18,"trade_avg_price":0,"status":7,"order_id_str":"759077984358682624","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":759077085095710720,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"buy","offset":"open","volume":1000.000000000000000000,"price":333.000000000000000000,"create_date":1601019680045,"order_source":"api","order_price_type":1,"order_type":1,"margin_frozen":0E-18,"profit":0E-18,"trade_volume":1000.000000000000000000,"trade_turnover":3284.209175160000000000,"fee":-1.313683670064000000,"trade_avg_price":328.420917,"status":6,"order_id_str":"759077085095710720","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"},{"order_id":757651577548611584,"contract_code":"ETH-USDT","symbol":"ETH","lever_rate":5,"direction":"sell","offset":"close","volume":9.000000000000000000,"price":400.000000000000000000,"create_date":1600679812556,"order_source":"web","order_price_type":3,"order_type":1,"margin_frozen":0E-18,"profit":-2.211489149999999999,"trade_volume":9.000000000000000000,"trade_turnover":36.000000000000000000,"fee":-0.018000000000000000,"trade_avg_price":400.000000,"status":6,"order_id_str":"757651577548611584","fee_asset":"USDT","liquidation_type":"0","margin_asset":"USDT"}],
         * "total_page":2,
         * "current_page":1,
         * "total_size":10
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
             * "order_id":759079311113506816,
             * "contract_code":"ETH-USDT",
             * "symbol":"ETH",
             * "lever_rate":5,
             * "direction":"buy",
             * "offset":"open",
             * "volume":1000,
             * "price":333,
             * "create_date":1601020210775,
             * "order_source":"api",
             * "order_price_type":1,
             * "order_type":1,
             * "margin_frozen":0,
             * "profit":0,
             * "trade_volume":1000,
             * "trade_turnover":3320,
             * "fee":-1.328,
             * "trade_avg_price":332,
             * "status":6,
             * "order_id_str":"759079311113506816",
             * "fee_asset":"USDT",
             * "liquidation_type":"0",
             * "margin_asset":"USDT"
             */
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("lever_rate")
            private Integer leverRate;
            private String direction;
            private String offset;
            private BigDecimal volume;
            private BigDecimal price;
            @SerializedName("create_date")
            private Long createDate;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("order_price_type")
            private String orderPriceType;
            @SerializedName("margin_frozen")
            private BigDecimal marginFrozen;
            @SerializedName("margin_asset")
            private String marginAsset;
            private BigDecimal profit;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            private BigDecimal fee;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("trade_avg_price")
            private BigDecimal tradeAvgPrice;
            private Integer status;
            @SerializedName("order_type")
            private Integer orderType;
            @SerializedName("liquidation_type")
            private String liquidationType;

        }
    }
}
