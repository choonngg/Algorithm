#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, k;
    cin >> n >> k;

    list<int> L;
    for(int i=1; i<=n; i++) L.push_back(i);
    list<int>::iterator t = L.begin();
    
    list<int> R;
    // 삭제 과정
    while (!L.empty()) {
        for (int i=1; i<k; i++) {
            t++;
            if (t == L.end()) t = L.begin();
        }
        R.push_back(*t);
        t = L.erase(t);
        if (t == L.end()) t=L.begin();
    }

    t = R.begin();
    // 결과 출력
    // for (int i=0; i<n; i++) {
    //     if (i==0) cout << "<" << *t << ", ";    // n=1일 경우, 문제 발생
    //     else if (i==n-1) cout << *t << ">"; 
    //     else cout << *t << ", ";
    //     t++;
    // }
    for (int i=0; i<n; i++) {
        if (n==1) {
            cout << "<" << *t << ">";
            break;
        }
        if (i==0) cout << "<" << *t << ", ";
        else if (i==n-1) cout << *t << ">"; 
        else cout << *t << ", ";
        t++;
    }
}