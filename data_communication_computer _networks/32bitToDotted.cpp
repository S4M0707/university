#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<string> getList(string);
void getDottedDecimal(vector<string>);
int bin2dec(string);

int main()
{
    string bin32 = "10001011111100010111110001111110";

    vector<string> binList = getList(bin32);

    getDottedDecimal(binList);

    return 0;
}

vector<string> getList(string str)
{
    vector<string> ans;
    for(int i=0; i<32; i+=8)
        ans.push_back(str.substr(i, 8));

    return ans;
}

void getDottedDecimal(vector<string> v)
{
    vector<int> ans;

    for(string b : v)
        ans.push_back(bin2dec(b));

    for(int x : ans)
        cout << x << '.';
}

int bin2dec(string b)
{
    int ans = 0;
    int mult = 1;

    for(int i= b.size() - 1; i >= 0; i--)
    {
        int val;
        if(b[i] == '0')
            val = 0;
        else if(b[i] == '1')
            val = 1;
        
        ans += val * mult;
        mult *= 2;
    }

    return ans;
}