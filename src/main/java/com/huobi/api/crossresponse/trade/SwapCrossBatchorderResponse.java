package com.huobi.api.crossresponse.trade;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SwapCrossBatchorderResponse {

    private String status;
    private DataBean data;
    private Long ts;

    @Data
    @AllArgsConstructor
    public static class DataBean {

        private List<ErrorsBean> errors;
        private List<SuccessBean> success;

        @Data
        @AllArgsConstructor
        public static class ErrorsBean {

            private Integer index;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_msg")
            private String errMsg;

        }

        @Data
        @AllArgsConstructor
        public static class SuccessBean {

            private Integer index;
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("order_id_str")
            private String orderIdStr;
            @SerializedName("client_order_id")
            private Long clientOrderId;

        }
    }
}
