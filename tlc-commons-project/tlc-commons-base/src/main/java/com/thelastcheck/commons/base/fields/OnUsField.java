/**
 * ****************************************************************************
 * Copyright (c) 2009-2015 The Last Check, LLC, All Rights Reserved
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ****************************************************************************
 */

package com.thelastcheck.commons.base.fields;

public class OnUsField {

    public static final String STRING_20 = "                    ";

    private String optionalField4;
    private String accountNumber;
    private String tranCode;

    public static OnUsField valueOf(String onusValue) {
        return new OnUsField(onusValue);
    }

    @SuppressWarnings("unused")
    private OnUsField() {
    }

    public OnUsField(String value) {
        parse(value);
    }

    public OnUsField(String optionalField4,
                     String accountNumber,
                     String tranCode) {
        this.optionalField4 = optionalField4.trim();
        this.accountNumber = accountNumber.trim();
        this.tranCode = tranCode.trim();
    }

    private void parse(String value) {
        optionalField4 = "";
        accountNumber = "";
        tranCode = "";
        int token = value.lastIndexOf('/');
        if (token == -1) {
            tranCode = value.trim();
            return;
        }
        tranCode = value.substring(token + 1).trim();
        value = value.substring(0, token);
        token = value.lastIndexOf('/');
        if (token == -1) {
            accountNumber = value.trim();
            return;
        }
        optionalField4 = value.substring(0, token).trim();
        accountNumber = value.substring(token + 1).trim();
    }

    /**
     * @return the optionalField4
     */
    public String getOptionalField4() {
        return optionalField4;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the tranCode
     */
    public String getTranCode() {
        return tranCode;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof OnUsField) {
            OnUsField anOnUsField = (OnUsField) anObject;
            if (this.optionalField4.equals(anOnUsField.optionalField4)
                    && this.accountNumber.equals(anOnUsField.accountNumber)
                    && this.tranCode.equals(anOnUsField.tranCode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(20);
        if (optionalField4.length() > 0) {
            sb.append(optionalField4);
            sb.append("/");
        }
        if (accountNumber.length() > 0) {
            sb.append(accountNumber);
            sb.append("/");
        } else {
            if (sb.length() > 0) {
                sb.append("/");
            }
        }
        if (tranCode.length() > 0) {
            sb.append(tranCode);
        }
        String s = sb.toString();
        if (s.length() > 20) {
            s = s.substring(s.length() - 20);
        }
        if (s.length() < 20) {
            s = STRING_20.substring(0, 20 - s.length()) + s;
        }
        return s;
    }
}
