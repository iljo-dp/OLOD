package domein;

public class Lied {


    private double duurInMinuten;
    private int beatPerMinute;
    public int getBeatsPerMinute() {
        return beatPerMinute;
    }

    public void setBeatPerMinute(int beatPerMinute) {
        this.beatPerMinute = (beatPerMinute >= 10 && beatPerMinute <= 200) ? beatPerMinute : 4;
    }


    public double getDuurInMinuten() {
        return duurInMinuten;
    }

    public static void setDuurInMinuten(double duurInMinuten) {
        this.duurInMinuten = (duurInMinuten >= 0.5 && duurInMinuten <= 10) ? duurInMinuten : 4.0;
    }

    public Lied(double duurInMinuten){
        setBeatPerMinute(100);
    }

    public Lied(double duurInMinuten, int beatPerMinute){
        setDuurInMinuten(duurInMinuten);
        setBeatPerMinute(beatPerMinute);
        if (beatPerMinute < 10 || beatPerMinute > 200) {
            setBeatPerMinute(100);
        }
    }

    public int geefDuurInSeconden(){
        return (int) (getDuurInMinuten() * 60);
    }

    public String geefTempo(){
        int beatspm = getBeatsPerMinute();
        if (beatspm >= 10 && beatspm <= 70) {
            return "traag";
        } else if (beatspm >= 71 && beatspm <= 90) {
            return "relax";
        } else if (beatspm >= 91 && beatspm <= 120){
            return "fris";
        }
        else if (beatspm >= 121 && beatspm <= 180){
            return "levendig";
        }
        else{
            return "snel";
        }
    }

}