package org.ivance.antibat.forge;

import dev.architectury.platform.forge.EventBuses;
import org.ivance.antibat.Antibat;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Antibat.MOD_ID)
public class AntibatForge {
    public AntibatForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Antibat.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Antibat.init();
    }
}