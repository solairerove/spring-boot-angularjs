package com.github.solairerove.service;

import com.github.solairerove.domain.Model;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static com.github.solairerove.utils.EntityUtils.generateModelCollection;

@Service
public class ModelService {

    public Collection<Model> getAll() {
        return generateModelCollection();
    }
}
