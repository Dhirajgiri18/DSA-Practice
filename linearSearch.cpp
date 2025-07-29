#include <iostream>

using namespace std;
int main()
{
    int arr[5];
    int n;

    for (int i = 1; i <= 5; i++)
    {
        cout << "Enter the element in the array " << i << " = ";
        cin >> arr[i];
    }

    cout << "Enter the element you want to find =";
    cin >> n;

    for (int i = 0; i < sizeof(arr); i++)
    {
        if (n == i)
        {
            true;
        }
        else
        {
            false;
        }
    }
    if(true){
        cout<<"The element is present in the array";
    }else{
    cout << "Element is not present in the array";
    }
}