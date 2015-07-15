package com.captechventures.strategy.sample.strategies.content;

import com.captechventures.strategy.Strategy;

@Strategy("PREMIUM")
public class PremiumContentStrategy implements ContentStrategy {

    @Override
    public String getContent() {
        return "Premium Lorem Ipsum";
    }

}
