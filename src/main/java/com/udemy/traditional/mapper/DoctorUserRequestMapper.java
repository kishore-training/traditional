package com.udemy.traditional.mapper;

import com.udemy.traditional.model.DoctorUser;
import com.udemy.traditional.vo.DoctorUserRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DoctorUserRequestMapper {

    DoctorUserRequestMapper INSTANCE = Mappers.getMapper(DoctorUserRequestMapper.class);


    DoctorUser organizationStaffVOToModel(DoctorUserRequestVO vo);

    DoctorUserRequestVO organizationStaffModelToVO(DoctorUser doctorUser);
}
