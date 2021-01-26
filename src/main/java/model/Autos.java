package model;

import javax.persistence.*;

@Entity
public class Autos {
    private int autoId;
    private String model;
    private int speed;
    private String color;

    private Persons person;

    @ManyToOne
    @JoinColumn(name = "person_id_fk")
    public Persons getPerson() {
        return person;
    }

    public void setPerson(Persons person) {
        this.person = person;
    }

    @Id
    @Column(name = "auto_id", nullable = false)
    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    @Basic
    @Column(name = "model", nullable = true, length = 30)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "speed", nullable = false)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "color", nullable = false, length = 10)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autos autos = (Autos) o;

        if (autoId != autos.autoId) return false;
        if (speed != autos.speed) return false;
        if (model != null ? !model.equals(autos.model) : autos.model != null) return false;
        if (color != null ? !color.equals(autos.color) : autos.color != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autoId;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + speed;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
