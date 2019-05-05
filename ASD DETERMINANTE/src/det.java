public class det{
	public double det(int ai[][], int i){
		double l = 0;
		if(i == 1)		l = ai[0][0];
		else  if(i == 2){
			l = ai[0][0] * ai[1][1] - ai[0][1] * ai[1][0];
		}else{
			int ai1[][] = new int[i - 1][i - 1];
			for(int k = 0; k < i; k++){
				for(int i1 = 1; i1 < i; i1++){
					int j = 0;
					for(int j1 = 0; j1 < i; j1++)
					if(j1 != k){
						ai1[i1 - 1][j] = ai[i1][j1];
						j++;
					}
				}
				if(k % 2 == 0)
					l += (double)ai[0][k] * det(ai1, i - 1);
				else
					l -= (double)ai[0][k] * det(ai1, i - 1);
			}
		}
		return l;
	}
}