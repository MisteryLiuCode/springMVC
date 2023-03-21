package com.liu.web.entity;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class Master {
    private Integer id;
    private String name;
    private Pet pet;//对象的属性是另外一个对象[涉及级联]

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Master{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
