/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * © COPYRIGHT 2021 Corporation CAICT All rights reserved.
 * http://www.caict.ac.cn
 */
package cn.bif.model.request;

public class BIFPrivateTransactionSendRequest {
    private String from;
    private String payload;
    private String[] to;
    private String destAddress;

    /**
     * @Method getFrom
     * @Params []
     * @Return java.lang.String
     */
    public String getFrom() {
        return from;
    }

    /**
     * @Method setFrom
     * @Params [from]
     * @Return void
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @Method getPayload
     * @Params []
     * @Return java.lang.String
     */
    public String getPayload() {
        return payload;
    }

    /**
     * @Method setPayload
     * @Params [payload]
     * @Return void
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * @Method getTo
     * @Params []
     * @Return String[]
     */
    public String[] getTo() {
        return to;
    }

    /**
     * @Method setTo
     * @Params [to]
     * @Return void
     */
    public void setTo(String[] to) {
        this.to = to;
    }

     /**
     * @Method getdestAddress
     * @Params []
     * @Return java.lang.String
     */
    public String getdestAddress() {
        return destAddress;
    }

    /**
     * @Method setdestAddress
     * @Params [addr]
     * @Return void
     */
    public void setdestAddress(String addr) {
        this.destAddress = addr;
    }
}
