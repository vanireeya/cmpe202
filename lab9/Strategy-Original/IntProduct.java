class IntProduct implements Computation<Integer> {

	@Override
	public Integer compute(Integer n, Integer m) {
		System.out.println("Product "+ n+ " * "+m);
		return n * m;
	}
}