package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId(null);
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
