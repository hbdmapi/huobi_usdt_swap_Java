package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapIndexResponse {


    /**
     * "status":"ok",
     * "data":[{"index_price":2.511570651667777777,"index_ts":1601018304058,"contract_code":"EOS-USDT"},{"index_price":10692.295000000000000000,"index_ts":1601018304058,"contract_code":"BTC-USDT"},{"index_price":343.444333333333333333,"index_ts":1601018304058,"contract_code":"ETH-USDT"},{"index_price":44.668389480000000000,"index_ts":1601018304058,"contract_code":"LTC-USDT"}],
     * "ts":1601018311032
     */

    private String status;
    private Long ts;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "index_price": 2.511570651667777777,
         * "index_ts": 1601018304058,
         * "contract_code": "EOS-USDT"
         */


        @SerializedName("contract_code")
        private String contractCode;
        @SerializedName("index_price")
        private BigDecimal indexPrice;
        @SerializedName("index_ts")
        private Long indexTs;

    }
}
