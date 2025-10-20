import java.util.Arrays;

public class Katalog {
    private Note[] noten;
    private int index = 0;

    public Katalog(Note[] noten) {
        this.noten = noten;
    }

    public Note[] add(Note note){
        noten[index++] = note;
        return noten;
    }

    @Override
    public String toString() {
        return "Katalog{" + Arrays.toString(noten)+ "}";
    }


//    Aufgabe 1
    public Note[] NichtAusreichenderNote(Note[] note){
        int count = 0;
        for (int i = 0; i < note.length; i++){
            if (note[i].getNote() < 40)
                count++;
        }

        Note[] result = new Note[count];
        int index = 0;
        for (int i = 0; i < note.length; i++){
            if(note[i].getNote() < 40)
                result[index++] = note[i];
        }
        return result;
    }

    public void showArray(Note[] noten){
        for (int i = 0; i < noten.length; i++){
            System.out.print(noten[i].getNote() + " ");
        }
        System.out.println("/n");
    }

//    Aufgabe 2
    public double Durchschnittswerte(Note[] note){
        double sum = 0;
        for(int i = 0; i < note.length; i++)
            sum+=note[i].getNote();
        return sum / note.length;
    }
}
