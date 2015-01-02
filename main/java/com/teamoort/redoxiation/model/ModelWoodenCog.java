package com.teamoort.redoxiation.model;

import com.teamoort.redoxiation.Redoxiation;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWoodenCog extends ModelBase {
    ModelRenderer shape001;
    ModelRenderer shape002;
    ModelRenderer shape003;
    ModelRenderer shape004;
    ModelRenderer shape005;
    ModelRenderer shape006;
    ModelRenderer shape010;
    ModelRenderer shape011;
    ModelRenderer shape012;
    ModelRenderer shape013;
    ModelRenderer shape014;
    ModelRenderer shape015;
    ModelRenderer shape016;
    ModelRenderer shape017;
    ModelRenderer shape018;
    ModelRenderer shape019;
    ModelRenderer shape020;
    ModelRenderer shape021;
    ModelRenderer shape030;
    ModelRenderer shape031;
    ModelRenderer shape032;

    public ModelWoodenCog() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape001 = new ModelRenderer(this, 0, 0);
        this.shape001.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape001.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2);
        this.shape016 = new ModelRenderer(this, 0, 4);
        this.shape016.setRotationPoint(-5.8F, 0.0F, -1.61F);
        this.shape016.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape016, 0.0F, 1.3089969389957472F, 0.0F);
        this.shape019 = new ModelRenderer(this, 0, 4);
        this.shape019.setRotationPoint(-1.55F, 0.0F, 5.8F);
        this.shape019.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape019, 0.0F, -0.2617993877991494F, 0.0F);
        this.shape021 = new ModelRenderer(this, 0, 4);
        this.shape021.setRotationPoint(-5.8F, 0.0F, 1.61F);
        this.shape021.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape021, 0.0F, -1.3089969389957472F, 0.0F);
        this.shape031 = new ModelRenderer(this, 0, 6);
        this.shape031.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape031.addBox(-2.0F, -1.5F, -2.0F, 4, 3, 4);
        this.setRotateAngle(shape031, 0.0F, 0.5235987755982988F, 0.0F);
        this.shape010 = new ModelRenderer(this, 0, 4);
        this.shape010.setRotationPoint(5.8F, 0.0F, 1.61F);
        this.shape010.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape010, 0.0F, 1.3089969389957472F, 0.0F);
        this.shape030 = new ModelRenderer(this, 0, 6);
        this.shape030.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape030.addBox(-2.0F, -1.5F, -2.0F, 4, 3, 4);
        this.shape020 = new ModelRenderer(this, 0, 4);
        this.shape020.setRotationPoint(-4.24F, 0.0F, 4.24F);
        this.shape020.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape020, 0.0F, -0.7853981633974483F, 0.0F);
        this.shape012 = new ModelRenderer(this, 0, 4);
        this.shape012.setRotationPoint(1.55F, 0.0F, 5.8F);
        this.shape012.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape012, 0.0F, 0.2617993877991494F, 0.0F);
        this.shape013 = new ModelRenderer(this, 0, 4);
        this.shape013.setRotationPoint(1.55F, 0.0F, -5.8F);
        this.shape013.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape013, 0.0F, -0.2617993877991494F, 0.0F);
        this.shape032 = new ModelRenderer(this, 0, 6);
        this.shape032.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape032.addBox(-2.0F, -1.5F, -2.0F, 4, 3, 4);
        this.setRotateAngle(shape032, 0.0F, 1.0471975511965976F, 0.0F);
        this.shape006 = new ModelRenderer(this, 0, 0);
        this.shape006.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape006.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2);
        this.setRotateAngle(shape006, 0.0F, 2.6179938779914944F, 0.0F);
        this.shape004 = new ModelRenderer(this, 0, 0);
        this.shape004.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape004.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2);
        this.setRotateAngle(shape004, 0.0F, 1.5707963267948966F, 0.0F);
        this.shape003 = new ModelRenderer(this, 0, 0);
        this.shape003.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape003.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2);
        this.setRotateAngle(shape003, 0.0F, 1.0471975511965976F, 0.0F);
        this.shape014 = new ModelRenderer(this, 0, 4);
        this.shape014.setRotationPoint(4.24F, 0.0F, -4.24F);
        this.shape014.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape014, 0.0F, -0.7853981633974483F, 0.0F);
        this.shape015 = new ModelRenderer(this, 0, 4);
        this.shape015.setRotationPoint(5.8F, 0.0F, -1.61F);
        this.shape015.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape015, 0.0F, -1.3089969389957472F, 0.0F);
        this.shape002 = new ModelRenderer(this, 0, 0);
        this.shape002.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape002.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2);
        this.setRotateAngle(shape002, 0.0F, 0.5235987755982988F, 0.0F);
        this.shape011 = new ModelRenderer(this, 0, 4);
        this.shape011.setRotationPoint(4.24F, 0.0F, 4.24F);
        this.shape011.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape011, 0.0F, 0.7853981633974483F, 0.0F);
        this.shape005 = new ModelRenderer(this, 0, 0);
        this.shape005.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape005.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2);
        this.setRotateAngle(shape005, 0.0F, 2.0943951023931953F, 0.0F);
        this.shape017 = new ModelRenderer(this, 0, 4);
        this.shape017.setRotationPoint(-4.24F, 0.0F, -4.24F);
        this.shape017.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape017, 0.0F, 0.7853981633974483F, 0.0F);
        this.shape018 = new ModelRenderer(this, 0, 4);
        this.shape018.setRotationPoint(-1.55F, 0.0F, -5.8F);
        this.shape018.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1);
        this.setRotateAngle(shape018, 0.0F, 0.2617993877991494F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape001.render(f5);
        this.shape016.render(f5);
        this.shape019.render(f5);
        this.shape021.render(f5);
        this.shape031.render(f5);
        this.shape010.render(f5);
        this.shape030.render(f5);
        this.shape020.render(f5);
        this.shape012.render(f5);
        this.shape013.render(f5);
        this.shape032.render(f5);
        this.shape006.render(f5);
        this.shape004.render(f5);
        this.shape003.render(f5);
        this.shape014.render(f5);
        this.shape015.render(f5);
        this.shape002.render(f5);
        this.shape011.render(f5);
        this.shape005.render(f5);
        this.shape017.render(f5);
        this.shape018.render(f5);
    }
    
    public void renderModel(float f,float f1)
    {
    	
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
