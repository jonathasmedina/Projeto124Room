package com.example.projeto124room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface MyDAO {

    @Insert
    public void inserirUsuario(Usuario usuario);
}
