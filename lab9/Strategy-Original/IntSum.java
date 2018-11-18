class IntSum implements Computation<Integer> {

	@Override
	public Integer compute(Integer n, Integer m) {
		System.out.println("Addition: "+ n+ " + "+m);
		return n + m;
	}

}