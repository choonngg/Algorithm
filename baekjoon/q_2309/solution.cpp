#include <bits/stdc++.h>
using namespace std;

int height[9];  // 키
int sum; // 9명 전체합 -> 구해야 하는 값

int main() {
    // 사전 입력
    ios::sync_with_stdio(0);
    cin.tie(0);

    // 9명 입력 받음 + 전체합->구해야하는값
    for(int i=0; i<9; i++) {
        cin >> height[i];
        sum += height[i];
    }
    sum = sum - 100;

    // 오름차순 우선 정렬
    sort(height, height+9);

    // 구해야 하는 값에 맞는 두 개 탐색
    bool found = false;
    for (int i=0; i<8 && !found; i++) {
        for (int j=i+1; j<9; j++) {
            if (height[i] + height[j] == sum) {
                height[i] = 0;
                height[j] = 0;
                found = true;
                break;
            }
        }
    }


    // 결과 값 출력
    for (int i=0; i<9; i++) {
        if (height[i] != 0) cout << height[i] << "\n";
    }
}