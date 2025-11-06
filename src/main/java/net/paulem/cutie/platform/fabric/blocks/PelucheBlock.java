package net.paulem.cutie.platform.fabric.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PelucheBlock extends Block {
	private static final VoxelShape PELUCHE = makeShape();

	public static VoxelShape makeShape(){
		VoxelShape shape = Shapes.empty();
		shape = Shapes.join(shape, Shapes.box(0.375, 0.0625, 0.4375, 0.625, 0.5, 0.625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.5, 0.375, 0.6875, 0.875, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.875, 0.5, 0.4375, 1.0625, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.5625, 0.875, 0.5, 0.6875, 1.0625, 0.5625), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.4375, 0.23938293868263705, 0.6858575348981985, 0.5625, 0.36438293868263705, 1.0608575348981986), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.3125, 0.0625, 0.5, 0.40625, 0.25, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.59375, 0.0625, 0.5, 0.6875, 0.25, 0.59375), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.0625, 0.5625, 0.625, 0.1875, 0.75), BooleanOp.OR);
		shape = Shapes.join(shape, Shapes.box(0.375, 0.4375, 0.375, 0.625, 0.5, 0.4375), BooleanOp.OR);

		return shape;
	}

	public PelucheBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return PELUCHE;
	}
}
