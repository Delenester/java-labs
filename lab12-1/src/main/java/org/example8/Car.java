package org.example8;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int rating;
    private List<Integer> expertReviews;

    public Car(int id, String brand, String model, int rating, List<Integer> expertReviews) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rating = rating;
        this.expertReviews = new ArrayList<>(expertReviews);
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Integer> getExpertReviews() {
        return expertReviews;
    }

    public double getAverageReview() {
        if (expertReviews == null || expertReviews.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int review : expertReviews) {
            sum += review;
        }
        return (double) sum / expertReviews.size();
    }

    @Override
    public String toString() {
        return "Автомобиль: id = " + id
                + ", бренд = " + brand
                + ", модель = " + model
                + ", рейтинг = " + rating
                + ", средний отзыв = " + getAverageReview()
                + ", отзывы = " + expertReviews;
    }
}