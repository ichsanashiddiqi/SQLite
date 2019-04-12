package id.ac.polinema.notesapp.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import id.ac.polinema.notesapp.models.Note;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note... note);

    @Update
    void Update(Note... note);

    @Delete
    void Delete(Note... note);

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getAll();
}
