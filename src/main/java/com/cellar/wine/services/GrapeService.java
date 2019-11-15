/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package com.cellar.wine.services;

import com.cellar.wine.models.Grape;

import java.util.List;

public interface GrapeService extends CrudService<Grape, Long> {

    Grape findByName(String name);

    List<Grape> getWhiteGrapes();

    List<Grape> getRedGrapes();

    List<Grape> findAll();

    Grape findByLowerCaseName(String lcName);
}
