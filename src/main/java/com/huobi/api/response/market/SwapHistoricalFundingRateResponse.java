package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapHistoricalFundingRateResponse {
    /**
     * "status":"ok",
     * "data":{"total_page":2,"current_page":1,"total_size":30,"data":[{"avg_premium_index":"-0.010388926169819728","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600914600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.016328444933109609","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600885800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.014467677432716085","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600857000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.021013287840712665","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600828200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.036960721322332192","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600799400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.031880470548548157","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600770600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.016448475555121002","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600741800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.031735615415070584","funding_rate":"0.003750000000000000","realized_rate":"0.003750000000000000","funding_time":"1600713000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.376417725484192043","funding_rate":"-0.003750000000000000","realized_rate":"-0.000931996086105675","funding_time":"1600684200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.012961454875947187","funding_rate":"0.000100000000000000","realized_rate":"0.000042588726513569","funding_time":"1600656000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000082683823529411","funding_rate":"0.000100000000000000","realized_rate":"0.000100000000000000","funding_time":"1600655400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000099374999999999","funding_rate":"0.000100000000000000","realized_rate":"0.000100000000000000","funding_time":"1600654200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000099374999999999","funding_rate":"0.000100000000000000","realized_rate":"0.000100000000000000","funding_time":"1600625400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000097045898437500","funding_rate":"0.000097656250000001","realized_rate":"0.000097656250000001","funding_time":"1600596600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.000402343749999999","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600567800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.006687521793045953","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600539000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.085864269062858537","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600510200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.179787704920770161","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600481400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.190067851972243281","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600452600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.096094761244176491","funding_rate":"-0.002198437499999999","realized_rate":"-0.002198437499999998","funding_time":"1600423800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"}]},
     * "ts":1601018192135
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "total_page":2,
         * "current_page":1,
         * "total_size":30,
         * "data":[{"avg_premium_index":"-0.010388926169819728","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600914600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.016328444933109609","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600885800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.014467677432716085","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600857000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.021013287840712665","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600828200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.036960721322332192","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600799400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.031880470548548157","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600770600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.016448475555121002","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600741800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.031735615415070584","funding_rate":"0.003750000000000000","realized_rate":"0.003750000000000000","funding_time":"1600713000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.376417725484192043","funding_rate":"-0.003750000000000000","realized_rate":"-0.000931996086105675","funding_time":"1600684200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.012961454875947187","funding_rate":"0.000100000000000000","realized_rate":"0.000042588726513569","funding_time":"1600656000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000082683823529411","funding_rate":"0.000100000000000000","realized_rate":"0.000100000000000000","funding_time":"1600655400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000099374999999999","funding_rate":"0.000100000000000000","realized_rate":"0.000100000000000000","funding_time":"1600654200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000099374999999999","funding_rate":"0.000100000000000000","realized_rate":"0.000100000000000000","funding_time":"1600625400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"0.000097045898437500","funding_rate":"0.000097656250000001","realized_rate":"0.000097656250000001","funding_time":"1600596600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.000402343749999999","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600567800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.006687521793045953","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600539000000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.085864269062858537","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600510200000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.179787704920770161","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600481400000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.190067851972243281","funding_rate":"-0.003750000000000000","realized_rate":"-0.003750000000000000","funding_time":"1600452600000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"},{"avg_premium_index":"-0.096094761244176491","funding_rate":"-0.002198437499999999","realized_rate":"-0.002198437499999998","funding_time":"1600423800000","contract_code":"BTC-USDT","symbol":"BTC","fee_asset":"USDT"}]
         */
        private Integer currentPage;
        private Integer totalPage;
        private Integer totalSize;
        private List<DataBeanToo> data;

        @Data
        @AllArgsConstructor
        public static class DataBeanToo {
            /**
             * "avg_premium_index": "-0.010388926169819728",
             * "funding_rate": "-0.003750000000000000",
             * "realized_rate": "-0.003750000000000000",
             * "funding_time": "1600914600000",
             * "contract_code": "BTC-USDT",
             * "symbol": "BTC",
             * "fee_asset": "USDT"
             */
            private String symbol;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("fee_asset")
            private String feeAsset;
            @SerializedName("funding_time")
            private String fundingTime;
            @SerializedName("funding_rate")
            private String fundingRate;
            @SerializedName("realized_rate")
            private String realizedRate;
            @SerializedName("avg_premium_index")
            private String avgPremiumIndex;

        }
    }
}
