package ru.petrojectgroup.conscience.model.user;

public class UserMapper {
    public static User dtoToPojo(UserDto dto) {
        User pojo = new User();
        pojo.setEmail(dto.getEmail());
        pojo.setLogin(dto.getLogin());
        pojo.setPhotoUrl(dto.getPhotoUrl());
        pojo.setName(dto.getName());
        pojo.setBirthday(dto.getBirthday());
        return pojo;
    }

    public static UserDto pojoToDto(User pojo) {
        UserDto dto = new UserDto();
        dto.setEmail(pojo.getEmail());
        dto.setLogin(pojo.getLogin());
        dto.setPhotoUrl(pojo.getPhotoUrl());
        dto.setName(pojo.getName());
        dto.setBirthday(pojo.getBirthday());
        return dto;
    }
}
