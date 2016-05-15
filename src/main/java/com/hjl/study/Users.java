package com.hjl.study;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name="users")
@XmlAccessorType(XmlAccessType.NONE)
public class Users 
{
  @XmlElement(name="user")
  private Collection<User> users;

  public Collection<User> getUsers() {
    return users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
  }
}
