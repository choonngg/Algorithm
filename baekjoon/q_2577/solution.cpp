#include <bits/stdc++.h>
using namespace std;

int A, B, C;
int number[10];

int main() {
    cin >> A;
    cin >> B;
    cin >> C;

    int mul = A * B * C;
    string mul_itos = to_string(mul);

    for (int i=0; i<mul_itos.size(); i++)
        number[mul_itos[i] - '0']++;

    for (int i=0; i<10; i++)
        cout << number[i] << "\n";

    return 0;
}