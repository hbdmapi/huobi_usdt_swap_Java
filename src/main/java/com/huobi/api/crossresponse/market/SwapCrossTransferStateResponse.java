package com.huobi.api.crossresponse.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class SwapCrossTransferStateResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Builder
    @Data
    public static class DataBean{
        @SerializedName("margin_mode")
        private String marginMode;
        @SerializedName("margin_account")
        private String marginAccount;
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
