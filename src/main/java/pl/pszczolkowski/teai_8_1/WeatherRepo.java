package pl.pszczolkowski.teai_8_1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pszczolkowski.teai_8_1.entities.Weather;

@Repository
public interface WeatherRepo extends JpaRepository<Weather, Long> {

}
