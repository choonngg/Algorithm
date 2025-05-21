#include <bits/stdc++.h>
using namespace std;

// O(N^2) 풀이
// int func2(int arr[], int N) {
//     for (int i=0; i<N-1; i++) {
//         for (int j=i+1; j<N; j++) {
//             if (arr[i] + arr[j] == 100)
//                 return 1;
//         }
//     }
//     return 0;
// }

// O(N) 풀이
int func2(int arr[], int N) {
    int number[101] = {0};

    for (int i=1; i<N; i++)
        number[arr[i]]++;

    for (int i=1; i<50; i++)
        if (number[i] + number[100-i] >= 2)
            return 1;
    
    return 0;
}

int main() {
    int arr1[] = {1, 52, 48};
    cout << func2(arr1, 3) << "\n";
    int arr2[] = {50, 42};
    cout << func2(arr2, 2) << "\n";
    int arr3[] = {4, 13, 63, 87};
    cout << func2(arr3, 4);
}