package com.vivek.harini.myapptracker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.vivek.harini.myapptracker.databinding.SingleAppItemBinding;

import java.time.Instant;
import java.util.ArrayList;

public class AppData extends RecyclerView.Adapter<AppData.AppDataHolder>{
    public class AppDataHolder  extends RecyclerView.ViewHolder {
        SingleAppItemBinding AppItem;
        public AppDataHolder(SingleAppItemBinding v) {
            super(v.getRoot());
            AppItem = v;
        }
    }
    public ArrayList<ApplicationData>  ApplicationsList;
    public AppData() {
        //get data from google account
        ApplicationsList = new ArrayList<>();
        for(int i=0 ; i < 100 ; i++){
            ApplicationData appData = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                appData = new ApplicationData("Application name" + i, Instant.now(), (double) i, (double) i, (double) i, (double) i, true);
            }
            ApplicationsList.add(appData);
        }
    }

    @NonNull
    @Override
    public AppData.AppDataHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        SingleAppItemBinding appItem = SingleAppItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AppData.AppDataHolder appData = new AppData.AppDataHolder(appItem);
        return appData;
    }

    @Override
    public void onBindViewHolder(@NonNull AppData.AppDataHolder applicationData, int currItem) {
        if(currItem>=ApplicationsList.size()) {
            applicationData.AppItem.setApp(ApplicationsList.get(ApplicationsList.size()-1));
        }
        else {
            applicationData.AppItem.setApp(ApplicationsList.get(currItem));
        }
    }

    @Override
    public int getItemCount() {
        return ApplicationsList.size();
    }
}
