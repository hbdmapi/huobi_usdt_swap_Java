package com.huobi.api.response.trade;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class SwapTpslCancelallResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Builder
    @AllArgsConstructor
    @Data
    public static class DataBean{
        private List<errorsBean> errors;
        private String successes;

        @Builder
        @AllArgsConstructor
        @Data
        public static class errorsBean{
            @SerializedName("order_id")
            private Long orderId;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_mag")
            private String errMag;
        }

    }
}
