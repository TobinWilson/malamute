public interface EnemyObject {
    void scan();
    void attack();
    void followPlayer();
    
    String getName();
    Integer getDamage();
    void setDamage(Integer damage);
    void setName(String name);
}
