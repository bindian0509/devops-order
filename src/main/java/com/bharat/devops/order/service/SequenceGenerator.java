package com.bharat.devops.order.service;

import com.bharat.devops.order.entity.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Service
public class SequenceGenerator {

    @Autowired
    private MongoOperations mongoOperations;

    public int generateNextOrderId(){
        Sequence counter = mongoOperations.findAndModify(
                query(where("_id").is("sequence")),
                new Update().inc("sequence", 1),
                options().returnNew(true).upsert(true),
                Sequence.class);
        return counter.getSequence();

    }
}