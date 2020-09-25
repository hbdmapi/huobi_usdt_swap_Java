package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class SwapFinancialRecordResponse {

    /**
     * "status": "ok",
     * "data":{"total_page":4,"current_page":1,"total_size":78,"financial_record":[{"id":32570,"type":5,"amount":-0.051645550000000000,"ts":1600935837608,"contract_code":"BTC-USDT","asset":"USDT","margin_account":"BTC-USDT","face_margin_account":""},{"id":32465,"type":5,"amount":-0.051645550000000000,"ts":1600926986046,"contract_code":"BTC-USDT","asset":"USDT","margin_account":"BTC-USDT","face_margin_account":""}]
     * "ts":1601013304748
     */

    private String status;
    private DataBean data;
    private long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "total_page": 4,
         * "current_page": 1,
         * "total_size": 78,
         * "financial_record":[{"id":32570,"type":5,"amount":-0.051645550000000000,"ts":1600935837608,"contract_code":"BTC-USDT","asset":"USDT","margin_account":"BTC-USDT","face_margin_account":""},{"id":32465,"type":5,"amount":-0.051645550000000000,"ts":1600926986046,"contract_code":"BTC-USDT","asset":"USDT","margin_account":"BTC-USDT","face_margin_account":""}]
         */
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;
        @SerializedName("financial_record")
        private List<FinancialRecordBean> financialRecord;

        @Data
        @AllArgsConstructor
        public static class FinancialRecordBean {

            /**
             * "id": 32570,
             * "type": 5,
             * "amount": -0.051645550000000000,
             * "ts": 1600935837608,
             * "contract_code": "BTC-USDT",
             * "asset": "USDT",
             * "margin_account": "BTC-USDT",
             * "face_margin_account": ""
             */
            private Long id;
            private Long ts;
            private String asset;
            @SerializedName("contract_code")
            private String contractCode;
            @SerializedName("margin_account")
            private String marginAccount;
            @SerializedName("face_margin_account")
            private String faceMarginAccount;
            private Integer type;
            private BigDecimal amount;


        }
    }
}
