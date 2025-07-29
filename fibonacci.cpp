#include <iostream>

using namespace std;
void fib(int num)
{
    int arr[num];
    int t1 = 0;
    int t2 = 1;
    int nextTerm;
    for (int i = 1; i <= num; i++)
    {
        cout << t1 << " ";
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    return;
}
int main()
{
    int n;

    cout << "Enter the nth term" << endl;
    cin >> n;

    fib(n);
}