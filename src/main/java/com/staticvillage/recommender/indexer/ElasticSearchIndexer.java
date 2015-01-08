/*
Copyright 2015 Joel Parrish

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.
 */
package com.staticvillage.recommender.indexer;

import com.staticvillage.recommender.bean.Place;
import com.staticvillage.recommender.exception.IndexerException;

import java.util.List;

/**
 * Created by joelparrish on 12/29/14.
 */
public class ElasticSearchIndexer implements Indexer<Place> {
    @Override
    public void addBean(Place bean) {

    }

    @Override
    public void addBeans(List<Place> beans) {

    }

    @Override
    public boolean updateBean(Place bean) throws IndexerException {
        return false;
    }

    @Override
    public List<Place> getBeans() {
        return null;
    }

    @Override
    public List<Place> getBeans(Object obj) {
        return null;
    }
}
