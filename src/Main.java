//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Note note1 = new Note(8);
    Note note2 = new Note(10);
    Note note3 = new Note(75);
    Note note4 = new Note(21);
    Note note5 = new Note(79);
    Note note6 = new Note(26);
    Note note7 = new Note(34);
    Note note8 = new Note(55);
    Note note9 = new Note(88);
    Note note10 = new Note(100);

    Note[] noten = {note1, note2, note3, note4, note5, note6, note7, note8, note9, note10};
    Katalog katalog = new Katalog(noten);
//    System.out.println(katalog);

//  Aufgabe 1
    Note[] nichtAusreichenderNote = katalog.NichtAusreichenderNote(noten);
    katalog.showArray(nichtAusreichenderNote);

//    Aufgabe 2
    System.out.println(katalog.Durchschnittswerte(noten));

//    Aufgabe 3



}
