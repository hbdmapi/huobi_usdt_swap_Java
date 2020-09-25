package com.huobi.api.response.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapMasterSubTransferResponse {

    /**
     * {"status":"ok",
     * "data":{"order_id":"759056715424780288"},
     * "ts":1601014823718}
     */

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        /**
         * "order_id":"759056715424780288"
         */

        @SerializedName("order_id")
        private Long orderId;
    }
}
