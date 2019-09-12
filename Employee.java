// ===================================
// Columbus State Community College
// CSCI 2469 - Autumn Semester 2019
// Assignment: lab 2
// Programmer: Arkivious Fischer
// ===================================


package edu.cscc.csci2469.lab2;


/**
 * Simple employee class
 */
public class Employee
{
	
    /** Holds employee's Id number */
    private int id;


    /** Holds Employee's name */
    private String name;


    /** Holds employee's salary */
    private int salary;


    /**
     * Constructor
     * 
     * @param id employee's Id number
     * @param name employee's name
     * @param salary employee's salary
     * 
     * @throws IllegalArgumentException when invalid arguments are supplied
     */
    public Employee(int id, String name, int salary) throws IllegalArgumentException
    {
        super();
        setId(id);
        setName(name);
        setSalary(salary);
    }


    /**
     * get employee id
     * 
     * @return id
     */
    public int getId()
    {
        return id;
    }


    /**
     * set employee id
     * 
     * @param id id to be used (must be > 0 and < 1,000,000)
     * 
     * @throws IllegalArgumentException when id is not valid
     */
    private void setId(int id) throws IllegalArgumentException
    {
        if (id <= 0 || id > 1000000)
        {
            throw new IllegalArgumentException("id must be > 0 and < 1,000,000");
        }

        this.id = id;
    }
 


    /**
     * get employee name
     * 
     * @return name
     */
   public String getName()
    {
        return name;
    }


   /**
    * set employee name
    * 
    * @param name (must not be null or empty string)
    * 
    * @throws IllegalArgumentException when name is not valid
    */
    private void setName(String name) throws IllegalArgumentException
    {
        if (name == null || name.length() == 0)
        {
            throw new IllegalArgumentException("Name must not be a null or empty string");
        }
        this.name = name;
    }


    /**
     * get employee salary
     * 
     * @return salary
     */
   public int getSalary()
    {
        return salary;
    }


   /**
    * set employee salary
    * 
    * @param salary (must be > 0)
    * 
    * @throws IllegalArgumentException when name is not valid
    */
    private void setSalary(int salary) throws IllegalArgumentException
    {
        if (salary <= 0)
        {
            throw new IllegalArgumentException("Salary must be > 0");
        }
        this.salary = salary;
    }
}