package com.example.wisatadumai;

import android.os.Parcel;
import android.os.Parcelable;

public class Wisata implements Parcelable {

    private String nama_wisata;
    private String detail_wisata;
    private int photo;
    private String harga;

    public Wisata() {

    }

    public String getNama_wisata() {
        return nama_wisata;
    }

    public void setNama_wisata(String nama_wisata) {
        this.nama_wisata = nama_wisata;
    }

    public String getDetail_wisata() {
        return detail_wisata;
    }

    public void setDetail_wisata(String detail_wisata) {
        this.detail_wisata = detail_wisata;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_wisata);
        parcel.writeString(detail_wisata);
        parcel.writeInt(photo);
        parcel.writeString(harga);
    }

    protected Wisata(Parcel in) {
        nama_wisata = in.readString();
        detail_wisata = in.readString();
        photo = in.readInt();
        harga = in.readString();
    }

    public static final Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public Wisata createFromParcel(Parcel in) {
            return new Wisata(in);
        }

        @Override
        public Wisata[] newArray(int size) {
            return new Wisata[size];
        }
    };

}
