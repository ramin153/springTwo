package com.example.other.service;

import org.springframework.stereotype.Service;

@Service
public class TalkToOtherService implements OtherService {

    @Override
    public String otherWord() {
        return "TalkToOther_fromOtherPackage";
    }
}
