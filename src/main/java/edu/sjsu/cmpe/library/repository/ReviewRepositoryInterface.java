package edu.sjsu.cmpe.library.repository;

import java.util.ArrayList;

import edu.sjsu.cmpe.library.domain.Review;

/**
 * Review repository interface.
 * 
 
 */
public interface ReviewRepositoryInterface {
    /**
     * Save a new review in the repository
     * 
     * @param newReview
     *            a review instance to be create in the repository
     * @return a newly created review instance with auto-generated ID
     */
    Review saveReview(Review newReview);

    /**
     * Retrieve an existing review by ID
     * 
     * @param 
     *            a valid ID
     * @return a review instance
     */
    Review getReviewById(Integer id);
    
    ArrayList<Review> getAllReviews();
    
}
