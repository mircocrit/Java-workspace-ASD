class Pos{
	Pos succ;
	Pos pred;
	Object v;
	
	Pos(Object v) {		succ = pred = null;	this.v = v;}//costruttore di copia
	
	public class List{
		private Pos head;
		private Pos tail;
		
		public List() {			head=tail=null;}	//costruttore
		
		public Pos head()	{return head;}
		public Pos tail()	{return tail;}
		public Pos next(Pos pos)	{return (pos!=null? pos.succ : null);}
		public Pos prev(Pos pos)	{return (pos!=null? pos.pred : null);}
		public boolean finished(Pos pos) {return pos ==null;}
		public boolean isEmpty() {return head ==null;}	
		}
}