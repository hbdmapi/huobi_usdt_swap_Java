package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import sun.rmi.runtime.Log;

import javax.swing.text.Highlighter;
import java.util.List;

@AllArgsConstructor
@Data
public class LinearSwapPremiumIndexKlineResponse {
    /**
     * "ch":"market.BTC-USDT.premium_index.1min",
     * "data":[{"amount":"0","close":"0.0026931683048173","count":"0","high":"0.0026931683048173","id":1601016720,"low":"0.0026931683048173","open":"0.0026931683048173","trade_turnover":"0","vol":"0"}],
     * "status":"ok",
     * "ts":1601016750315
     */
    private String ch;
    private Long ts;
    private String status;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "amount": "0",
         * "close": "0.0026931683048173",
         * "count": "0",
         * "high": "0.0026931683048173",
         * "id": 1601016720,
         * "low": "0.0026931683048173",
         * "open": "0.0026931683048173",
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
