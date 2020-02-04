package Lab9.prob3;

public interface QFunction<S,T,U,V,R> {
	R apply(S s, T t, U u, V v);
}
