package com.udemy.traditional.mapper;

import com.udemy.traditional.model.Appointment;
import com.udemy.traditional.vo.AppointmentRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AppointmentRequestMapper {

    AppointmentRequestMapper INSTANCE = Mappers.getMapper(AppointmentRequestMapper.class);



    Appointment appointmentVOToModel(AppointmentRequestVO vo);


    AppointmentRequestVO appointmentModelToVO(Appointment appointment);
}
