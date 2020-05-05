# quarkus-monitoring-grafana-prometheus project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

# Prometheus

docker run --name prometheus -d --network host prom/prometheus

## Config prometheus: change only if necessary

docker exec -it prometheus vi /etc/prometheus/prometheus.yml

# Grafana

docker run --name grafana -d --network host grafana/grafana

# Run Project

./mvnw quarkus:dev
