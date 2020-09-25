package com.huobi.api.service.transfer;

import com.huobi.api.request.transfer.UsdtSwapTransferRequest;
import com.huobi.api.response.transfer.UsdtSwapTransferResponse;

public interface TransferApiService {

    UsdtSwapTransferResponse transfer(UsdtSwapTransferRequest request);
}
