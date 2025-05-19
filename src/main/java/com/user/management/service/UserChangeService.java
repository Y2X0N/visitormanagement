package com.user.management.service;

import com.user.management.model.FlagEnum;
import com.user.management.model.User;
import com.user.management.model.dto.ResponseDto;
import com.user.management.model.dto.UserChangeRequestDto;
import com.user.management.repository.GetUserRepository;
import com.user.management.repository.UserChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserChangeService {

    @Autowired
    private GetUserRepository getUserRepository;

    @Autowired
    private UserChangeRepository userChangeRepository;

    public ResponseDto handleUpdateUser(UserChangeRequestDto userChangeRequestDto) {
        FlagEnum flag = FlagEnum.fromString(userChangeRequestDto.getFlag());
        switch (flag) {
            case ADD:
                addUser(userChangeRequestDto);
                break;
            case UPDATE:
                updateUser(userChangeRequestDto);
                break;
            case DELETE:
                deleteUser(userChangeRequestDto.getUserId());
                break;
            default:
                break;
        }
        return new ResponseDto();
    }

    public void addUser(UserChangeRequestDto userChangeRequestDto) {
        User user = new User(userChangeRequestDto);
        String createdBy = "placeHolder"; // get from spring security
        user.setCreatedBy(createdBy);

        userChangeRepository.save(user);
    }

    public void updateUser(UserChangeRequestDto userChangeRequestDto) {
        User user = getUserRepository.findById(userChangeRequestDto.getUserId())
                        .orElseThrow(() -> new RuntimeException("ユウーザは存在しません。"));

        user.setUserId(userChangeRequestDto.getUserId());
        user.setAdmin(userChangeRequestDto.isAdmin());
        user.setName(userChangeRequestDto.getName());
        user.setEmail(userChangeRequestDto.getEmail());
        user.setPassword(userChangeRequestDto.getPassword());

        String updatedBy = "placeHolder"; // get from spring security
        user.setCreatedBy(updatedBy);

        userChangeRepository.save(user);
    }

    public void deleteUser(String userId) {
        Optional<User> user = getUserRepository.findById(userId);
        user.ifPresent(value -> userChangeRepository.softDeleteById(value.getUserId()));
    }
}

