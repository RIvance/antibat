package org.ivance.antibat.fabric;

import org.ivance.antibat.Antibat;
import net.fabricmc.api.ModInitializer;

public class AntibatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Antibat.init();
    }
}