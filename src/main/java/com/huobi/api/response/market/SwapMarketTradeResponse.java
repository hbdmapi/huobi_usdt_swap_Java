package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapMarketTradeResponse {
    /**
     * "ch":"market.BTC-USDT.trade.detail",
     * "status":"ok",
     * "tick":{"data":[{"amount":"2","ts":1600326764039,"id":80000,"price":"10000","direction":"sell"}],"id":1601019237738,"ts":1601019237738},
     * "ts":1601019237738
     */

    private String ch;
    private String status;
    private List<TickBean> tick;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class TickBean {
        /**
         * "data":[{"amount":"2","ts":1600326764039,"id":80000,"price":"10000","direction":"sell"}],
         * "id":1601019237738,
         * "ts":1601019237738
         */

        private Long id;
        private Long ts;
        private List<DataBean> data;

        @Data
        @AllArgsConstructor
        public static class DataBean {
            /**
             * "amount":"2",
             * "ts":1600326764039,
             * "id":80000,
             * "price":"10000",
             * "direction":"sell"
             */

            private String amount;
            private String direction;
            private Long id;
            private String price;
            private Long ts;
            private String quantity;
            @SerializedName("trade_turnover")
            private String tradeTurnover;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("trade_partition")
            private String tradePartition;
        }
    }
}
