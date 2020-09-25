package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapApiStateResponse {
    /**
     * "status":"ok",
     * "data":[{"symbol":"ETH","contract_code":"ETH-USDT","open":1,"close":1,"cancel":1,"transfer_in":1,"transfer_out":1,"master_transfer_sub":1,"sub_transfer_master":1,"master_transfer_sub_inner_in":1,"master_transfer_sub_inner_out":1,"sub_transfer_master_inner_in":1,"sub_transfer_master_inner_out":1,"transfer_inner_in":1,"transfer_inner_out":1},{"symbol":"LTC","contract_code":"LTC-USDT","open":1,"close":1,"cancel":1,"transfer_in":1,"transfer_out":1,"master_transfer_sub":1,"sub_transfer_master":1,"master_transfer_sub_inner_in":1,"master_transfer_sub_inner_out":1,"sub_transfer_master_inner_in":1,"sub_transfer_master_inner_out":1,"transfer_inner_in":1,"transfer_inner_out":1},{"symbol":"EOS","contract_code":"EOS-USDT","open":1,"close":1,"cancel":1,"transfer_in":1,"transfer_out":1,"master_transfer_sub":1,"sub_transfer_master":1,"master_transfer_sub_inner_in":1,"master_transfer_sub_inner_out":1,"sub_transfer_master_inner_in":1,"sub_transfer_master_inner_out":1,"transfer_inner_in":1,"transfer_inner_out":1},{"symbol":"BTC","contract_code":"BTC-USDT","open":1,"close":1,"cancel":1,"transfer_in":1,"transfer_out":1,"master_transfer_sub":1,"sub_transfer_master":1,"master_transfer_sub_inner_in":1,"master_transfer_sub_inner_out":1,"sub_transfer_master_inner_in":1,"sub_transfer_master_inner_out":1,"transfer_inner_in":1,"transfer_inner_out":1}],
     * "ts":1601017543003
     */
    public String status;
    private Long ts;
    private List<DateBean> data;

    @Data
    @AllArgsConstructor
    public static class DateBean {
        /**
         * "symbol": "ETH",
         * "contract_code": "ETH-USDT",
         * "open": 1,
         * "close": 1,
         * "cancel": 1,
         * "transfer_in": 1,
         * "transfer_out": 1,
         * "master_transfer_sub": 1,
         * "sub_transfer_master": 1,
         * "master_transfer_sub_inner_in": 1,
         * "master_transfer_sub_inner_out": 1,
         * "sub_transfer_master_inner_in": 1,
         * "sub_transfer_master_inner_out": 1,
         * "transfer_inner_in": 1,
         * "transfer_inner_out": 1
         */
        private String symbol;
        @SerializedName("contract_code")
        private String contractCode;
        private Integer open;
        private Integer close;
        private Integer cancel;
        @SerializedName("transfer_in")
        private Integer transferIn;
        @SerializedName("transfer_out")
        private Integer transferOut;
        @SerializedName("master_transfer_sub")
        private Integer masterTransferSub;
        @SerializedName("sub_transfer_master")
        private Integer subTransferMaster;
        @SerializedName("master_transfer_sub_inner_in")
        private Integer masterTransferSubInnerIn;
        @SerializedName("master_transfer_sub_inner_out")
        private Integer masterTransferSubInnerOut;
        @SerializedName("sub_transfer_master_inner_in")
        private Integer subTransferMasterInnerIn;
        @SerializedName("sub_transfer_master_inner_out")
        private Integer subTransferMasterInnerOut;
        @SerializedName("transfer_inner_in")
        private Integer transferInnerIn;
        @SerializedName("transfer_inner_out")
        private Integer transferInnerOut;

    }
}
