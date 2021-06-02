package com.bvhieu.base.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.function.Consumer;

@Slf4j
class ExportService {
    // template design pattern.
    @SneakyThrows
    public File exportFile(String fileName, Consumer<Writer> contentWriter) {
        File file = new File("export/" + fileName);
        try (Writer writer = new FileWriter(file)) {
            contentWriter.accept(writer);
            return file;
        } catch (Exception e) {
            log.debug("Shit, an error!", e); // TERROR-Driven Development
            throw e;
        }
    }
}
