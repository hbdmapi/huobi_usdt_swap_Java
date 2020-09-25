package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MarketDetailSubResponse {

    private String ch;
    private Long ts;
    private TickBean tick;


    @Data
    @AllArgsConstructor
    public static class TickBean {


        private Long id;
        private Long mrid;
        private BigDecimal open;
        private BigDecimal close;
        private BigDecimal high;
        private BigDecimal low;
        private BigDecimal amount;
        private BigDecimal vol;
        private BigDecimal count;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

    }
}
