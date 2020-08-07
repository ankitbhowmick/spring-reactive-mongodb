package com.spring.anky.springreactivemongodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "permalink",
        "crunchbase_url",
        "homepage_url",
        "blog_url",
        "blog_feed_url",
        "twitter_username",
        "category_code",
        "number_of_employees",
        "founded_year",
        "founded_month",
        "founded_day",
        "deadpooled_year",
        "tag_list",
        "alias_list",
        "email_address",
        "phone_number",
        "description",
        "created_at",
        "updated_at",
        "overview",
        "image",
        "products",
        "relationships",
        "competitions",
        "providerships",
        "total_money_raised",
        "funding_rounds",
        "investments",
        "acquisition",
        "acquisitions",
        "offices",
        "milestones",
        "video_embeds",
        "screenshots",
        "external_links",
        "partners"
})
@Document(collection = "companies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    public String id;

    @JsonProperty("name")
    public String name;
    @JsonProperty("permalink")
    public String permalink;
    @JsonProperty("crunchbase_url")
    public String crunchbaseUrl;
    @JsonProperty("homepage_url")
    public String homepageUrl;
    @JsonProperty("blog_url")
    public String blogUrl;
    @JsonProperty("blog_feed_url")
    public String blogFeedUrl;
    @JsonProperty("twitter_username")
    public String twitterUsername;
    @JsonProperty("category_code")
    public String categoryCode;
    @JsonProperty("number_of_employees")
    public Integer numberOfEmployees;
    @JsonProperty("founded_year")
    public Integer foundedYear;
    @JsonProperty("founded_month")
    public Integer foundedMonth;
    @JsonProperty("founded_day")
    public Integer foundedDay;
    @JsonProperty("deadpooled_year")
    public Integer deadpooledYear;
    @JsonProperty("tag_list")
    public String tagList;
    @JsonProperty("alias_list")
    public String aliasList;
    @JsonProperty("email_address")
    public String emailAddress;
    @JsonProperty("phone_number")
    public String phoneNumber;
    @JsonProperty("description")
    public String description;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("overview")
    public String overview;

}