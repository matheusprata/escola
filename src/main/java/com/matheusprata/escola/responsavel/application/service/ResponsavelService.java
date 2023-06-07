package com.matheusprata.escola.responsavel.application.service;

import com.matheusprata.escola.responsavel.application.api.ResponsavelRequest;
import com.matheusprata.escola.responsavel.application.api.ResponsavelResponse;
import java.util.UUID;

public interface ResponsavelService {
    ResponsavelResponse saveResponsavel(UUID idAluno, ResponsavelRequest responsavelRequest);
}