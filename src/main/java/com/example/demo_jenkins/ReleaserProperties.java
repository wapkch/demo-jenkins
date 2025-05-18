package com.example.demo_jenkins;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "releaser")
record ReleaserProperties(String foo, String bar) {
}
