/*******************************************************************************
 * Copyright (c) 2009-2015 The Last Check, LLC, All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.thelastcheck.io.x937.records;

import java.util.Date;

import com.thelastcheck.commons.base.exception.InvalidDataException;
import com.thelastcheck.commons.base.fields.OnUsField;
import com.thelastcheck.commons.base.fields.RoutingNumber;
import com.thelastcheck.commons.buffer.ByteArray;
import com.thelastcheck.io.x9.X9Record;

public interface X937ReturnAddendumBRecord extends X9Record {


    /*
     * X937ReturnAddendumBRecord
     */

    String payorBankName();
    X937ReturnAddendumBRecord payorBankName(String value);

    String auxiliaryOnUs();
    X937ReturnAddendumBRecord auxiliaryOnUs(String value);

    String payorBankItemSequenceNumber();
    X937ReturnAddendumBRecord payorBankItemSequenceNumber(String value);

    public Date payorBankBusinessDate()
        throws InvalidDataException;
    X937ReturnAddendumBRecord payorBankBusinessDate(Date value);

    String payorBankBusinessDateAsString();
    X937ReturnAddendumBRecord payorBankBusinessDate(String value);

    String payorAccountName();
    X937ReturnAddendumBRecord payorAccountName(String value);

}

