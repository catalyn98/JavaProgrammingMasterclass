package InterfacesChallenge_37;

public interface Mappable {

    // %s is a specifier for a formatted string
    String JSON_PROPERTY =
            """ 
                "properties": {%s} 
            """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
                    "shape": "%s", "label": "%s", "marker": "%s"
               """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }
}
