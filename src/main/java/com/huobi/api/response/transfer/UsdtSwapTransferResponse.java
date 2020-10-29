package com.huobi.api.response.transfer;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsdtSwapTransferResponse {

    /**
     * 参数名称	是否必须	类型	    描述	            取值范围
     * success	true	string	状态	            true/false
     * data	    true	long	生成的划转订单id
     * code	    true	long	响应码
     * message	true	string	响应信息
     */

    private String success;
    private Long data;
    private Long code;
    private String message;

}
