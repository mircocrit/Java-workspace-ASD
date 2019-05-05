package Rivista2.Interface;

public interface AddOnlyList<S> extends Iterable<S> {

	public void add(S e);

	public String toString();
}