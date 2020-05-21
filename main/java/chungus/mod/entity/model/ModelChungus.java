package chungus.mod.entity.model;
import javax.swing.text.html.parser.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class ModelChungus extends ModelBase {
	private final ModelRenderer bb_main;

	public ModelChungus() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -19.0F, -4.0F, 14, 18, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 0, -8.0F, -18.0F, -3.0F, 1, 16, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 53, 7.0F, -18.0F, -3.0F, 1, 16, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 59, 31, -6.0F, -16.0F, -6.0F, 12, 13, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 47, 6.0F, -16.0F, -5.0F, 1, 13, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 31, -7.0F, -16.0F, -5.0F, 1, 13, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 46, 63, -4.0F, -27.0F, -2.0F, 8, 8, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 19, 48, -3.0F, -38.0F, 1.0F, 1, 11, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 4.0F, -38.0F, 1.0F, 1, 11, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 0, -5.0F, -38.0F, 1.0F, 1, 11, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 0, 2.0F, -38.0F, 1.0F, 1, 11, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 47, -4.0F, -39.0F, 1.0F, 1, 12, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 47, 3.0F, -39.0F, 1.0F, 1, 12, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 30, 8.0F, -16.0F, 0.0F, 3, 9, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, -11.0F, -16.0F, 0.0F, 3, 9, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 4, -10.0F, -17.0F, 0.0F, 2, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 40, 8.0F, -17.0F, 0.0F, 2, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 41, 47, -8.0F, -1.0F, -7.0F, 2, 1, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 31, 6.0F, -1.0F, -7.0F, 2, 1, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 37, 15, 2.0F, -1.0F, -7.0F, 2, 1, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 47, -4.0F, -1.0F, -7.0F, 2, 1, 15, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 31, -6.0F, -1.0F, -8.0F, 2, 1, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, 4.0F, -1.0F, -8.0F, 2, 1, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 49, 4, 9.0F, -8.0F, -1.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 29, 48, -11.0F, -8.0F, -1.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 35, 48, 9.0F, -7.0F, 0.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 23, 48, -11.0F, -7.0F, 0.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 44, 35, -11.0F, -7.0F, 2.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 44, 31, -11.0F, -7.0F, 4.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 47, 48, 9.0F, -7.0F, 4.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 41, 48, 9.0F, -7.0F, 2.0F, 2, 3, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 2, -6.0F, -17.0F, -5.0F, 12, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 0, -6.0F, -3.0F, -5.0F, 12, 1, 1, 0.0F, false));
	}

	//override was here might need it still
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}