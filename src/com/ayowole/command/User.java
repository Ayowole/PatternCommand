package com.ayowole.command;

class User {

    public User() {
    }
    
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        return id.equals( ((User)obj).getId());
    }
    
    @Override
    public String toString() {
        return "["+ id + ", " + name +"]";
    }
    
}
