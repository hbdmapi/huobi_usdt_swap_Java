package com.huobi.wss.event;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class MarketKLineSubResponse {

    private String ch;
    private Long ts;
    private TickBean tick;

    @Data
    @AllArgsConstructor
    public static class TickBean {


        private Long id;
        private BigDecimal mrid;
        private BigDecimal vol;
        private BigDecimal count;
        private BigDecimal open;
        private BigDecimal close;
        private BigDecimal low;
        private BigDecimal high;
        private BigDecimal amount;
        @SerializedName("trade_turnover")
        private BigDecimal tradeTurnover;

    }
}
