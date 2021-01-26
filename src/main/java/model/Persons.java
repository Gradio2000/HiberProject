package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Persons {
    private int personId;
    private String name;
    private int age;
    private String email;
    private String adress;

    private Set<Autos> autosSet;

    public Persons() {
    }

    public Persons(int personId, String name, int age, String email, String adress) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.adress = adress;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    public Set<Autos> getAutosSet() {
        return autosSet;
    }

    public void setAutosSet(Set<Autos> autosSet) {
        this.autosSet = autosSet;
    }

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "adress", nullable = true, length = 45)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persons persons = (Persons) o;

        if (personId != persons.personId) return false;
        if (age != persons.age) return false;
        if (name != null ? !name.equals(persons.name) : persons.name != null) return false;
        if (email != null ? !email.equals(persons.email) : persons.email != null) return false;
        if (adress != null ? !adress.equals(persons.adress) : persons.adress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }
}
