package com.adepuu.oop.superMethod;

public class VisaPlatinum extends Visa implements InternationalTransaction, LocalTransaction {
    VisaPlatinum() {
        super();
        System.out.println("Constructor for Visa Platinum");
        System.out.println(super.globalRewardMultiplier);
    }

    public double getRewardMultiplier() {
        return super.globalRewardMultiplier * 2;
    }

    public boolean payment(double total, boolean isInternational) {
        if (isInternational) {
            var defaultApprovalCode = InternationalTransaction.approvalCode;
            var pciDssStatus = checkPcidss();
            return checkFund();
        } else {
            var isFundSufficient = checkFund();
            return getCentralBankApproval();
        }
    }

    @Override
    public boolean checkPcidss() {
        // customized depend on card's specific requirements
        return false;
    }

    @Override
    public boolean checkFund() {
        // customized depend on card's specific requirements
        return false;
    }

    @Override
    public boolean getCentralBankApproval() {
        // customized depend on card's specific requirements
        return false;
    }
}
