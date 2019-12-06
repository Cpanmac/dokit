package com.perye.dokit.mapper;

import com.perye.dokit.dto.MenuDTO;
import com.perye.dokit.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}
