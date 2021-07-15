FROM golang:1.16-alpine
# FROM 084690408984.dkr.ecr.us-east-1.amazonaws.com/go-1.14.2:v59.0
WORKDIR /app

COPY go.mod .
RUN go mod download

COPY *.go .

RUN go build -o /hello-world-go

EXPOSE 8080

# CMD [ "go", "run", "." ]

CMD [ "/hello-world-go" ]