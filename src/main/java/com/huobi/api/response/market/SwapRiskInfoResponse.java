package com.huobi.api.response.market;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@AllArgsConstructor
public class SwapRiskInfoResponse {
    /**
     * "status":"ok",
     * "data":[{"contract_code":"ETH-USDT","insurance_fund":100.782337804006920168,"estimated_clawback":0E-18},{"contract_code":"LTC-USDT","insurance_fund":1.985216184462474471,"estimated_clawback":0E-18},{"contract_code":"EOS-USDT","insurance_fund":105.000000000000000000,"estimated_clawback":0E-18},{"contract_code":"BTC-USDT","insurance_fund":41963.382117457142308280,"estimated_clawback":0E-18}],
     * "ts":1601019477530
     */
    private String status;
    private Long ts;
    private List<DataBean> data;

    @Data
    @AllArgsConstructor
    public static class DataBean {
        /**
         * "contract_code":"ETH-USDT",
         * "insurance_fund":100.782337804006920168,
         * "estimated_clawback":0
         */
        private String contractCode;
        @SerializedName("insurance_fund")
        private BigDecimal insuranceFund;
        @SerializedName("estimated_clawback")
        private BigDecimal estimatedClawback;
    }
}
