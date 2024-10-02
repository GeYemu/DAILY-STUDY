#include <iostream>
using namespace std;

const int MAX_SIZE = 100;

struct SqList {
    char data[MAX_SIZE];
    int length;
};

void initList(SqList &L) {
    L.length = 0;
}

void Insert(SqList &L, int position, char elem) {
    if (position < 1 || position > L.length + 1) {
        cout << "插入位置不合法" << endl;
        return;
    }
    if (L.length >= MAX_SIZE) {
        cout << "顺序表已满，无法插入" << endl;
        return;
    }

    for (int i = L.length; i >= position; i--) {
        L.data[i] = L.data[i - 1];
    }
    L.data[position - 1] = elem;
    L.length++;
}

void Delete(SqList &L, int position) {
    if (position < 1 || position > L.length) {
        cout << "删除位置不合法" << endl;
        return;
    }

    for (int i = position - 1; i < L.length - 1; i++) {
        L.data[i] = L.data[i + 1];
    }
    L.length--;
}

void PrintList(const SqList &L) {
    for (int i = 0; i < L.length; i++) {
        cout << L.data[i] << " ";
    }
    cout << endl;
}

int main() {
    SqList L;
    initList(L);

    Insert(L, 1, 'a');
    Insert(L, 2, 'b');
    Insert(L, 3, 'c');
    Insert(L, 4, 'd');
    Insert(L, 5, 'e');

    cout << "顺序表中的元素: ";
    PrintList(L);

    cout << "顺序表的第3个元素是: " << L.data[2] << endl;

    Insert(L, 4, 'f');
    cout << "在第4个位置插入'f'后的顺序表: ";
    PrintList(L);

    Delete(L, 3);
    cout << "删除第3个元素后的顺序表: ";
    PrintList(L);

    return 0;
}
