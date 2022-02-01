public class Program {
    public static void main(String args[]) {
        EnemyObjectFactory enemyObjectFactory = new EnemyObjectFactory();
        EnemyObject enemy = enemyObjectFactory.makeEnemyObject(EnemyObjectType.ASTEROID);
        enemy.scan();
    }
}
