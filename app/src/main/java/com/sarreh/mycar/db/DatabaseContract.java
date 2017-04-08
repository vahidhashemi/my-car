package com.sarreh.mycar.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.model.CarBrand;
import com.sarreh.mvp.model.CarModel;
import com.sarreh.mvp.model.ResponseWrapper;
import com.sarreh.repo.DBRepository;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class DatabaseContract implements DBRepository {

    Context context;
    SQLiteDatabase sqLiteDatabase;

    public DatabaseContract(Context context, DatabaseHelper databaseHelper) {
        this.context = context;
        sqLiteDatabase = databaseHelper.getReadableDatabase();
    }

    private List<Car> getCarsFromDB() {
        List<Car> cars = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM car", null);
        if (cursor.moveToFirst()) {
            do {
                String carString = "";
                Car car = new Car();
                CarBrand carBrand = new CarBrand("brand", new CarModel("model"));
                car.setBrand(carBrand);
                cars.add(car);

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
