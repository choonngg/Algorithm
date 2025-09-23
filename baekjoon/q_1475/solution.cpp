#include <bits/stdc++.h>
using namespace std;

int number[10];
int input;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> input;
    while (input > 0) {
        number[input % 10]++;
        input /= 10;
    }

    number[6] = (number[6] + number[9] + 1) / 2;    // 6과 9의 처리
    number[9] = number[6];

    int answer = 0;
    for (int i=0; i<10; i++) {
        answer = max(answer, number[i]);
    }

    cout << answer;
}