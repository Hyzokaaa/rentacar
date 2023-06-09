package cu.edu.cujae.structdb.utils;

public class FunctionBuilder {

    private static String function;

    public static String newFunction(boolean hasReturn, FunctionType type, String table, int parameters, String criteria) {
        function = hasReturn ? "{?= call " : "{call ";
        setType(type);
        function += table;
        setCriteria(criteria);
        setParameters(parameters);
        return function;
    }

    private static void setType(FunctionType type) {
        switch (type) {
            case insert -> function += "insert_";
            case delete -> function += "delete_";
            case update -> function += "update_";
            case get -> function += "get_";
            case business -> function += "business_";
        }
    }

    private static void setCriteria(String criteria) {
        if (criteria != null) {
            function += "_";
            if (!criteria.equals("all")) {
                function += "by_";
            }
            function += criteria;
        }
    }

    private static void setParameters(int parameters) {
        function += "(";
        for (int i = 0; i < parameters; i++) {
            function += "?";
            if (i != parameters - 1) {
                function += ", ";
            }
        }
        function += ")}";
    }
}
