package com.thelastcheck.io.x937.records;

import com.thelastcheck.commons.base.exception.InvalidDataException;
import com.thelastcheck.commons.base.fields.RoutingNumber;
import com.thelastcheck.io.x9.X9Record;

/**
 * Created by nadeem on 6/12/16.
 */
public interface X937CreditReconciliationRecord extends X9Record{

    String auxiliaryOnUs();
    X937CreditReconciliationRecord auxiliaryOnUs(String value);

    String externalProcessingCode();
    X937CreditReconciliationRecord externalProcessingCode(String value);

    RoutingNumber payorBankRoutingNumber();
    X937CreditReconciliationRecord payorBankRoutingNumber(RoutingNumber value);

    String payorBankRoutingNumberAsString();
    X937CreditReconciliationRecord payorBankRoutingNumber(String value);

    String creditAccountNumberOnUs();
    X937CreditReconciliationRecord creditAccountNumberOnUs(String value);

    long itemAmountAsLong()
            throws InvalidDataException;
    X937CreditReconciliationRecord itemAmount(long value);

    String ECEInstitutionItemSequenceNumber();
    X937CreditReconciliationRecord ECEInstitutionItemSequenceNumber(String value);

    String documentationTypeIndicator();
    X937CreditReconciliationRecord documentationTypeIndicator(String value);

    String typeOfAccountCode();
    X937CreditReconciliationRecord typeOfAccountCode(String value);

    String sourceOfWorkCode();
    X937CreditReconciliationRecord sourceOfWorkCode(String value);

    String workType();
    X937CreditReconciliationRecord workType(String value);

    String debitCreditIndicator();
    X937CreditReconciliationRecord debitCreditIndicator(String value);

    String reserved();
    X937CreditReconciliationRecord reserved(String value);
}
