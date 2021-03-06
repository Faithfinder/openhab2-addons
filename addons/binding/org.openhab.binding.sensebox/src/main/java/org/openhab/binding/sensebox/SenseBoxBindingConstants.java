/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.sensebox;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link SenseBoxBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Hakan Tandogan - Initial contribution
 */
public class SenseBoxBindingConstants {

    public static final String BINDING_ID = "sensebox";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_BOX = new ThingTypeUID(BINDING_ID, "box");

    // List of all Channel ids
    public static final String CHANNEL_LOCATION = "descriptors#location";

    public static final String CHANNEL_UV_INTENSITY = "measurements#uvIntensity";
    public static final String CHANNEL_LUMINANCE = "measurements#luminance";
    public static final String CHANNEL_PRESSURE = "measurements#pressure";
    public static final String CHANNEL_HUMIDITY = "measurements#humidity";
    public static final String CHANNEL_TEMPERATURE = "measurements#temperature";
    public static final String CHANNEL_PARTICULATE_MATTER_2_5 = "measurements#particulateMatter2dot5";
    public static final String CHANNEL_PARTICULATE_MATTER_10 = "measurements#particulateMatter10";

    public static final String CHANNEL_UV_INTENSITY_LR = "lastReported#uvIntensityLastReported";
    public static final String CHANNEL_LUMINANCE_LR = "lastReported#luminanceLastReported";
    public static final String CHANNEL_PRESSURE_LR = "lastReported#pressureLastReported";
    public static final String CHANNEL_HUMIDITY_LR = "lastReported#humidityLastReported";
    public static final String CHANNEL_TEMPERATURE_LR = "lastReported#temperatureLastReported";
    public static final String CHANNEL_PARTICULATE_MATTER_2_5_LR = "lastReported#particulateMatter2dot5LastReported";
    public static final String CHANNEL_PARTICULATE_MATTER_10_LR = "lastReported#particulateMatter10LastReported";

    // List of all Property names
    public static final String PROPERTY_NAME = "Name";
    public static final String PROPERTY_EXPOSURE = "Exposure";
    public static final String PROPERTY_IMAGE_URL = "ImageUrl";
    public static final String PROPERTY_MAP_URL = "MapUrl";

    // Base URL of the API server
    public static final String SENSEMAP_API_URL_BASE = "https://api.opensensemap.org";
    public static final String SENSEMAP_IMAGE_URL_BASE = "https://opensensemap.org/userimages";
    public static final String SENSEMAP_MAP_URL_BASE = "https://opensensemap.org";

    // Minimum timeslice between API requests in seconds
    public static final int MINIMUM_UPDATE_INTERVAL = 5 * 60;
}
