package com.huobi.api.response.account;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class SwapSubAuthResponse {
    private String status;
    private Long ts;
    private List<DataBean> data;

    @AllArgsConstructor
    @Builder
    @Data
    public static class DataBean{
        private String successes;
        private List<ErrorsBean> errors;

        @AllArgsConstructor
        @Builder
        @Data
        public static class ErrorsBean{
            @SerializedName("sub_uid")
            private String subUid;
            @SerializedName("err_code")
            private Integer errCode;
            @SerializedName("err_msg")
            private String errMsg;
        }
    }
}
