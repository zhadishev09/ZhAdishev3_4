package com.temirlan.continentsandcountries.continentsandcountries;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.continentsandcountries.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private ArrayList<Country> countryList;
    private OnItemClick onItemClick;

    public CountryAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater
                .from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder{

    private ItemCountryBinding binding;

    public CountryViewHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Country country){
        binding.tvCountryName.setText(country.getName());
        binding.tvCapitalName.setText(country.getCapital());
        Glide.with(binding.ivFlag).load(country.getFlag()).into(binding.ivFlag);
    }
}