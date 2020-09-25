package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@AllArgsConstructor
public class MarketKLineReqResponse {


    private String id;
    private String rep;
    private Long wsid;
    private String status;
    private List<DataBean> data;


    @Data
    @AllArgsConstructor
    public static class DataBean {

        private Long id;
        private BigDecimal open;
        private BigDecimal close;
        private BigDecimal low;
        private BigDecimal high;
        private BigDecimal amount;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;
        private BigDecimal vol;
        private BigDecimal count;

    }
}
