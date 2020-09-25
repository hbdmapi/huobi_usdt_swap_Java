package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapOpenInterestResponse {
    /**
     * {"status":"ok",
     * "data":[{"volume":3019.000000000000000000,"amount":30.190000000000000000,"symbol":"BTC","value":311835.830900000000000000,"contract_code":"BTC-USDT"}],
     * "ts":1601019319454}
     */

    private String status;
    private List<DataBean> data;
    private Long ts;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "volume":3019,
         * "amount":30.19,
         * "symbol":"BTC",
         * "value":311835.8309,
         * "contract_code":"BTC-USDT"
         */

        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private BigDecimal amount;
        private BigDecimal volume;
        private BigDecimal value;

    }
}
