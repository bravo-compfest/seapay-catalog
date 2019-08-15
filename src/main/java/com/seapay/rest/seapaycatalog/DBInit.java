package com.seapay.rest.seapaycatalog;

import com.seapay.rest.seapaycatalog.domain.Item;
import com.seapay.rest.seapaycatalog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class DBInit implements CommandLineRunner {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {
        Item glossy_white_mug = new Item("Glossy White Mug", new BigDecimal("25000.0"), 2);
        itemRepository.save(glossy_white_mug);
    }
}
