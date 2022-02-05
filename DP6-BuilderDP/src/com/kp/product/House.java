// House.java (Product - Complex object)
package com.kp.product;

public class House {
	private IBasement basement;
	private IStructure structure;
	private IRoof roof;
	private IInterior interior;

	// setter methods
	public void setBasement(IBasement basement) {
		this.basement = basement;
	}

	public void setStructure(IStructure structure) {
		this.structure = structure;
	}

	public void setRoof(IRoof roof) {
		this.roof = roof;
	}

	public void setInterior(IInterior interior) {
		this.interior = interior;
	}

	// getter methods :- not required

	// toString() method
	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
				+ "]";
	}
}