ARG ELK_VERSION

# https://github.com/elastic/logstash-docker
FROM docker.elastic.co/logstash/logstash-oss:${ELK_VERSION}

ADD ./database/GeoLite2-City.mmdb /usr/share/logstash/geoip/GeoLite2-City.mmdb

# Add your logstash plugins setup here
# Example: RUN logstash-plugin install logstash-filter-json
