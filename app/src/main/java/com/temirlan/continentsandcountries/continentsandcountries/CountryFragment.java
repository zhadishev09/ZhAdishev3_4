package com.temirlan.continentsandcountries.continentsandcountries;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.continentsandcountries.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private ArrayList<Country> countryList;
    private CountryAdapter adapter;
    private Integer position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        adapter = new CountryAdapter(countryList);
        binding.recyclerViewCountry.setAdapter(adapter);
    }

    private void checkPosition(Integer position) {
        if (position == 0){
            loadNorthAmerica();
        }else if (position == 1){
            loadSouthAmerica();
        }else if (position == 2){
            loadEurasia();
        }else if (position == 3){
            loadAfrica();
        }else if (position ==4){
            loadAustralia();
        }
    }


    private void loadAfrica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Tunisia","Tunis","https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/2560px-Flag_of_Tunisia.svg.png"));
        countryList.add(new Country("Nigeria","Abuja","https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png"));
        countryList.add(new Country("Morocco","Rabat","https://upload.wikimedia.org/wikipedia/commons/f/f6/Flag_of_MoroccoFlag_of_Morocco.png"));
        countryList.add(new Country("Senegal","Dakar","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_Senegal.svg/1280px-Flag_of_Senegal.svg.png"));
        countryList.add(new Country("Algeria","Algiers","https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/2560px-Flag_of_Algeria.svg.png"));
    }

    private void loadAustralia() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Australia","Canberra","https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Flag_of_Australia.svg/1280px-Flag_of_Australia.svg.png"));
        countryList.add(new Country("Papua New Guinea","Port-Moresby","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Papua_New_Guinea.svg/640px-Flag_of_Papua_New_Guinea.svg.png"));
        countryList.add(new Country("New Zealand","Wellington","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/2560px-Flag_of_New_Zealand.svg.png"));
        countryList.add(new Country("Fiji","Suva","https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Fiji.svg/2560px-Flag_of_Fiji.svg.png"));
        countryList.add(new Country("Solomon Islands","Honiara","https://upload.wikimedia.org/wikipedia/commons/7/7d/Solomon_islands_flag.png"));
    }

    private void loadEurasia() {
        countryList = new ArrayList<>();
        countryList.add(new Country("France","Paris","https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png"));
        countryList.add(new Country("Spain","Madrid","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/2560px-Flag_of_Spain.svg.png"));
        countryList.add(new Country("Azerbaijan","Baku","https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Azerbaijan_Democtratic_Republic.PNG/800px-Flag_of_Azerbaijan_Democtratic_Republic.PNG"));
        countryList.add(new Country("Ukraine","Kiev","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Flag_of_Ukraine.png/640px-Flag_of_Ukraine.png"));
        countryList.add(new Country("Kyrgyzstan","Bishkek","https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Kyrgyzstan.png/1200px-Flag_of_Kyrgyzstan.png"));
    }

    private void loadSouthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Brazil","Brasilia","https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png"));
        countryList.add(new Country("Argentina","Buenos-Aires","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2560px-Flag_of_Argentina.svg.png"));
        countryList.add(new Country("Peru","Lima","https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png"));
        countryList.add(new Country("Colombia","Bogota","https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png"));
        countryList.add(new Country("Chile","Santiago","https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png"));
    }

    private void loadNorthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("United States of America","Washington","https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/2560px-Flag_of_the_United_States.svg.png"));
        countryList.add(new Country("Mexico","Mexico","https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png"));
        countryList.add(new Country("Canada","Ottawa","https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"));
        countryList.add(new Country("Cuba","Havana","https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png"));
        countryList.add(new Country("Greenland","Nuuk","https://upload.wikimedia.org/wikipedia/commons/7/72/Flag_of_Greenland.png"));
    }


}