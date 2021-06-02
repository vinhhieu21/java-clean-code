package com.bvhieu.base.Service;

import com.bvhieu.base.Repo.OrderRepo;
import com.bvhieu.base.Repo.UserRepo;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jooq.lambda.Unchecked;

import java.io.Writer;

@Slf4j
public class OrderService {
    private OrderRepo orderRepo;
    private UserRepo userRepo;

    @SneakyThrows
    protected void writeContent(Writer writer) {
        writer.write("ID;Date\n");
        orderRepo.findByActiveTrue()
                .map(o -> o.getId() + ";" + o.getCreatedDate())
                .forEach(Unchecked.consumer(writer::write));
    }
}
