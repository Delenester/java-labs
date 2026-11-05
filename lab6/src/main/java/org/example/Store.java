package org.example;

class Store {
    private String name;
    private String address;
    private int employeeCount;
    private String category;

    public Store(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public Store(String name,String address,String category, int employeeCount){
        this(name,address,employeeCount,category);

    }

    public Store(String name, String address, int employeeCount,String category) {
        this.name = name;
        this.address = address;
        setEmployeeCount(employeeCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        if (employeeCount >= 0) {
            this.employeeCount = employeeCount;
        }
    }

    public boolean isLarge() {
        return employeeCount > 50;
    }
}
