package com.airhacks;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.ServletBuildItem;

class AirhacksProcessor {

    static final String FEATURE_NAME = "airhacks-extension";

    @BuildStep
    ServletBuildItem createAirhacksServlet() {
        System.out.println("AirhacksProcessor.createAirhacksServlet");
        ServletBuildItem servletBuildItem = ServletBuildItem.builder(FEATURE_NAME, AirhacksServlet.class.getName())
                .addMapping(FEATURE_NAME)
                .build();
        return servletBuildItem;
    }

    @BuildStep
    FeatureBuildItem createFeatureItem() {
        System.out.println("AirhacksProcessor.createFeatureItem");
        return new FeatureBuildItem(FEATURE_NAME);
    }

}
