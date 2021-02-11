# why is this linear ????



# Example 1
### find the maximum of the array values 

double max = a[0];
for (int i = 1; i < a.length; i++)
	if (a[i] > max) max = a[i];


# Example 2
### compute the average of the array values

int N = a.length;
double sum = 0.0;
for (int i = 0; i < N; i++)
	sum += a[i];
double average = sum / N;

# Example 3
### copy to another array

int N = a.length;
double[] b = new double[N];
for (int i = 0; i < N; i++)
	b[i] = a[i];


# Example 4
### reverse the elements within an array

int N = a.length;
for (int i = 0; i < N/2; i++)
{
	double temp = a[i];
	a[i] = a[N-1-i];
	a[N-i-1] = temp;
}


