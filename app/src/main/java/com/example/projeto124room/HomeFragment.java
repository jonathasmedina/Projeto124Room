package com.example.projeto124room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button btCad, btListar, btExcluir, btAlterar;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btCad = view.findViewById(R.id.buttonCadUs);
        btAlterar = view.findViewById(R.id.buttonAltUs);
        btListar = view.findViewById(R.id.buttonListUs);
        btExcluir = view.findViewById(R.id.buttonExcUsu);


        btCad.setOnClickListener(this);
        btAlterar.setOnClickListener(this);
        btExcluir.setOnClickListener(this);
        btListar.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCadUs:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frame_layout, new AdicionarUsuarioFragment()).
                        commit();

                break;
            case R.id.buttonExcUsu:

                break;
        }
    }
}
