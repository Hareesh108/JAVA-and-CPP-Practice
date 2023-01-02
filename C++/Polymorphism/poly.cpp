#include <iostream>

using namespace std;

// // Function Overloading
// class Harry
// {
// public:
//     void fun()
//     {
//         cout << "Function with no arguments." << endl;
//     }
//     void fun(int x)
//     {
//         cout << "Function with one int argument." << endl;
//     }
//     void fun(double x)
//     {
//         cout << "Function with double arguments" << endl;
//     }

// };

// int main()
// {
//     Harry object1;
//     object1.fun();
//     object1.fun(10);
//     object1.fun(15.10);

//     return 0;
// }

// Operator Overloading
// #include <iostream>

// using namespace std;

// class Complex 
// {
// private:
//     int real, img;

// public:
//     Complex(int R = 0, int I = 0)
//     {
//         real = R;
//         img = I;
//     }
//     Complex operator + (Complex const &obj) {
//          Complex res;
//          res.real = real + obj.real;
//          res.img = img + obj.img;
//          return res;
//     }
//     void method()
//     {
//         cout << real << " + i" << img << endl;
//     }
// };

// int main()
// {
//     Complex c1(10, 5), c2(2, 4);
//     Complex c3 = c1 + c2; // An example call to "operator+"
//     c3.method();
//     return 0;
// }

// Runtime polymorphism
// C++ program for function overriding
  
class base
{
public:
    void print ()
    { cout<< "print base class" <<endl; }
   
     virtual void show ()
    { cout<< "show base class" <<endl; }
};
   
class derived:public base
{
public:
    void print () //print () is already virtual function in derived class, we could also declared as virtual void print () explicitly
    { cout<< "print derived class" <<endl; }
   
    void show ()
    { cout<< "show derived class" <<endl; }
};
  
//main function
int main() 
{
    base *bptr;
    derived d;
    bptr = &d;
       
    //virtual function, binded at runtime (Runtime polymorphism)
    bptr->print(); 
       
    // Non-virtual function, binded at compile time
    bptr->show(); 
  
    return 0;
} 

