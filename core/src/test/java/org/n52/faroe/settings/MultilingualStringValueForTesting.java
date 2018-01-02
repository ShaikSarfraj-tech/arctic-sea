/*
 * Copyright 2017-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.faroe.settings;

import org.n52.faroe.SettingType;
import org.n52.faroe.SettingValue;
import org.n52.janmayen.i18n.MultilingualString;

public class MultilingualStringValueForTesting implements
        SettingValue<MultilingualString> {

    private String key;

    private MultilingualString value;

    public MultilingualStringValueForTesting() {
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public MultilingualString getValue() {
        return this.value;
    }

    @Override
    public void setValue(MultilingualString value) {
        this.value = value;
    }

    @Override
    public SettingType getType() {
        return SettingType.MULTILINGUAL_STRING;
    }

}
