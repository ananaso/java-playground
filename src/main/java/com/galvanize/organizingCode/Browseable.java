package com.galvanize.organizingCode;

import java.net.URI;

public interface Browseable {
    void visit(URI uri);

    URI getCurrentPage();
}