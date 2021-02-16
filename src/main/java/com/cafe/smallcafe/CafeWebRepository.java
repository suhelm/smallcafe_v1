package com.cafe.smallcafe;

import com.cafe.smallcafe.domain.CafeMenu;
import org.springframework.data.repository.CrudRepository;

public interface CafeWebRepository extends CrudRepository<CafeMenu, String> {}

