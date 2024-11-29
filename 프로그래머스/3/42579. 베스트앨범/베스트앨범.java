import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // Step 1: Group songs by genre and calculate total plays per genre
        Map<String, Integer> genrePlayCount = new HashMap<>();
        Map<String, List<Song>> genreToSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);
            genreToSongs.computeIfAbsent(genre, k -> new ArrayList<>()).add(new Song(i, play));
        }

        // Step 2: Sort genres by total plays in descending order
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((g1, g2) -> genrePlayCount.get(g2) - genrePlayCount.get(g1));

        // Step 3: Select up to two most played songs for each genre
        List<Integer> bestAlbum = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<Song> songs = genreToSongs.get(genre);
            songs.sort((s1, s2) -> s2.plays != s1.plays ? s2.plays - s1.plays : s1.id - s2.id);
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                bestAlbum.add(songs.get(i).id);
            }
        }

        // Convert the list to an array
        return bestAlbum.stream().mapToInt(i -> i).toArray();
    }
    
    public class Song {
        int id;
        int plays;

        Song(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }
    }
}