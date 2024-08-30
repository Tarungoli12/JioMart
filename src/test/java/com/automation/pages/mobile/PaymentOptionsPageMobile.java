package com.automation.pages.mobile;

import com.automation.pages.ui.PaymentOptionsPage;

public class PaymentOptionsPageMobile extends BasePageMobile implements PaymentOptionsPage {

    @Override
    public boolean verifyUserIsOnPaymentOptionsPage() {
        return false;
    }
}
