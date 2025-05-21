#include <bits/stdc++.h>
using namespace std;

int alphabet[26];   // 전역에다가 선언하면 초기화할 필요가 없음...
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s;
    cin >> s;
    
    // int alphabet[26] = {0};
    int len = s.length();
    for (int i=0; i<len; i++)
        alphabet[s[i]-'a']++;

    for (int i=0; i<26; i++)
        cout << alphabet[i] << " ";
}