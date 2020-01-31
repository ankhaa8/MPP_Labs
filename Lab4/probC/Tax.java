package Lab4C;

public enum Tax {
	FICA(.23), State(.05), Local(.01), Medicare(.03), SocialSecurity(.075);

	private double val;

	private Tax(double val) {
		this.val = val;
	}

	public double getVal() {
		return val;
	}
}
