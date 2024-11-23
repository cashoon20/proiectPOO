public abstract class DispozitivIluminat 
{
    // Starea dispozitivului
    private boolean estePornit;

    // Constructor
    public DispozitivIluminat()
    {
        // Initial dispozitivul este oprit
        this.estePornit = false;
    }

    // Metode abstracte ce vor fi implementate in clasele derivate
    public abstract void porneste();
    public abstract void opreste();

    // Getter pentru starea dispozitivului
    public boolean isPornit()
    {
        return estePornit;
    }

    // Setter pentru starea dispozitivului
    protected void setPornit(boolean pornit)
    {
        this.estePornit = pornit;
    }
}