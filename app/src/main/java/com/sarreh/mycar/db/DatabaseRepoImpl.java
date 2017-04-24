package com.sarreh.mycar.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.model.ResponseWrapper;
import com.sarreh.repo.DBRepository;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class DatabaseRepoImpl implements DBRepository {

    Context context;
    SQLiteDatabase sqLiteDatabase;

    public DatabaseRepoImpl(Context context, DatabaseHelper databaseHelper) {
        this.context = context;
        sqLiteDatabase = databaseHelper.getReadableDatabase();
    }

    private List<Car> getCarsFromDB() {
        List<Car> cars = new ArrayList<>();
        //TODO : add sql queries to another constant class
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT car.number_plate, \n" +
                "\tcar.acquire_year, \n" +
                "\tcar.production_year, \n" +
                "\tbrand.brand_name, \n" +
                "\tmodel.model_name\n" +
                "FROM car INNER JOIN brand ON car.brand_id = brand.id\n" +
                "\t INNER JOIN model ON brand.model_id = model.id", null);
        if (cursor.moveToFirst()) {
            do {
                String carString = "";


            } while (cursor.moveToNext());
        }
        return cars;
    }

    @Override
    public Observable<ResponseWrapper<List<Car>>> getCars() {
        ResponseWrapper<List<Car>> result = new ResponseWrapper<>();
        result.body = getCarsFromDB();
        return null;
    }
}
