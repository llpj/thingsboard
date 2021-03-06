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
package org.thingsboard.server.extensions.core.plugin.telemetry.cmd;

import lombok.NoArgsConstructor;
import org.thingsboard.server.extensions.core.plugin.telemetry.sub.SubscriptionType;

/**
 * @author Andrew Shvayka
 */
@NoArgsConstructor
public class TimeseriesSubscriptionCmd extends SubscriptionCmd {

    private long timeWindow;

    public TimeseriesSubscriptionCmd(int cmdId, String deviceId, String keys, boolean unsubscribe, long timeWindow) {
        super(cmdId, deviceId, keys, unsubscribe);
        this.timeWindow = timeWindow;
    }

    public long getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(long timeWindow) {
        this.timeWindow = timeWindow;
    }

    @Override
    public SubscriptionType getType() {
        return SubscriptionType.TIMESERIES;
    }
}
