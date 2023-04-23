public class Contact {
    private String name;
    protected String mobilePhone;

    public Contact(String name, String mobilePhone) {
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    @Override
    public boolean equals(Object obj) {
        Contact o = (Contact) obj;
        return name.equals(o.name);
    }

    @Override
    public String toString() {
        return name + " " + mobilePhone;
    }

    public String getName() {
        return name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

}
