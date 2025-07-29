#include<iostream>
#include<cmath>
using namespace std;

int main(){
    int arr[100];
    int count=0;

    for(int i=2; i<=100; i++){
        bool isPrime= true;
        for(int j=2; j<i; j++){
            if(i%j==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            arr[count]=i;
            count++;
        }
    }
    for(int i=0; i<count; i++){
        cout<<arr[i]<<"  ";
    }
    
}