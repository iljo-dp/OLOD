package main;
import cui.LottoApplicatie;
import domein.DomeinControleer;

public class StartUp {
    public static void main(String[] args) {
        new LottoApplicatie(new DomeinControleer()).startLotto();
    }
}

