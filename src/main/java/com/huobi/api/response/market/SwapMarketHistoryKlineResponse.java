package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapMarketHistoryKlineResponse {

    /**
     * "ch":"market.BTC-USDT.kline.15min",
     * "data":[{"amount":0,"close":10329.11,"count":0,"high":10329.11,"id":1601019000,"low":10329.11,"open":10329.11,"trade_turnover":0,"vol":0}],
     * "status":"ok",
     * "ts":1601019041617
     */

    private String ch;
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "amount":0,
         * "close":10329.11,
         * "count":0,
         * "high":10329.11,
         * "id":1601019000,
         * "low":10329.11,
         * "open":10329.11,
         * "trade_turnover":0,
         * "vol":0
         */

        private BigDecimal amount;
        private BigDecimal close;
        private BigDecimal count;
        private BigDecimal high;
        private Long id;
        private BigDecimal low;
        private BigDecimal open;
        private BigDecimal vol;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

    }
}
