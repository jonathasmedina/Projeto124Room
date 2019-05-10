package com.example.projeto124room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdicionarUsuarioFragment extends Fragment {

    EditText edNomeInserir, edIdInserir, edEmailInserir;
    Button btInserir;


    public AdicionarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adicionar_usuario, container, false);

        edEmailInserir = view.findViewById(R.id.editTextInserirUsuarioEmail);
        edNomeInserir = view.findViewById(R.id.editTextInserirUsuarioNome);
        edIdInserir = view.findViewById(R.id.editTextInserirUsuarioId);
        btInserir = view.findViewById(R.id.buttonInserirUsuario_);


        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edIdInserir.getText().toString());
                String nome = edNomeInserir.getText().toString();
                String email = edEmailInserir.getText().toString();

                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setId(id);

                MainActivity.myAppDatabase.myDAO().inserirUsuario(usuario);

            }
        });



        return view;
    }

}
