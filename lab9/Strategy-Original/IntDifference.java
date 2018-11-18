class IntDifference implements Computation<Integer> {

	@Override
	public Integer compute(Integer n, Integer m) {
		System.out.println("Difference "+ n+ " - "+m);
		return n - m;
	}
}