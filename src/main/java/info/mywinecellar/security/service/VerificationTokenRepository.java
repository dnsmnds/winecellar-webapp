/*
 * My-Wine-Cellar, copyright 2019
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 */

package info.mywinecellar.security.service;

import info.mywinecellar.security.model.User;
import info.mywinecellar.security.model.VerificationToken;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    /**
     * @param token token
     * @return VerificationToken
     */
    VerificationToken findByToken(String token);

    /**
     * @param user user
     * @return VerificationToken
     */
    VerificationToken findByUser(User user);

}
