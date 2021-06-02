package com.bvhieu.base.Service;

import com.bvhieu.base.Entity.User;
import com.bvhieu.base.Repo.UserRepo;
import lombok.SneakyThrows;
import org.jooq.lambda.Unchecked;

import java.io.Writer;

public class UserService {

    private UserRepo userRepo;

    @SneakyThrows
    protected void writeContent(Writer writer) {
        writer.write("username");
        userRepo.findAll().stream()
                .map(User::getUsername)
                .forEach(Unchecked.consumer(writer::write));
    }
}
