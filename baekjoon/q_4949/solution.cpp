#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    while(true) {
        string input;
        getline(cin, input);
        if (!input.compare(".")) break;

        stack<char> S;
        bool isTrue = true;
        for (char c : input) {
            if (c == '(' || c == '[') S.push(c);
            if (c == ')' || c == ']') {
                if (S.empty()) {
                    isTrue = false;
                    break;
                }

                if (c == ')') {
                    if (S.top() != '(') {
                        isTrue = false;
                        break;

                    } else {
                        S.pop();
                    }
                } else if (c == ']') {
                    if (S.top() != '[') {
                        isTrue = false;
                        break;

                    } else {
                        S.pop();
                    }
                }
            }
        }
        if (!S.empty()) isTrue = false;
        cout << (isTrue ? "yes" : "no") << "\n";
    }
}