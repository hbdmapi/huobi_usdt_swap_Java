package com.huobi.api.response.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapMatchresultsResponse {
    /**
     * "status":"ok",
     * "data":{"trades":[{"match_id":14499,"order_id":758725403280691200,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"open","trade_volume":1.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":103.291100000000000000,"trade_fee":-0.051645550000000000,"offset_profitloss":0E-18,"create_date":1600935837608,"role":"Taker","order_source":"web","order_id_str":"758725403280691200","id":"14499-758725403280691200-1","fee_asset":"USDT"},{"match_id":14470,"order_id":758688290195656704,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"open","trade_volume":1.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":103.291100000000000000,"trade_fee":-0.051645550000000000,"offset_profitloss":0E-18,"create_date":1600926986046,"role":"Taker","order_source":"web","order_id_str":"758688290195656704","id":"14470-758688290195656704-1","fee_asset":"USDT"},{"match_id":14469,"order_id":758684042347171840,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"open","trade_volume":1.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":103.291100000000000000,"trade_fee":-0.051645550000000000,"offset_profitloss":0E-18,"create_date":1600925972666,"role":"Taker","order_source":"web","order_id_str":"758684042347171840","id":"14469-758684042347171840-1","fee_asset":"USDT"},{"match_id":13670,"order_id":758643126693031936,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"close","trade_volume":25.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":2582.277500000000000000,"trade_fee":-1.032911000000000000,"offset_profitloss":-5.319151442307692307,"create_date":1600916217943,"role":"Taker","order_source":"api","order_id_str":"758643126693031936","id":"13670-758643126693031936-1","fee_asset":"USDT"},{"match_id":13657,"order_id":758640801572220928,"symbol":"BTC","contract_code":"BTC-USDT","direction":"sell","offset":"open","trade_volume":100.000000000000000000,"trade_price":10328.994000000000000000,"trade_turnover":10328.994000000000000000,"trade_fee":-5.164497000000000000,"offset_profitloss":0E-18,"create_date":1600915663525,"role":"Taker","order_source":"api","order_id_str":"758640801572220928","id":"13657-758640801572220928-1","fee_asset":"USDT"}],"total_page":8,"current_page":1,"total_size":36},
     * "ts":1601020538552
     */

    private DataBean data;
    private String status;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "trades":[{"match_id":14499,"order_id":758725403280691200,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"open","trade_volume":1.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":103.291100000000000000,"trade_fee":-0.051645550000000000,"offset_profitloss":0E-18,"create_date":1600935837608,"role":"Taker","order_source":"web","order_id_str":"758725403280691200","id":"14499-758725403280691200-1","fee_asset":"USDT"},{"match_id":14470,"order_id":758688290195656704,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"open","trade_volume":1.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":103.291100000000000000,"trade_fee":-0.051645550000000000,"offset_profitloss":0E-18,"create_date":1600926986046,"role":"Taker","order_source":"web","order_id_str":"758688290195656704","id":"14470-758688290195656704-1","fee_asset":"USDT"},{"match_id":14469,"order_id":758684042347171840,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"open","trade_volume":1.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":103.291100000000000000,"trade_fee":-0.051645550000000000,"offset_profitloss":0E-18,"create_date":1600925972666,"role":"Taker","order_source":"web","order_id_str":"758684042347171840","id":"14469-758684042347171840-1","fee_asset":"USDT"},{"match_id":13670,"order_id":758643126693031936,"symbol":"BTC","contract_code":"BTC-USDT","direction":"buy","offset":"close","trade_volume":25.000000000000000000,"trade_price":10329.110000000000000000,"trade_turnover":2582.277500000000000000,"trade_fee":-1.032911000000000000,"offset_profitloss":-5.319151442307692307,"create_date":1600916217943,"role":"Taker","order_source":"api","order_id_str":"758643126693031936","id":"13670-758643126693031936-1","fee_asset":"USDT"},{"match_id":13657,"order_id":758640801572220928,"symbol":"BTC","contract_code":"BTC-USDT","direction":"sell","offset":"open","trade_volume":100.000000000000000000,"trade_price":10328.994000000000000000,"trade_turnover":10328.994000000000000000,"trade_fee":-5.164497000000000000,"offset_profitloss":0E-18,"create_date":1600915663525,"role":"Taker","order_source":"api","order_id_str":"758640801572220928","id":"13657-758640801572220928-1","fee_asset":"USDT"}],
         * "total_page":8,
         * "current_page":1,
         * "total_size":36
         */

        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("total_size")
        private Integer totalSize;
        private List<TradesBean> trades;

        @Data
        @AllArgsConstructor
        public static class TradesBean {
            /**
             * "match_id":14499,
             * "order_id":758725403280691200,
             * "symbol":"BTC",
             * "contract_code":"BTC-USDT",
             * "direction":"buy",
             * "offset":"open",
             * "trade_volume":1,
             * "trade_price":10329.11,
             * "trade_turnover":103.2911,
             * "trade_fee":-0.05164555,
             * "offset_profitloss":0,
             * "create_date":1600935837608,
             * "role":"Taker",
             * "order_source":"web",
             * "order_id_str":"758725403280691200",
             * "id":"14499-758725403280691200-1",
             * "fee_asset":"USDT"
             */

            @SerializedName("match_id")
            private Long matchId;
            private String id;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private Long orderIdStr;
            private String symbol;
            @SerializedName("order_source")
            private String orderSource;
            @SerializedName("contract_code")
            private String contractCode;
            private String direction;
            private String offset;
            @SerializedName("trade_volume")
            private BigDecimal tradeVolume;
            @SerializedName("trade_price")
            private BigDecimal tradePrice;
            @SerializedName("trade_turnover")
            private BigDecimal tradeTurnover;
            @SerializedName("create_date")
            private Long createDate;
            @SerializedName("offset_profitloss")
            private BigDecimal offsetProfitloss;
            @SerializedName("trade_fee")
            private double tradeFee;
            @SerializedName("fee_asset")
            private String feeAsset;
            private String role;


        }
    }
}
