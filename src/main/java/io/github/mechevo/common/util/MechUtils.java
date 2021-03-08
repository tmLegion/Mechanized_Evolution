package io.github.mechevo.common.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public final class MechUtils {
    public static final String MOD_ID ="mechevo";
    public static final String MOD_NAME = "Mechanized Evolution";

    public static final String RESOURCE_PREFIX = MOD_ID + ":";

    public static final Random RANDOM = new Random();
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

}
