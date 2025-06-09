public class Address
{
    private String street, city, state;
    private int zipCode;

    public Address()
    {
        street = "";
        city = "";
        state = "";
        zipCode = 0;
    }

    public Address(String street, String city, String state, int zipCode)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
   public void setStreet(String street)
   {
      this.street = street;
   }
   public void setCity(String city)
   {
      this.city = city;
   }
   public void setState(String state)
   {
      this.state = state;
   }
   
   public void setZipCode(int zipCode)
   {
      this.zipCode = zipCode;
   }
 
   public String getStreet()
   {
      return street;
   }
   public String getCity()
   {
      return city;
   }
   public String getState()
   {
      return state;
   }
   
   public int getZipCode()
   {
      return zipCode;
   }
}