#include <iostream>
#include <vector>
using namespace std;
class node
{
public:
    int data;
    node *next;
    node(int d)
    {
        data = d;
        next = NULL;
    }
};
void insertT(node *&tail, int d)
{
    node *temp = new node(d);
    tail->next = temp;
    tail = temp;
}
void printN(node *&head)
{
    node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
int pali(node *&head)
{
    vector<int> v;
    node *temp = head;
    while (temp != NULL)
    {
        v.push_back(temp->data);
        temp = temp->next;
    }
    cout << endl;
    int i = 0, j = v.size() - 1;
    while (i < j)
    {
        if (v[i] != v[j])
        {
            return -1;
        }
        i++;
        j--;
    }
    return 1;
}
int main()
{
    node *head = new node(1);
    node *tail = head;
    insertT(tail, 2);
    insertT(tail, 1);
    // insertT(tail, 5);
    printN(head);
    if (pali(head) == 1)
    {
        cout << "palindrom";
    }
    else
    {
        cout << "not palindrom";
    }
}