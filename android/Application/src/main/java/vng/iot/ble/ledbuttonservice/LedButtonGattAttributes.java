/*
 * Copyright (C) 2017 VNG IoT Lab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vng.iot.ble.ledbuttonservice;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class LedButtonGattAttributes {

    /**
     *  brief      UUID cho các services và characteristic
     */
    //Service gồm 2 characteristics
    public static final String led_button_service_uuid    = "0000FFF8-0000-1000-8000-00805F9B34FB";
    public static final String led_char_uuid              = "0000FFF9-0000-1000-8000-00805F9B34FB";  //WRITE-uchar
    public static final String button_char_uuid           = "0000FFFA-0000-1000-8000-00805F9B34FB";  //NOTIFY-uchar

    public static final int LED_ON = 0;
    public static final int LED_OFF = 1;

    private static HashMap<String, String> attributes = new HashMap();
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        attributes.put(led_button_service_uuid, "LED_BUTTON_SERVICE");
        attributes.put(led_char_uuid, "LED");
        attributes.put(button_char_uuid, "BUTTON");        
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
