package bg.tyvarna.java;

public class EMailImpl extends EMailMessage implements IEmail, Comparable {

    private int num;
    private String id;
    private String provider;
    //private String message;

    public EMailImpl(int num, String id, String provider, String message) {
        super(message);
        this.num = num;
        this.id = id;
        this.provider = provider;
        //this.message = message;
    }

    public EMailImpl(String str) {

        String[] arg = str.split("-");
        this.num = Integer.parseInt(arg[0]);

        arg = arg[1].split("@");
        this.id = arg[0];

        arg = arg[1].split(":=");
        this.provider = arg[0];

        this.strEMailMessage = arg[1];

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setEMailMessage(String mess) {
        this.strEMailMessage = mess;
    }

    public String getEMailMessage() {
        return strEMailMessage;
    }

    public int compareToId(String id) {

        return this.id.compareTo(id);
    }

    public int compareToMessage(String mess) {
        return this.strEMailMessage.compareTo(mess);
    }

    public int compareTo(Object o) {

        if (this.num < ((EMailImpl)o).num)
            return -1;
        else if (this.num > ((EMailImpl)o).num)
            return 1;
        else
            return 0;
    }

    public String createEmailStr() {

        return (this.num + "-" + this.id + "@" + this.provider + ":=" + this.strEMailMessage);
    }

    public String toString() {
        return "EMailImpl{" +
                "Number=" + num +
                ", ID='" + id + '\'' +
                ", Provider='" + provider + '\'' +
                ", Message='" + strEMailMessage + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EMailImpl eMail = (EMailImpl) o;

        if (num != eMail.num) return false;
        if (id != null ? !id.equals(eMail.id) : eMail.id != null) return false;
        return provider != null ? provider.equals(eMail.provider) : eMail.provider == null;

    }

}
