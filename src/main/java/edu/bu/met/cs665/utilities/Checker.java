package edu.bu.met.cs665.utilities;

import edu.bu.met.cs665.email.Email;

/**
 * The purpose of this class is to implement observer pattern to add hoc
 * checking functionality for Email subclasses.
 *
 * @author Michael Kramer
 *
 * <p>CS665 Spring 2, 2022 Software Design Patterns</p>
 */
public abstract class Checker extends Email { // IS-A relationship

  private Email email; // HAS-A relationship

  public abstract void assembleEmail();

  public abstract String check(String element);

  public Email getEmail() {
    return this.email;
  }

  public void setEmail(Email email) {
    this.email = email;
  }
}
