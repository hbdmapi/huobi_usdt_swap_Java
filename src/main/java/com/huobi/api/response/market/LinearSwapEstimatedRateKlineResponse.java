package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LinearSwapEstimatedRateKlineResponse {
    /**
     * "ch":"market.BTC-USDT.estimated_rate.1min",
     * "data":[{"amount":"0","close":"0.0014892219606765","count":"0","high":"0.0014892219606765","id":1601016600,"low":"0.0014892219606765","open":"0.0014892219606765","trade_turnover":"0","vol":"0"}],
     * "status":"ok",
     * "ts":1601016635799
     */
    private String ch;
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "amount": "0",
         * "close": "0.0014892219606765",
         * "count": "0",
         * "high": "0.0014892219606765",
         * "id": 1601016600,
         * "low": "0.0014892219606765",
         * "open": "0.0014892219606765",
         * "trade_turnover": "0",
         * "vol": "0"
         */
        private Long id;
        private String vol;
        private String count;
        private String open;
        private String close;
        private String low;
        private String High;
        private String amount;
        @SerializedName("trade_turnover")
        private String tradeTurnover;
    }
}
