package com.example.evaluation_final;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvDate,mTvPositive,mTvNegative,mTvHospitalised,mTvOnVentilation,mTvDeath,mTvDateChecked;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvDate = itemView.findViewById(R.id.tvDate);
        mTvPositive= itemView.findViewById(R.id.positive);
        mTvNegative = itemView.findViewById(R.id.negative);
        mTvHospitalised = itemView.findViewById(R.id.hospitalised);
        mTvOnVentilation = itemView.findViewById(R.id.onVentilation);
        mTvDeath = itemView.findViewById(R.id.death);
        mTvDateChecked = itemView.findViewById(R.id.date_chk);
    }

    public void setData(Model model){
        mTvDate.setText(model.getDate());
        mTvPositive.setText(model.getNegative());
        mTvNegative.setText(model.getNegative());
        mTvHospitalised.setText(model.getHospitalised());
        mTvOnVentilation.setText(model.getOnVentilation());
        mTvDeath.setText(model.getDeath());
        mTvDateChecked.setText(model.getDateChecked());
    }
}
