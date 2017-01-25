package components;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the class that creates the global parameters for every other object. It uses the singleton pattern
 * to ensure there is only one copy of 'global parameters', which is a hashmap.
 */
public class Parameters  {

    //TODO: Maybe use the Singleton pattern to make sure there is only one instance of global parameters?
    //Todo: protect access to global parameters (everyone can read, not everyone can write)

    public Parameters() {
        globalParameters = new HashMap<>(1000);
        globalParameters.put("price_GBP",1.0);
        globalParameters.put("price_Stock", 1.0);
        globalParameters.put("price_SampleLiability", 1.0);
        globalParameters.put("bank_leverage_target", 0.05);
        globalParameters.put("bank_minimum_leverage", 0.02);
    }

    public void put(String name, double value) {
        //Todo: is this a bit naive? (i.e. just using strings)
        globalParameters.put(name,value);
    }

    public Map<Object, Object> getMap() {
        return globalParameters;
    }

    private static HashMap<Object, Object> globalParameters = null;
}
