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

package com.thelastcheck.io.x937.records;

import com.thelastcheck.commons.base.exception.InvalidDataException;
import com.thelastcheck.io.x9.X9Record;

public interface X937ReturnAddendumCRecord extends X9Record {


    /*
     * X937ReturnAddendumCRecord
     */

    String variableSizeRecordIndicator();

    X937ReturnAddendumCRecord variableSizeRecordIndicator(String value);

    String microfilmArchiveSequenceNumber();

    X937ReturnAddendumCRecord microfilmArchiveSequenceNumber(String value);

    String lengthOfImageArchiveSequenceNumber();

    public int lengthOfImageArchiveSequenceNumberAsInt()
            throws InvalidDataException;

    String imageArchiveSequenceNumber();

    X937ReturnAddendumCRecord imageArchiveSequenceNumber(String value);

    String description();

    X937ReturnAddendumCRecord description(String value);

    String userField();

    X937ReturnAddendumCRecord userField(String value);

    String reserved();

    X937ReturnAddendumCRecord reserved(String value);

}

