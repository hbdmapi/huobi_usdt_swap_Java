package com.huobi.api.response.market;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapMarketHistoryTradeResponse {
    /**
     * {"ch":"market.BTC-USDT.trade.detail",
     * "data":[{"data":[{"amount":2,"direction":"sell","id":80000,"price":10000,"ts":1600326764039}],"id":8,"ts":1600326764039}],
     * "status":"ok",
     * "ts":1601019116673}
     */

    private String ch;
    private String status;
    private Long ts;
    private List<DataBeanX> data;

    @Data
    @AllArgsConstructor
    public static class DataBeanX {
        /**
         * "data":[{"amount":2,"direction":"sell","id":80000,"price":10000,"ts":1600326764039}],
         * "id":8,
         * "ts":1600326764039
         */

        private Long id;
        private Long ts;
        private List<DataBean> data;

        @Data
        @AllArgsConstructor
        public static class DataBean {
            /**
             * "amount":2,
             * "direction":"sell",
             * "id":80000,
             * "price":10000,
             * "ts":1600326764039
             */

            private Integer amount;
            private String direction;
            private Long id;
            private BigDecimal price;
            private Long ts;

        }
    }
}
