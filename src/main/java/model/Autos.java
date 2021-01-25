package model;


public class Autos {

  private long autoId;
  private String model;
  private long speed;
  private String color;
  private long personIdFk;


  public long getAutoId() {
    return autoId;
  }

  public void setAutoId(long autoId) {
    this.autoId = autoId;
  }


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public long getSpeed() {
    return speed;
  }

  public void setSpeed(long speed) {
    this.speed = speed;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public long getPersonIdFk() {
    return personIdFk;
  }

  public void setPersonIdFk(long personIdFk) {
    this.personIdFk = personIdFk;
  }

}
