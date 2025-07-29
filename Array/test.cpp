#include <bits/stdc++.h>
using namespace std;

int main() {
    string str = "Coding on CodeChef";
    int length = str.length();

    vector<vector<string>> v;
    vector<string> ans;

    for (int i = 0; i < length; i++) {
        if (str[i] == ' ') {  // Use single quotes for character comparison
            v.push_back(ans);
            ans.clear();
        } else {
            ans.push_back(string(1,str[i]));  // Convert char to string before pushing
        }
    }
    // Don't forget to push the last segment
    v.push_back(ans);

    for (auto it : v) {
        cout << it.size() << endl;
    }

    return 0;
}
