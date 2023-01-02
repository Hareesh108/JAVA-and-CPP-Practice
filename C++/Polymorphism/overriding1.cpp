#include <iostream>
using namespace std;
class Animal
{
public:
    void eat()
    {
        cout << "Eating...";
    }
};
class Dog : public Animal
{
public:
    void eat()
    {
        cout << "Eating bread...";
    }
};
int main(void)
{
    Animal t = Dog();
    t.eat();
    cout << endl;
    Dog t1 = Dog();
    t1.eat();
    return 0;
}