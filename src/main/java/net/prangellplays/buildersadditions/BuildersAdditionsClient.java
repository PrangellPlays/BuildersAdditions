package net.prangellplays.buildersadditions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.prangellplays.buildersadditions.particle.dye.*;

public class BuildersAdditionsClient implements ClientModInitializer {

	//Black
	public static DefaultParticleType DRIPPING_BLACK_DYE;
	public static DefaultParticleType FALLING_BLACK_DYE;
	public static DefaultParticleType LANDING_BLACK_DYE;

	//Blue
	public static DefaultParticleType DRIPPING_BLUE_DYE;
	public static DefaultParticleType FALLING_BLUE_DYE;
	public static DefaultParticleType LANDING_BLUE_DYE;

	//Brown
	public static DefaultParticleType DRIPPING_BROWN_DYE;
	public static DefaultParticleType FALLING_BROWN_DYE;
	public static DefaultParticleType LANDING_BROWN_DYE;

	//Cyan
	public static DefaultParticleType DRIPPING_CYAN_DYE;
	public static DefaultParticleType FALLING_CYAN_DYE;
	public static DefaultParticleType LANDING_CYAN_DYE;

	//Gray
	public static DefaultParticleType DRIPPING_GRAY_DYE;
	public static DefaultParticleType FALLING_GRAY_DYE;
	public static DefaultParticleType LANDING_GRAY_DYE;

	//Green
	public static DefaultParticleType DRIPPING_GREEN_DYE;
	public static DefaultParticleType FALLING_GREEN_DYE;
	public static DefaultParticleType LANDING_GREEN_DYE;

	//Light Blue
	public static DefaultParticleType DRIPPING_LIGHT_BLUE_DYE;
	public static DefaultParticleType FALLING_LIGHT_BLUE_DYE;
	public static DefaultParticleType LANDING_LIGHT_BLUE_DYE;

	//Light Gray
	public static DefaultParticleType DRIPPING_LIGHT_GRAY_DYE;
	public static DefaultParticleType FALLING_LIGHT_GRAY_DYE;
	public static DefaultParticleType LANDING_LIGHT_GRAY_DYE;

	//Lime
	public static DefaultParticleType DRIPPING_LIME_DYE;
	public static DefaultParticleType FALLING_LIME_DYE;
	public static DefaultParticleType LANDING_LIME_DYE;

	//Magenta
	public static DefaultParticleType DRIPPING_MAGENTA_DYE;
	public static DefaultParticleType FALLING_MAGENTA_DYE;
	public static DefaultParticleType LANDING_MAGENTA_DYE;

	//Orange
	public static DefaultParticleType DRIPPING_ORANGE_DYE;
	public static DefaultParticleType FALLING_ORANGE_DYE;
	public static DefaultParticleType LANDING_ORANGE_DYE;

	//Pink
	public static DefaultParticleType DRIPPING_PINK_DYE;
	public static DefaultParticleType FALLING_PINK_DYE;
	public static DefaultParticleType LANDING_PINK_DYE;

	//Purple
	public static DefaultParticleType DRIPPING_PURPLE_DYE;
	public static DefaultParticleType FALLING_PURPLE_DYE;
	public static DefaultParticleType LANDING_PURPLE_DYE;

	//Red
	public static DefaultParticleType DRIPPING_RED_DYE;
	public static DefaultParticleType FALLING_RED_DYE;
	public static DefaultParticleType LANDING_RED_DYE;

	//White
	public static DefaultParticleType DRIPPING_WHITE_DYE;
	public static DefaultParticleType FALLING_WHITE_DYE;
	public static DefaultParticleType LANDING_WHITE_DYE;

	//Yellow
	public static DefaultParticleType DRIPPING_YELLOW_DYE;
	public static DefaultParticleType FALLING_YELLOW_DYE;
	public static DefaultParticleType LANDING_YELLOW_DYE;

	@Override
	public void onInitializeClient() {
		//Black
		DRIPPING_BLACK_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_black_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_BLACK_DYE, BlackDyeParticle.DrippingBlackDyeFactory::new);
		FALLING_BLACK_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_black_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_BLACK_DYE, BlackDyeParticle.FallingBlackDyeFactory::new);
		LANDING_BLACK_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_black_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_BLACK_DYE, BlackDyeParticle.LandingBlackDyeFactory::new);

		//Blue
		DRIPPING_BLUE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_blue_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_BLUE_DYE, BlueDyeParticle.DrippingBlueDyeFactory::new);
		FALLING_BLUE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_blue_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_BLUE_DYE, BlueDyeParticle.FallingBlueDyeFactory::new);
		LANDING_BLUE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_blue_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_BLUE_DYE, BlueDyeParticle.LandingBlueDyeFactory::new);

		//BROWN
		DRIPPING_BROWN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_brown_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_BROWN_DYE, BrownDyeParticle.DrippingBrownDyeFactory::new);
		FALLING_BROWN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_brown_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_BROWN_DYE, BrownDyeParticle.FallingBrownDyeFactory::new);
		LANDING_BROWN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_brown_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_BROWN_DYE, BrownDyeParticle.LandingBrownDyeFactory::new);

		//CYAN
		DRIPPING_CYAN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_cyan_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_CYAN_DYE, CyanDyeParticle.DrippingCyanDyeFactory::new);
		FALLING_CYAN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_cyan_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_CYAN_DYE, CyanDyeParticle.FallingCyanDyeFactory::new);
		LANDING_CYAN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_cyan_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_CYAN_DYE, CyanDyeParticle.LandingCyanDyeFactory::new);

		//GRAY
		DRIPPING_GRAY_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_gray_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_GRAY_DYE, GrayDyeParticle.DrippingGrayDyeFactory::new);
		FALLING_GRAY_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_gray_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_GRAY_DYE, GrayDyeParticle.FallingGrayDyeFactory::new);
		LANDING_GRAY_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_gray_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_GRAY_DYE, GrayDyeParticle.LandingGrayDyeFactory::new);

		//GREEN
		DRIPPING_GREEN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_green_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_GREEN_DYE, GreenDyeParticle.DrippingGreenDyeFactory::new);
		FALLING_GREEN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_green_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_GREEN_DYE, GreenDyeParticle.FallingGreenDyeFactory::new);
		LANDING_GREEN_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_green_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_GREEN_DYE, GreenDyeParticle.LandingGreenDyeFactory::new);

		//LIGHT BLUE
		DRIPPING_LIGHT_BLUE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_light_blue_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_LIGHT_BLUE_DYE, LightBlueDyeParticle.DrippingLightBlueDyeFactory::new);
		FALLING_LIGHT_BLUE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_light_blue_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_LIGHT_BLUE_DYE, LightBlueDyeParticle.FallingLightBlueDyeFactory::new);
		LANDING_LIGHT_BLUE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_light_blue_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_LIGHT_BLUE_DYE, LightBlueDyeParticle.LandingLightBlueDyeFactory::new);

		//LIGHT GRAY
		DRIPPING_LIGHT_GRAY_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_light_gray_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_LIGHT_GRAY_DYE, LightGrayDyeParticle.DrippingLightGrayDyeFactory::new);
		FALLING_LIGHT_GRAY_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_light_gray_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_LIGHT_GRAY_DYE, LightGrayDyeParticle.FallingLightGrayDyeFactory::new);
		LANDING_LIGHT_GRAY_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_light_gray_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_LIGHT_GRAY_DYE, LightGrayDyeParticle.LandingLightGrayDyeFactory::new);

		//LIME
		DRIPPING_LIME_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_lime_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_LIME_DYE, LimeDyeParticle.DrippingLimeDyeFactory::new);
		FALLING_LIME_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_lime_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_LIME_DYE, LimeDyeParticle.FallingLimeDyeFactory::new);
		LANDING_LIME_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_lime_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_LIME_DYE, LimeDyeParticle.LandingLimeDyeFactory::new);

		//MAGENTA
		DRIPPING_MAGENTA_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_magenta_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_MAGENTA_DYE, MagentaDyeParticle.DrippingMagentaDyeFactory::new);
		FALLING_MAGENTA_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_magenta_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_MAGENTA_DYE, MagentaDyeParticle.FallingMagentaDyeFactory::new);
		LANDING_MAGENTA_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_magenta_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_MAGENTA_DYE, MagentaDyeParticle.LandingMagentaDyeFactory::new);

		//ORANGE
		DRIPPING_ORANGE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_orange_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_ORANGE_DYE, OrangeDyeParticle.DrippingOrangeDyeFactory::new);
		FALLING_ORANGE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_orange_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_ORANGE_DYE, OrangeDyeParticle.FallingOrangeDyeFactory::new);
		LANDING_ORANGE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_orange_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_ORANGE_DYE, OrangeDyeParticle.LandingOrangeDyeFactory::new);

		//PINK
		DRIPPING_PINK_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_pink_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_PINK_DYE, PinkDyeParticle.DrippingPinkDyeFactory::new);
		FALLING_PINK_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_pink_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_PINK_DYE, PinkDyeParticle.FallingPinkDyeFactory::new);
		LANDING_PINK_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_pink_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_PINK_DYE, PinkDyeParticle.LandingPinkDyeFactory::new);

		//PURPLE
		DRIPPING_PURPLE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_purple_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_PURPLE_DYE, PurpleDyeParticle.DrippingPurpleDyeFactory::new);
		FALLING_PURPLE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_purple_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_PURPLE_DYE, PurpleDyeParticle.FallingPurpleDyeFactory::new);
		LANDING_PURPLE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_purple_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_PURPLE_DYE, PurpleDyeParticle.LandingPurpleDyeFactory::new);

		//RED
		DRIPPING_RED_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_red_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_RED_DYE, RedDyeParticle.DrippingRedDyeFactory::new);
		FALLING_RED_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_red_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_RED_DYE, RedDyeParticle.FallingRedDyeFactory::new);
		LANDING_RED_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_red_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_RED_DYE, RedDyeParticle.LandingRedDyeFactory::new);

		//WHITE
		DRIPPING_WHITE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_white_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_WHITE_DYE, WhiteDyeParticle.DrippingWhiteDyeFactory::new);
		FALLING_WHITE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_white_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_WHITE_DYE, WhiteDyeParticle.FallingWhiteDyeFactory::new);
		LANDING_WHITE_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_white_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_WHITE_DYE, WhiteDyeParticle.LandingWhiteDyeFactory::new);

		//YELLOW
		DRIPPING_YELLOW_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:dripping_yellow_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(DRIPPING_YELLOW_DYE, YellowDyeParticle.DrippingYellowDyeFactory::new);
		FALLING_YELLOW_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:falling_yellow_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(FALLING_YELLOW_DYE, YellowDyeParticle.FallingYellowDyeFactory::new);
		LANDING_YELLOW_DYE = Registry.register(Registries.PARTICLE_TYPE, "buildersadditions:landing_yellow_dye", FabricParticleTypes.simple(true));
		ParticleFactoryRegistry.getInstance().register(LANDING_YELLOW_DYE, YellowDyeParticle.LandingYellowDyeFactory::new);

	}
}