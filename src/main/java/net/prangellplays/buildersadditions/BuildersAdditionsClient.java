package net.prangellplays.buildersadditions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.prangellplays.buildersadditions.particle.BrownPaintParticle;

@SuppressWarnings("unused")
public class BuildersAdditionsClient implements ClientModInitializer {

	public static DefaultParticleType DRIPPING_BROWN_PAINT;
	public static DefaultParticleType FALLING_BROWN_PAINT;
	public static DefaultParticleType LANDING_BROWN_PAINT;

	@Override
	public void onInitializeClient() {
		DRIPPING_BROWN_PAINT = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_brown_paint", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_BROWN_PAINT, BrownPaintParticle.DrippingBrownPaintFactory::new);
		FALLING_BROWN_PAINT = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_brown_paint", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_BROWN_PAINT, BrownPaintParticle.FallingBrownPaintFactory::new);
		LANDING_BROWN_PAINT = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_brown_paint", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_BROWN_PAINT, BrownPaintParticle.LandingBrownPaintFactory::new);
	}
}