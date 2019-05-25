package br.com.digitalhouse.comunicacaoentrefragmentos.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digitalhouse.comunicacaoentrefragmentos.R;
import br.com.digitalhouse.comunicacaoentrefragmentos.model.Pessoa;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        TextView textViewNome = view.findViewById(R.id.textViewName);
        TextView textViewProfessional = view.findViewById(R.id.textViewProfession);
        TextView textViewAge = view.findViewById(R.id.textViewAge);

        if (getArguments() != null) {
            Pessoa pessoa = getArguments().getParcelable("PESSOA");

            if (pessoa != null) {
                textViewNome.setText(pessoa.getName());
                textViewProfessional.setText(pessoa.getProfessional());
                textViewAge.setText(pessoa.getAge() + " Anos");
            }
        }

        return view;
    }

}
