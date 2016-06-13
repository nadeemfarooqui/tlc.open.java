package com.thelastcheck.io.x937.records.stddstu;

import com.thelastcheck.commons.base.exception.InvalidDataException;
import com.thelastcheck.commons.base.fields.RoutingNumber;
import com.thelastcheck.commons.buffer.ByteArray;
import com.thelastcheck.io.base.Field;
import com.thelastcheck.io.base.FieldType;
import com.thelastcheck.io.x937.records.X937CreditReconciliationRecord;
import com.thelastcheck.io.x937.records.base.X937CreditReconciliationRecordBase;

/**
 * Created by nadeem on 6/12/16.
 */
public class X937CreditReconciliationRecordImpl extends X937CreditReconciliationRecordBase {

    private static int maxFieldNumber = 13;
    private static Field fields[] = new Field[maxFieldNumber+1];
    private Field localFieldCache[] = new Field[maxFieldNumber+1];

    static {
        fields[0] = null;
        fields[1] = recordTypeField;
        fields[2] = new Field("AuxiliaryOnUs", 2, 2, 15, FieldType.STRING);
        fields[3] = new Field("ExternalProcessingCode", 3, 17, 1, FieldType.STRING);
        fields[4] = new Field("PayorBankRoutingNumber", 4, 18, 9, FieldType.ROUTING_NUMBER);
        fields[5] = new Field("CreditAccountNumberOnUs", 5, 27, 20, FieldType.ONUS);
        fields[6] = new Field("ItemAmount", 6, 47, 10, FieldType.LONG);
        fields[7] = new Field("ECEInstitutionItemSequenceNumber", 7, 57, 15, FieldType.LONG);
        fields[8] = new Field("DocumentationTypeIndicator", 8, 72, 1, FieldType.STRING);
        fields[9] = new Field("TypeOfAccountCode", 9, 73, 1, FieldType.STRING);
        fields[10] = new Field("SourceOfWorkCode", 10, 74, 1, FieldType.STRING);
        fields[11] = new Field("WorkType", 11, 75, 1, FieldType.STRING);
        fields[12] = new Field("DebitCreditIndicator", 12, 76, 1, FieldType.STRING);
        fields[13] = new Field("Reserved", 13, 77, 3, FieldType.INT);
    }

    @Override
    protected void resetDynamicFields() {
    }

    @Override
    public int numberOfFields() {
        return maxFieldNumber;
    }

    @Override
    protected Field field(int fieldNumber) {
        if (fieldNumber < 1 || fieldNumber > maxFieldNumber) {
            throw new IllegalArgumentException(INVALID_FIELD_NUMBER);
        }
        return fields[fieldNumber];
    }

    public X937CreditReconciliationRecordImpl() {
        super();
    }

    public X937CreditReconciliationRecordImpl(int stdLevel) {
        super(stdLevel);
    }

    public X937CreditReconciliationRecordImpl(String encoding, int stdLevel) {
        super(encoding, stdLevel);
    }

    public X937CreditReconciliationRecordImpl(ByteArray record, int stdLevel) {
        super(record, stdLevel);
    }

    @Override
    public X937CreditReconciliationRecord reserved(String value) {
        setField(value, field(13));
        return this;
    }

    @Override
    public String auxiliaryOnUs() {
        return getFieldAsString(field(2));
    }

    @Override
    public X937CreditReconciliationRecord auxiliaryOnUs(String value) {
        setField(value, field(2));
        return this;
    }

    @Override
    public String externalProcessingCode() {
        return super.externalProcessingCode();
    }

    @Override
    public X937CreditReconciliationRecord externalProcessingCode(String value) {
        return super.externalProcessingCode(value);
    }

    @Override
    public RoutingNumber payorBankRoutingNumber() {
        return super.payorBankRoutingNumber();
    }

    @Override
    public X937CreditReconciliationRecord payorBankRoutingNumber(RoutingNumber value) {
        return super.payorBankRoutingNumber(value);
    }

    @Override
    public String payorBankRoutingNumberAsString() {
        return super.payorBankRoutingNumberAsString();
    }

    @Override
    public X937CreditReconciliationRecord payorBankRoutingNumber(String value) {
        return super.payorBankRoutingNumber(value);
    }

    @Override
    public String creditAccountNumberOnUs() {
        return super.creditAccountNumberOnUs();
    }

    @Override
    public X937CreditReconciliationRecord creditAccountNumberOnUs(String value) {
        return super.creditAccountNumberOnUs(value);
    }

    @Override
    public long itemAmountAsLong() throws InvalidDataException {
        return super.itemAmountAsLong();
    }

    @Override
    public X937CreditReconciliationRecord itemAmount(long value) {
        return super.itemAmount(value);
    }

    @Override
    public String ECEInstitutionItemSequenceNumber() {
        return super.ECEInstitutionItemSequenceNumber();
    }

    @Override
    public X937CreditReconciliationRecord ECEInstitutionItemSequenceNumber(String value) {
        return super.ECEInstitutionItemSequenceNumber(value);
    }

    @Override
    public String documentationTypeIndicator() {
        return super.documentationTypeIndicator();
    }

    @Override
    public X937CreditReconciliationRecord documentationTypeIndicator(String value) {
        return super.documentationTypeIndicator(value);
    }

    @Override
    public String typeOfAccountCode() {
        return super.typeOfAccountCode();
    }

    @Override
    public X937CreditReconciliationRecord typeOfAccountCode(String value) {
        return super.typeOfAccountCode(value);
    }

    @Override
    public String sourceOfWorkCode() {
        return super.sourceOfWorkCode();
    }

    @Override
    public X937CreditReconciliationRecord sourceOfWorkCode(String value) {
        return super.sourceOfWorkCode(value);
    }

    @Override
    public String workType() {
        return super.workType();
    }

    @Override
    public X937CreditReconciliationRecord workType(String value) {
        return super.workType(value);
    }

    @Override
    public String debitCreditIndicator() {
        return super.debitCreditIndicator();
    }

    @Override
    public X937CreditReconciliationRecord debitCreditIndicator(String value) {
        return super.debitCreditIndicator(value);
    }

    @Override
    public String reserved() {
        return getFieldAsString(field(13));
    }
}
