package dto;

public record RekeningDTO(long rekeningnr, double saldo, String houder, double maxKredietOnderNul, double aangroeiIntrest, char soort) {
}
