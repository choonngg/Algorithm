#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    queue<int> Q;

    string c;
    cin >> n;

    while (n--) {
        cin >> c;

        if (c == "push") {
            int x;
            cin >> x;
            Q.push(x);

        }
        else if (c == "pop") {
            if (Q.empty()) cout << -1 << "\n";
            else {
                cout << Q.front() << "\n";
                Q.pop();
            }

        }
        else if (c == "size") {
            cout << Q.size() << "\n";

        }
        else if (c == "empty") {
            cout << (Q.empty() ? 1 : 0) << "\n";

        }
        else if (c == "front") {
            if (Q.empty()) cout << -1 << "\n";
            else cout << Q.front() << "\n";

        }
        else if (c == "back") {
            if (Q.empty()) cout << -1 << "\n";
            else cout << Q.back() << "\n";

        }
    }
}