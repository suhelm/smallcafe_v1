package com.cafe.smallcafe;

import com.cafe.smallcafe.domain.CafeMenu;
import org.springframework.data.repository.CrudRepository;
public interface CafeRepository  extends CrudRepository<CafeMenu, String> {}

