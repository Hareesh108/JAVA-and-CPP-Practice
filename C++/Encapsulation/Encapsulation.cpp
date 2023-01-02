#include <iostream>

using namespace std;

class Employee
{
private:
    string Name;
    string Company;
    int Age;

public:
    void setName(string name) // Getter
    {
        Name = name;
    }
    string getName() // Setter
    {
        return Name;
    }
    void setCompany(string company)
    {
        Company = company;
    }
    string SetCompany()
    {
        return Company;
    }
    void setAge(int age)
    {
        if (age > 18)
            Age = age;
    }
    int getAge()
    {
        return Age;
    }

    void introduce() // Method
    {
        cout << "Name : " << Name << endl;
        cout << "Company : " << Company << endl;
        cout << "Age : " << Age << endl;
    }

    Employee(string name, string company, int age) // CONSTRUCTOR
    {
        Name = name;
        Company = company;
        Age = age;
    }
};

int main()
{
    Employee employee1 = Employee("Hareesh", "Prince", 15);
    employee1.introduce();

    Employee employee2 = Employee("Parasu", "Princr", 25);
    employee2.introduce();
    employee1.setAge(22);
    cout << employee1.getName() << " is " << employee1.getAge() << " years old." << endl;

    return 0;
}