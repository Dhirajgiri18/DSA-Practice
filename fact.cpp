#include<iostream>

using namespace std;
int fact(int num){
    int prod=1;
    for(int i=num; i>=1; i--){
        prod *= i;
    }
    return prod;
}
int main(){
    int a;
    cout<<"Enter the no= ";
    cin>>a;

    int factorial = fact(a);
    
    cout<<"Factorial for the "<<a<<" is "<<factorial;
}
