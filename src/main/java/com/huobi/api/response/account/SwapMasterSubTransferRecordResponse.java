package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import sun.rmi.runtime.Log;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapMasterSubTransferRecordResponse {

    /**
     * "status":"ok",
     * "data":{"total_page":1,"current_page":1,"total_size":2,"transfer_record":[{"id":31201,"transfer_type":34,"amount":-50.000000000000000000,"ts":1600914842175,"sub_uid":"114390100","sub_account_name":"xiaowei","margin_account":"BTC-USDT","asset":"USDT","to_margin_account":"BTC-USDT","from_margin_account":"BTC-USDT"},{"id":26988,"transfer_type":34,"amount":-5000.000000000000000000,"ts":1600681596931,"sub_uid":"114390100","sub_account_name":"xiaowei","margin_account":"BTC-USDT","asset":"USDT","to_margin_account":"BTC-USDT","from_margin_account":"BTC-USDT"}]},
     * "ts":1601014410977
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    @Builder
    public static class DataBean {

        /**
         * "total_page": 1,
         * "current_page": 1,
         * "total_size": 2,
         * "transfer_record":[{"id":31201,"transfer_type":34,"amount":-50.000000000000000000,"ts":1600914842175,"sub_uid":"114390100","sub_account_name":"xiaowei","margin_account":"BTC-USDT","asset":"USDT","to_margin_account":"BTC-USDT","from_margin_account":"BTC-USDT"},{"id":26988,"transfer_type":34,"amount":-5000.000000000000000000,"ts":1600681596931,"sub_uid":"114390100","sub_account_name":"xiaowei","margin_account":"BTC-USDT","asset":"USDT","to_margin_account":"BTC-USDT","from_margin_account":"BTC-USDT"}]
         */

        @SerializedName("transfer_record")
        private List<TransferRecord> transferRecord;
        @SerializedName("total_page")
        private Integer totalPage;
        @SerializedName("current_page")
        private Integer currentPage;
        @SerializedName("total_size")
        private Integer totalSize;

        @Data
        @AllArgsConstructor
        @Builder
        public static class TransferRecord {

            /**
             * "id": 31201,
             * "transfer_type": 34,
             * "amount": -50.000000000000000000,
             * "ts": 1600914842175,
             * "sub_uid": "114390100",
             * "sub_account_name": "wei",
             * "margin_account": "BTC-USDT",
             * "asset": "USDT",
             * "to_margin_account": "BTC-USDT",
             * "from_margin_account": "BTC-USDT"
             */

            private Long id;
            private Long ts;
            private String asset;
            @SerializedName("margin_account")
            private String marginAccount;
            @SerializedName("from_margin_account")
            private String fromMarginAccount;
            @SerializedName("to_margin_account")
            private String toMarginAccount;
            @SerializedName("sub_uid")
            private String subUid;
            @SerializedName("sub_account_name")
            private String subAccountName;
            @SerializedName("transfer_type")
            private Integer transferType;
            private BigDecimal amount;
        }
    }
}
