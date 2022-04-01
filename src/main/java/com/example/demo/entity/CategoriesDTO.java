package com.example.demo.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@Document(collection = "categorischemas")
@Data
public class CategoriesDTO {
    @Id
    private String id;

    private Number ids;

    private String name;

    private String slug;

    private String parent;

    private Number level;

    private String category;

    private Number parentId;

    public CategoriesDTO(String id, Number ids, String name, String slug, String parent, Number level, String category, Number parentId) {
        this.id = id;
        this.ids = ids;
        this.name = name;
        this.slug = slug;
        this.parent = parent;
        this.level = level;
        this.category = category;
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getIds() {
        return ids;
    }

    public void setIds(Number ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Number getLevel() {
        return level;
    }

    public void setLevel(Number level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Number getParentId() {
        return parentId;
    }

    public void setParentId(Number parentId) {
        this.parentId = parentId;
    }
}
