package webtests.model;


public class UserData {
    private String email;
    private String password;
    private String keepMeSignedIn;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserData userData = (UserData) o;

        if (email != null ? !email.equals(userData.email) : userData.email != null) return false;
        if (password != null ? !password.equals(userData.password) : userData.password != null) return false;
        return keepMeSignedIn != null ? keepMeSignedIn.equals(userData.keepMeSignedIn) : userData.keepMeSignedIn == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (keepMeSignedIn != null ? keepMeSignedIn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", keepMeSignedIn='" + keepMeSignedIn + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public UserData withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getKeepMeSignedIn() {
        return keepMeSignedIn;
    }

    public UserData withKeepMeSignedIn(String keepMeSignedIn) {
        this.keepMeSignedIn = keepMeSignedIn;
        return this;
    }


    public String getEmail() {
        return email;
    }

    public UserData withEmail(String email) {
        this.email = email;
        return this;
    }

}
