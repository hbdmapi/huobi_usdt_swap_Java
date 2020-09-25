package com.huobi.api.response.market;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapElitePositionRatioResponse {
    /**
     * "status":"ok",
     * "data":{"list":[{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600912800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600916400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600920000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600923600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600927200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600930800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600938000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600945200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600948800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600952400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600956000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600959600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600963200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600966800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600970400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600974000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600977600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600981200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600984800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600988400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600992000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600995600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600999200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601002800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601006400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601010000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601013600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601017200000}],"symbol":"BTC","contract_code":"BTC-USDT"},
     * "ts":1601017876358
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "list":[{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600912800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600916400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600920000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600923600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600927200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600930800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600938000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600945200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600948800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600952400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600956000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600959600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600963200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600966800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600970400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600974000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600977600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600981200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600984800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600988400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600992000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600995600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1600999200000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601002800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601006400000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601010000000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601013600000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"ts":1601017200000}],
         * "symbol":"BTC",
         * "contract_code":"BTC-USDT"
         */
        private String symbol;
        private String contractCode;
        private List<DataList> list;

        @Data
        @AllArgsConstructor
        public static class DataList {
            /**
             * "buy_ratio": 0.5000,
             * "sell_ratio": 0.5000,
             * "ts": 1600912800000
             */
            private BigDecimal buyRatio;
            private BigDecimal sellRatio;
            private Long ts;
        }
    }
}
