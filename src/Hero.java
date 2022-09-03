public abstract class Hero {
    private int HeroHeath;
    private int HeroDamage;
    private String Magic;

    public int getHeroHeath() {
        return HeroHeath;
    }

    public void setHeroHeath(int heroHeath) {
        HeroHeath = heroHeath;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public String getMagic() {
        return Magic;
    }

    public void setMagic(String magic) {
        Magic = magic;
    }
    public abstract void heal();
}
