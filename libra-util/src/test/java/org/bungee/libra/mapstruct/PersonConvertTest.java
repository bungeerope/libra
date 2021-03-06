package org.bungee.libra.mapstruct;


import org.bungee.libra.mapstruct.domain.bo.PersonBO;
import org.bungee.libra.mapstruct.domain.dto.PersonDO;
import org.bungee.libra.mapstruct.mapper.PersonMapper;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonConvertTest {

    private Logger LOGGER = LoggerFactory.getLogger(PersonConvertTest.class);
    private PersonDO personDO;

    @Before
    public void constructionPersonEntity() {
        personDO = new PersonDO();
        personDO.setId(1L);
        personDO.setUsername("GongTai");
        personDO.setFirstName("Gong");
        personDO.setLastName("Tai");
    }

    @Test
    public void personDOToBO() {
        PersonBO personBO = PersonMapper.INSTANCE.personDOToBO(personDO);
        LOGGER.info("convert DO to BO:{}", personBO);
    }
}
