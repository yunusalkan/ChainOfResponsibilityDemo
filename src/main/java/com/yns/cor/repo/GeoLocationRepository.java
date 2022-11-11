package com.yns.cor.repo;

import java.util.Optional;

public interface GeoLocationRepository {
    Optional<GeoLocation> findGeoLocationByIp(String ip);
}
