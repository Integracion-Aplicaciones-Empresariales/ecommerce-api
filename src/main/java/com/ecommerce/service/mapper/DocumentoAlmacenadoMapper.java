package com.ecommerce.service.mapper;



import com.ecommerce.service.entity.DocumentoAlmacenado;
import com.ecommerce.service.entity.dto.DocumentoAlmacenadoDto;
import com.ecommerce.service.mapperImpl.GenericMapperImpl;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentoAlmacenadoMapper extends GenericMapperImpl.GenericMapper<DocumentoAlmacenadoDto, DocumentoAlmacenado> {
    @Override
    DocumentoAlmacenadoDto toDto(DocumentoAlmacenado documentoAlmacenado);
    @Override
    DocumentoAlmacenado toEntity(DocumentoAlmacenadoDto documentoAlmacenadoDto);
}
