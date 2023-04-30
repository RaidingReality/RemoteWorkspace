
package net.mcreator.greatland.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.greatland.entity.WoodlingEntity;
import net.mcreator.greatland.client.model.ModelWoodling;

public class WoodlingRenderer extends MobRenderer<WoodlingEntity, ModelWoodling<WoodlingEntity>> {
	public WoodlingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWoodling(context.bakeLayer(ModelWoodling.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoodlingEntity entity) {
		return new ResourceLocation("greatland:textures/entities/woodling.png");
	}
}
