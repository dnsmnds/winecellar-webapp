/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package com.cellar.wine.repositories;

import com.cellar.wine.models.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BottleRepository extends JpaRepository<Bottle, Long> {

    @Query("SELECT b FROM Bottle b WHERE b.user.id = :userid AND b.id = :id")
    Bottle findByUser(@Param("userid") Integer userId, @Param("id") Long id);

    @Query("SELECT b FROM Bottle b WHERE b.user.id = :userid AND b.wine.id = :wineid")
    Bottle findByWine(@Param("userid") Integer userId, @Param("wineid") Long wineId);
}
