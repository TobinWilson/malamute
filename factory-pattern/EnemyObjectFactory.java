public class EnemyObjectFactory {
    public EnemyObject makeEnemyObject(EnemyObjectType objectType) {
        switch(objectType) {
            case ASTEROID:
                return new EnemyObjectAsteroid();
            case ROCKET:
                return new EnemyObjectRocket();
            case UFO:
                return new EnemyObjectUfo();
            default:
                return new EnemyObjectAsteroid();
        }
    }
}
