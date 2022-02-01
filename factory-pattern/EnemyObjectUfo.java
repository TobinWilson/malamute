public class EnemyObjectUfo implements EnemyObject {
    private String name;
    private Integer damage;
    
    public EnemyObjectUfo() {
        setName("UFO");
        setDamage(10);
    }
    
    public void followPlayer() {
        System.out.println(getName() + " is following you");
    } 
    
    public void scan() {
        System.out.println(getName() + " is nearby");
    }
    
    public void attack() {
        System.out.println(getName() + " attacked you for " + getDamage() + " damage");
    }
    
    public Integer getDamage() {
        return this.damage;
    }
    public String getName() {
        return this.name;
    }
    public void setDamage(Integer damage) {
        this.damage = damage;
    }
    public void setName(String name) {
        this.name = name;
    }
}
