package shop;

import java.util.List;

public class ShoppingListServiceImpl implements ShoppingListService{

    @Override
    public List<Item> findAllItems() {
        //Get all items from database: Any Logic - not utest
        return null;
    }

    @Override
    public void saveItems(List<Item> items) {
        // check items:
            // check if item name is not null or empty
            // quantity > 0
            // quantity < 100
        for (Item item : items) {
            item.check();

        }

        // Save all items in database

    }
}
