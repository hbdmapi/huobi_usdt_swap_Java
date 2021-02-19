package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class BatchMergedResponse {
    private String status;
    private Long ts;
    private List<TicksBean> ticks;

    @Builder
    @AllArgsConstructor
    @Data
    public static class TicksBean{
        @SerializedName("contract_code")
        private String contractCode;
        private Long id;
        private String amount;
        private List ask;
        private List bid;
        private String open;
        private String close;
        private BigDecimal count;
        private String high;
        private String low;
        private String vol;
        @SerializedName("trade_turnover")
        private String tradeTurnover;
        private Long ts;
    }

}
