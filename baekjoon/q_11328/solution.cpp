#include <bits/stdc++.h>
using namespace std;

int testCase;
string a, b;
char aCase[26];
char bCase[26];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> testCase;

    while (testCase-- > 0) {
        cin >> a >> b;

        fill(aCase, aCase+26, 0);
        fill(bCase, bCase+26, 0);

        for (int i=0; i<a.size(); i++)
            aCase[a[i] - 'a']++;
        
        for (int i=0; i<b.size(); i++)
            bCase[b[i] - 'a']++;

        bool possible = true;;
        for (int i=0; i<26; i++) {
            if (aCase[i] != bCase[i]) {
                possible = false;
                break;
            }
        }
        cout << (possible ? "Possible" : "Impossible") << "\n";
    }
    return 0;
}