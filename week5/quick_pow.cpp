#include <bits/stdc++.h>
using namespace std;

int quickPow(int a, int n) {
    int result = 1;
    while (n > 0) {
        if( n % 2 == 1 )
            result = result * a % 100;
        a = a*a % 100;
        n = n/2;
    }
    return result;
}

int main() {
    // cout << quickPow(2, 10) | expected output = 24
}

