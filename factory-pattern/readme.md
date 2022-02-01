This program uses the FACTORY PATTERN.

We start by selecting an object from a list of enumerable types. Depending on the type, an object will be instantiated from a factory method.

```
public enum EnemyObjectType {
    ASTEROID,
    ROCKET, 
    UFO
}

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
```

The benefits? We can instantiate objects on the fly. Our core purpose--object instantiation--becomes the responsibility of a single class, the factory.

```
Category: Creation patterns
```
