#include <iostream>
using namespace std;
int fibo(int n)
{
    if (n == 0 || n == 1)
    {
        return n;
    }
    else
    {
        return fibo(n - 1) + fibo(n - 2);
    }
}
int main()
{
    int result = 0;
    for (int i = 0; i < 6; i++)
    {
        result += fibo(i);
        cout << fibo(i) << " ";
    }
    cout << result;
}