/**
 * Copyright © 2016 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.msg.session.ctrl;

import org.thingsboard.server.common.data.id.SessionId;
import org.thingsboard.server.common.msg.session.SessionCtrlMsg;

public class SessionCloseMsg implements SessionCtrlMsg {

    private final SessionId sessionId;
    private final boolean timeout;

    public SessionCloseMsg(SessionId sessionId, boolean timeout) {
        super();
        this.sessionId = sessionId;
        this.timeout = timeout;
    }

    @Override
    public SessionId getSessionId() {
        return sessionId;
    }

    public boolean isTimeout() {
        return timeout;
    }

}
