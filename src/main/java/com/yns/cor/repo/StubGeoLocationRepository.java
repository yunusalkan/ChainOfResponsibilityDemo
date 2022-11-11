package com.yns.cor.repo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StubGeoLocationRepository implements GeoLocationRepository{
    @Override
    public Optional<GeoLocation> findGeoLocationByIp(String ip) {
        return Optional.of(new GeoLocation(36, 42));
    }
}
