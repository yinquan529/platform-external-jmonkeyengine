package com.jme3.scene.plugins.blender.constraints;

import com.jme3.scene.plugins.blender.BlenderContext;
import com.jme3.scene.plugins.blender.animations.Ipo;
import com.jme3.scene.plugins.blender.exceptions.BlenderFileException;
import com.jme3.scene.plugins.blender.file.Structure;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class represents 'Action' constraint type in blender.
 * @author Marcin Roguski (Kaelthas)
 */
/*package*/ class ConstraintLockTrack extends Constraint {
	private static final Logger LOGGER = Logger.getLogger(ConstraintLockTrack.class.getName());
	
	/**
	 * This constructor creates the constraint instance.
	 * 
	 * @param constraintStructure
	 *            the constraint's structure (bConstraint clss in blender 2.49).
	 * @param ownerOMA
	 *            the old memory address of the constraint owner
	 * @param influenceIpo
	 *            the ipo curve of the influence factor
	 * @param blenderContext
	 *            the blender context
	 * @throws BlenderFileException
	 *             this exception is thrown when the blender file is somehow
	 *             corrupted
	 */
	public ConstraintLockTrack(Structure constraintStructure, Long ownerOMA,
			Ipo influenceIpo, BlenderContext blenderContext)
			throws BlenderFileException {
		super(constraintStructure, ownerOMA, influenceIpo, blenderContext);
	}

	@Override
	protected void bakeConstraint() {
		// TODO: implement 'Lock track' constraint
		LOGGER.log(Level.WARNING, "'Lock track' constraint NOT implemented!");
	}
}
