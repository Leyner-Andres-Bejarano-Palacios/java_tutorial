# why is this linear ????



# Example 1
### matrix-matrix multiplication (square matrices) a[][]*b[][] = c[][]

int N = a.length;
double[][] c = new double[N][N];
for (int i = 0; i < N; i++)
for (int j = 0; j < N; j++)
{ // Compute dot product of row i and column j.
for (int k = 0; k < N; k++)
	c[i][j] += a[i][k]*b[k][j];
}
	a[N-i-1] = temp;
}


