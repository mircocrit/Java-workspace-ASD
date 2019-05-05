package bag;

import java.util.Iterator;

public class DictArrayIterator<K> implements Iterator<K> {
	DictArray diz;
	int n;
	
	 public DictArrayIterator(DictArray diz) {	this.diz=diz;this.n=0;}

	@Override
	public boolean hasNext() {	return diz.S[n]!=null;}	//array di object s[] in dictarray

	@Override
	public K next() {	//k e' il tipo
		int p=n;	//mi copio n
		n++;
		return (K) ((Coppia)diz.S[p]).key;//coppia sta sotto
	}
	
	@Override
	public void remove() {}
}
