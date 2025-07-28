#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    stack<int> S;  

    string command;
    int x;
    
    cin >> n;
    while(n--) {
        cin >> command;
        
        if (!command.compare("push")) {
            cin >> x;
            S.push(x);

        } else if (!command.compare("pop")) {
            if (S.empty()) cout << -1 << "\n";
            else {
                cout << S.top() << "\n";
                S.pop();
            }

        } else if (!command.compare("size")) {
            cout << S.size() << "\n";

        } else if (!command.compare("empty")) {
            cout << (S.empty() ? 1 : 0) << "\n";

        } else {    // top()
            if (S.empty()) cout << -1 << "\n";
            else cout << S.top() << "\n";

        }
    }
}