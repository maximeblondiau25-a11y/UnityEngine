package com.unityengine;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("unityengine")
public class UnityEngine {
    public static final Logger LOG = LoggerFactory.getLogger("UnityEngine");

    public UnityEngine(IEventBus bus) {
        LOG.info("UnityEngine chargé");
    }
}
