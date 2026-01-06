#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    deque<int> DQ;
    while (n--) {
        string input1;
        cin >> input1;
        if (input1 == "push_back") {
            int input2;
            cin >> input2;
            DQ.push_back(input2);
        }
        else if (input1 == "push_front") {
            int input2;
            cin >> input2;
            DQ.push_front(input2);
        }
        else if (input1 == "pop_front") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.front() << "\n";
                DQ.pop_front();
            }
        }
        else if (input1 == "pop_back") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.back() << "\n";
                DQ.pop_back();
            }
        }
        else if (input1 == "size") {
            cout << DQ.size() << "\n";
        }
        else if (input1 == "empty") {
            cout << (DQ.empty() ? 1 : 0) << "\n";
        }
        else if (input1 == "front") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.front() << "\n";
            }
        }
        else if (input1 == "back") {
            if (DQ.empty()) {
                cout << -1 << "\n";
            } else {
                cout << DQ.back() << "\n";
            }
        }
    }
}