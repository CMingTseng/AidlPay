// IPay.aidl
package com.xhunmon.aidl.pay;

// Declare any non-default types here with import statements

interface IPay {
    /**
    * 支付了多少钱,回传余额
    */
    String pay(int money);
}
