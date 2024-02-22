package net.prangellplays.buildersadditions;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.prangellplays.buildersadditions.registry.BuildersAdditionsBlocks;
import net.prangellplays.buildersadditions.registry.BuildersAdditionsItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class BuildersAdditions implements ModInitializer {
	public static final String MOD_ID = "buildersadditions";
	public static final Logger LOGGER = LoggerFactory.getLogger("buildersadditions");

	@Override
	public void onInitialize() {

		BuildersAdditionsBlocks.registerBuildersAdditionsBlocks();
		BuildersAdditionsItems.registerBuildersAdditionsItems();
	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}