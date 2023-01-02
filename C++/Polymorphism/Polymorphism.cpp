#include <iostream>

using namespace std;

class IEmployee {
   virtual void promotion() = 0;
};

class Employee : IEmployee{ 
private:
    string Company;
    int Age;

protected:
        string Name;
public:
    void setName(string name) //Getter
    {
        Name = name;
    }
    string getName() //Setter
    {
        return Name;
    }
    void setCompany(string company)
    {
        Company = company;
    }
    string getCompany()
    {
        return Company;
    }
    void setAge(int age)
    {
        Age =age;
    }
    int getAge()
    {
        return Age;
    }

    void introduce() //Method
    {
        cout << "Name : " << Name << endl;
        cout << "Company : " << Company << endl;
        cout << "Age : " << Age << endl;
    }

    Employee(string name, string company, int age) //CONSTRUCTOR
    {
        Name = name;
        Company = company;
        Age = age;
    }

    void promotion()
    {
        if(Age > 20)
            cout << Name << " got promoted." << endl;
        else 
            cout << Name << " Sorry, you dont have experince." << endl;
    }

    void work()
    {
        cout << Name << " checking emails...." << endl;
    }

};

class Developer : public Employee
{
public:
    string FavLanguage;

    Developer(string name, string company, int age, string Favlanguage) : Employee(name, company, age) //CONSTRUCTOR
    {
        FavLanguage = Favlanguage;
    }
    void FixBug()
    {
        cout << Name << " from " << getCompany() << " fixed bug using " << FavLanguage << endl;
    }
    void work()
    {
        cout << Name << " checking codes...." << endl;
    }
};


int main()
{ 
    Developer d = Developer("Hareesh", "Prince", 22, "C++");
    d.promotion();
    d.work();

    // parent class reference is used to refer to a child class object.
    Employee *e = &d;
    e -> work();

}