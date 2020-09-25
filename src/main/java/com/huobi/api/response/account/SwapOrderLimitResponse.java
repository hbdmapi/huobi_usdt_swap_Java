package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapOrderLimitResponse {

    /**
     * "status":"ok",
     * "data":{"order_price_type":"limit","list":[{"symbol":"ETH","contract_code":"ETH-USDT","open_limit":10001.000000000000000000,"close_limit":20000.000000000000000000},{"symbol":"LTC","contract_code":"LTC-USDT","open_limit":999999999.000000000000000000,"close_limit":100000.000000000000000000},{"symbol":"EOS","contract_code":"EOS-USDT","open_limit":1000000000.000000000000000000,"close_limit":1000000.000000000000000000},{"symbol":"BTC","contract_code":"BTC-USDT","open_limit":40000.000000000000000000,"close_limit":10000.000000000000000000}]},
     * "ts":1601014888426
     */

    private String status;
    private List<DataBean> data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "order_price_type":"limit",
         * "list":[{"symbol":"ETH","contract_code":"ETH-USDT","open_limit":10001.000000000000000000,"close_limit":20000.000000000000000000}]
         */

        @SerializedName("order_price_type")
        private String orderPriceType;
        private List<ListBean> list;

        @Data
        @AllArgsConstructor
        public static class ListBean {

            /**
             * "symbol": "ETH",
             * "contract_code": "ETH-USDT",
             * "open_limit": 10001.000000000000000000,
             * "close_limit": 20000.000000000000000000
             */

            private String symbol;
            private String contractCode;
            private Float openLimit;
            private Float closeLimit;

        }
    }
}
