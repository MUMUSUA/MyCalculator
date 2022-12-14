package com.bignerdranch.android.crimerecord;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ASUS on 2022/5/18.
 */

class CrimeLab {
    private List<Crime> mCrimes;
    private static  CrimeLab sCrimeLab;
    public static CrimeLab getInstance(Context context) {
        if(sCrimeLab==null){
            sCrimeLab=new CrimeLab(context);
        }

        return sCrimeLab;
    }

    public static CrimeLab getInstance() {

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes=new ArrayList<>();
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public  Crime getCrime(UUID id){
        for(Crime crime:mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return new Crime();
    }









}
