package by.gsu.pmslab;

public class businesstrip {
    final int rate=25000;
    private String account;
    private int transport;
    private int days;
    public businesstrip(String account,int transport,int days){
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public int getTotal(){
        return transport + rate * days;
    }
    public String toString(){
        return rate+";"+account+";"+transport+";"+days+";";
    }
    public void show(){
        System.out.println("rate = "+rate
                +"\naccount = "+account+"\ntransport = "+transport
                +"\ndays ="+days+"\ntotal = "+getTotal());
    }
}
