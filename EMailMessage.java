package bg.tyvarna.java;

public abstract class EMailMessage {

    protected String strEMailMessage;

    public EMailMessage() {
        this.strEMailMessage = "Unknown";
    }

    public EMailMessage(String strEMailMessage) {
        this.strEMailMessage = strEMailMessage;
    }

    public abstract void setEMailMessage(String mess);

    public abstract String getEMailMessage();

}
