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
    Dog obj = Dog();
    obj.eat();
    return 0;
}