package LibraryBase;

public class EmailAddress {
    private String email;
    private String someData;

    public EmailAddress(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    @Override
    public String toString() {
        return "\nEmailAddress{" +
                "e-mail='" + email + '\'' +
                '}';
    }
}
