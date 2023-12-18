package dtos;

public record VerplaatsingDTO(String van, String naar, double kostprijs, int lijnNr, boolean bus, boolean stadslijn, char soort) {

}
