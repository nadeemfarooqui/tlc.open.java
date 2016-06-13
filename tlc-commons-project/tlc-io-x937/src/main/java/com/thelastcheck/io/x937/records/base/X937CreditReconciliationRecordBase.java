package com.thelastcheck.io.x937.records.base;

import com.thelastcheck.commons.base.exception.InvalidDataException;
import com.thelastcheck.commons.base.fields.RoutingNumber;
import com.thelastcheck.commons.buffer.ByteArray;
import com.thelastcheck.io.base.exception.InvalidStandardLevelException;
import com.thelastcheck.io.x9.X9RecordImpl;
import com.thelastcheck.io.x937.records.X937CreditReconciliationRecord;

/**
 * Created by nadeem on 6/12/16.
 */
public abstract class X937CreditReconciliationRecordBase extends X9RecordImpl
            implements X937CreditReconciliationRecord{
    public X937CreditReconciliationRecordBase() {
        super();
        recordType(TYPE_CREDIT_DETAIL_RECORD);
    }


    public X937CreditReconciliationRecordBase(int stdLevel) {
        super(TYPE_CREDIT_DETAIL_RECORD, stdLevel);
    }

    public X937CreditReconciliationRecordBase(String encoding, int stdLevel) {
        super(TYPE_CREDIT_DETAIL_RECORD, encoding, stdLevel);
    }

    public X937CreditReconciliationRecordBase(ByteArray record, int stdLevel) {
        super(record, stdLevel);
    }

    @Override
    public X937CreditReconciliationRecord reserved(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String auxiliaryOnUs() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord auxiliaryOnUs(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String externalProcessingCode() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord externalProcessingCode(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public RoutingNumber payorBankRoutingNumber() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord payorBankRoutingNumber(RoutingNumber value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String payorBankRoutingNumberAsString() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord payorBankRoutingNumber(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String creditAccountNumberOnUs() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord creditAccountNumberOnUs(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public long itemAmountAsLong() throws InvalidDataException {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord itemAmount(long value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String ECEInstitutionItemSequenceNumber() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord ECEInstitutionItemSequenceNumber(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String documentationTypeIndicator() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord documentationTypeIndicator(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String typeOfAccountCode() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord typeOfAccountCode(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String sourceOfWorkCode() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord sourceOfWorkCode(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String workType() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord workType(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String debitCreditIndicator() {
        throw new InvalidStandardLevelException();
    }

    @Override
    public X937CreditReconciliationRecord debitCreditIndicator(String value) {
        throw new InvalidStandardLevelException();
    }

    @Override
    public String reserved() {
        throw new InvalidStandardLevelException();
    }
}

