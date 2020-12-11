package com.huobi.api.crossresponse.trade;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SwapCrossTriggerCancelallResponse {

    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @AllArgsConstructor
    @Data
    public static class DataBean {

        private String successes;
        private List<ErrorsBean> errors;

        @Data
        @AllArgsConstructor
        @Builder
        public static class ErrorsBean {

            @SerializedName("order_id")
            private String orderId;
            @SerializedName("err_code")
            private Long errCode;
            @SerializedName("err_msg")
            private String errMsg;
        }
    }

}
