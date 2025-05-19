package com.user.management.controller;

import com.user.management.model.dto.ResponseDto;
import com.user.management.model.dto.UserChangeRequestDto;
import com.user.management.service.UserChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserChangeController {

    @Autowired
    private UserChangeService userChangeService;

    @PostMapping(value = "/users/change", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> updateUser(@RequestBody @Valid UserChangeRequestDto userChangeRequestDto) {
        return ResponseEntity.ok(userChangeService.handleUpdateUser(userChangeRequestDto));
    }
}
