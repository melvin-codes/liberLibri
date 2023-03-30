package code.liberLibri.model;

public enum Genre {
    Adventure, Biography, Children,
    Dystopian, Fantasy,
    Fiction, Literature,
    Mystery, Psychology,
    Romance, SciFi;

    public static Genre convertStringToGenre(String value) {
        Genre myGenre = null;
        for(Genre genre: Genre.values()) {
            if(genre.toString().equalsIgnoreCase(value)) {
                myGenre = genre;
            }
        }
        return myGenre;
    }
}
