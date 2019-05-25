package br.com.digitalhouse.comunicacaoentrefragmentos.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pessoa implements Parcelable {


    private String name;
    private String professional;
    private int age;


    public Pessoa() {
    }

    public Pessoa(String name, String professional, int age) {
        this.name = name;
        this.professional = professional;
        this.age = age;
    }

    protected Pessoa(Parcel in) {
        name = in.readString();
        professional = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(professional);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Pessoa> CREATOR = new Creator<Pessoa>() {
        @Override
        public Pessoa createFromParcel(Parcel in) {
            return new Pessoa(in);
        }

        @Override
        public Pessoa[] newArray(int size) {
            return new Pessoa[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
