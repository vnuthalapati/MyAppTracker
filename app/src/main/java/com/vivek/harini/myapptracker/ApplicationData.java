package com.vivek.harini.myapptracker;

import java.time.Instant;

public class ApplicationData{
    public String ApplicationName;
    public Instant LastUsedInstant;
    public Double LastUsageTime;
    public Double TotalUsageToDate;
    public Double TotalUsageToday;
    public Double UsageLimit;
    public Boolean OverusePermitted;


    public ApplicationData(String applicationName, Instant lastUsedInstant, Double lastUsageTime, Double totalUsageToDate,
                                Double totalUsageToday, Double usageLimit, Boolean overusePermitted)
    {
        ApplicationName = applicationName;
        LastUsedInstant = lastUsedInstant;
        LastUsageTime = lastUsageTime;
        TotalUsageToDate = totalUsageToDate;
        TotalUsageToday = totalUsageToday;
        UsageLimit = usageLimit;
        OverusePermitted = overusePermitted;
    }
}
