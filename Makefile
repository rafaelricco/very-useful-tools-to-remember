start: ##Start stack
	@echo "Start stack"
	@docker-compose -f src/main/resources/docker-compose.yaml up -d
	@sleep 8

stop: ##Stop stack
	@echo "Stop stack"
	@docker-compose -f src/main/resources/docker-compose.yaml down