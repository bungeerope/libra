package org.bungee.libra.mapstruct.mapper;

import org.bungee.libra.mapstruct.domain.bo.PersonBO;
import org.bungee.libra.mapstruct.domain.dto.PersonDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author gongtai
 */
@Mapper(config = MapperConvertConfig.class)
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "uid"),
            @Mapping(source = "username", target = "userName")
    })
    PersonBO personDOToBO(PersonDO personDO);
}
