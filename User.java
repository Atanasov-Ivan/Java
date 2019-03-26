package example7;

class User extends Person implements Comparable {

    private String userName;
    private String password;

    User(String fName, String lName, int age, String userN, String pass) {
        super(fName, lName, age);
        this.userName = userN;
        this.password = pass;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.userName.equals(((User)obj).userName) &&
                this.password.equals(((User)obj).password) &&
                this.getAge() == ((User)obj).getAge());
    }

    @Override
    public String toString() {
        return "User Name: " + userName + ", " + super.toString();
    }

    @Override
    public int compareTo(Object o) {

        int compU = this.userName.compareTo(((User)o).userName);

        if (compU == 1) {

            int compP = this.password.compareTo(((User)o).password);

            if (compP == 1) {
                return super.compareTo(o);
            } else {
                return compP;
            }
        } else {
            return compU;
        }
    }
}
