# to undesrtand this I will need to analize its execution




public static double H(int N)
{
double sum = 0.0;
for (int i = 1; i <= N; i++)
sum += 1.0 / i;
return sum;
}


# My answer, it was linear

# in reality, it was logaritmic


8https://stackoverflow.com/questions/47842330/asymptotic-notation-of-sum-1-i
