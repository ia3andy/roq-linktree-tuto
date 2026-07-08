package io.acme;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;
import java.util.List;

@DataMapping("profile")
public record Profile(String name, String handle, String title, String bio,
                       String image, List<Social> social, List<Link> links) {

    public record Social(String name, String url, String icon) {}

    public record Link(String name, String url, String description, String icon) {}
}
