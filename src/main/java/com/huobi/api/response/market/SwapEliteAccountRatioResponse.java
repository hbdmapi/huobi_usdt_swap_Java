package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
public class SwapEliteAccountRatioResponse {
    /**
     * "status":"ok",
     * "data":{"list":[{"buy_ratio":0.4440,"sell_ratio":0.5000,"locked_ratio":0.0560,"ts":1600912800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"locked_ratio":0.0000,"ts":1600916400000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600920000000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600923600000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600927200000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600930800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600938000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600945200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600948800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600952400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600956000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600959600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600963200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600966800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600970400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600974000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600977600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600981200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600984800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600988400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600992000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600995600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600999200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601002800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601006400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601010000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601013600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601017200000}],"symbol":"BTC","contract_code":"BTC-USDT"},
     * "ts":1601017738890
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Data
    public static class DataBean {
        /**
         * "list":[{"buy_ratio":0.4440,"sell_ratio":0.5000,"locked_ratio":0.0560,"ts":1600912800000},{"buy_ratio":0.5000,"sell_ratio":0.5000,"locked_ratio":0.0000,"ts":1600916400000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600920000000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600923600000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600927200000},{"buy_ratio":0.4730,"sell_ratio":0.5270,"locked_ratio":0.0000,"ts":1600930800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600938000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600945200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600948800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600952400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600956000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600959600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600963200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600966800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600970400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600974000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600977600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600981200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600984800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600988400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600992000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600995600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1600999200000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601002800000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601006400000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601010000000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601013600000},{"buy_ratio":0.5260,"sell_ratio":0.4740,"locked_ratio":0.0000,"ts":1601017200000}],
         * "symbol":"BTC",
         * "contract_code":"BTC-USDT"
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private List<DataList> list;

        @AllArgsConstructor
        @Data
        public static class DataList {
            /**
             * "buy_ratio": 0.4440,
             * "sell_ratio": 0.5000,
             * "locked_ratio": 0.0560,
             * "ts": 1600912800000
             */
            @SerializedName("buy_ratio")
            private BigDecimal buyRatio;
            @SerializedName("sell_ratio")
            private BigDecimal sellRatio;
            @SerializedName("locked_ratio")
            private BigDecimal lockedRatio;
            private Long ts;
        }
    }
}
