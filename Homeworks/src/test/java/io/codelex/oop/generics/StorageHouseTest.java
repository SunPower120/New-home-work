package io.codelex.oop.generics;

import io.codelex.oop.summary.generics.StorageHouse;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageHouseTest {

    @Test
    public void shouldStoreAndRetrieveMultipleItems() {
        String firstItem = "Hello";
        Integer secondItem = 123;
        StorageHouse storageHouse = new StorageHouse(firstItem);
        storageHouse.addMoreItems(secondItem);

        Optional<Object> maybeFirstItem = storageHouse.getMaybeFirstItem();

        assertTrue(maybeFirstItem.isPresent());
        assertEquals(firstItem, maybeFirstItem.get());
    }


}

