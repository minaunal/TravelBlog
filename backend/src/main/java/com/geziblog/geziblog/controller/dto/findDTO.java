package com.geziblog.geziblog.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class findDTO {
    private String username;
    private boolean followed=false;

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}

