package com.galvanize.organizingCode;

import java.net.URI;

public class Crawler implements Browseable{
    private URI currentPage;

    @Override
    public void visit(URI uri) {
        this.currentPage = uri;
    }

    @Override
    public URI getCurrentPage() {
        return this.currentPage;
    }
}
