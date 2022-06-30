package Oracle11g.Entity;

public class Ticket {
    private String ID;
    private String T_city;
    private java.sql.Date T_time;
    private String R_city;
    private java.sql.Date R_time;
    private String type;
    private double price;
    private String agency;
    private java.sql.Blob pic;

    private static java.util.List<String> contentList;

    static
    {
        contentList = new java.util.ArrayList<>();
        contentList.add("id");
        contentList.add("t_city");
        contentList.add("t_time");
        contentList.add("r_city");
        contentList.add("r_time");
        contentList.add("type");
        contentList.add("price");
        contentList.add("agency");
        contentList.add("pic");
    }

    public static java.util.List<String> getContentList()
    {
        return Ticket.contentList;
    }

    public Ticket(String ID, String T_city, java.sql.Date T_time, String type)
    {
        this(ID, T_city, T_time, null, null, type, 0, null, null);
    }

    public Ticket(java.util.List<Object> list, int i)
    {
        this((String)list.get(i++), (String)list.get(i++), (java.sql.Date)list.get(i++), (String)list.get(i++), (java.sql.Date)list.get(i++), (String)list.get(i++), (double)list.get(i++), (String)list.get(i++), (java.sql.Blob)list.get(i++));
    }

    public Ticket(String ID, String T_city, java.sql.Date T_time, String R_city, java.sql.Date R_time, String type, double price, String agency, java.sql.Blob pic)
    {
        this.setID(ID);
        this.setT_city(T_city);
        this.setT_time(T_time);
        this.setR_city(R_city);
        this.setR_time(R_time);
        this.setType(type);
        this.setPrice(price);
        this.setAgency(agency);
        this.setPic(pic);
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public void setT_city(String T_city)
    {
        this.T_city = T_city;
    }

    public void setT_time(java.sql.Date T_time)
    {
        this.T_time = T_time;
    }

    public void setR_city(String R_city)
    {
        this.R_city = R_city;
    }

    public void setR_time(java.sql.Date R_time)
    {
        this.R_time = R_time;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setAgency(String agency)
    {
        this.agency = agency;
    }

    public void setPic(java.sql.Blob pic)
    {
        this.pic = pic;
    }

    public String getID()
    {
        return this.ID;
    }
    
    public String getT_city()
    {
        return this.T_city;
    }
    
    public java.sql.Date getT_time()
    {
        return this.T_time;
    }
    
    public String getR_city()
    {
        return this.R_city;
    }
    
    public java.sql.Date getR_time()
    {
        return this.R_time;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public String getAgency()
    {
        return this.agency;
    }

    public java.sql.Blob getPic()
    {
        return this.pic;
    }
}
