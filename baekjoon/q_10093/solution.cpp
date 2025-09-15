#include <bits/stdc++.h>
using namespace std;

long long a, b;
long long amount;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    // a, b입력 + 크기 고려
    cin >> a >> b;
    if (a > b) {
        swap(a, b);
    }

    // 두 수 사이 개수
    if (a == b) amount = 0;
    else amount = b - a - 1;
    cout << amount << "\n";

    // 두 수 사이 수 오름차순 출력
    for (long long i=1; i<=amount; i++) {
        cout << a + i << " ";
    }
}