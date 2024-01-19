# Email Sender Microservice

## Description

The Microservice solution developed for the Uber Backend challenge [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## Technologies

- Backend:
  - Java Springboot
- Infra:
  - AWS Simple Email Service

## Installation

1. Clone the repository:

```bash
git clone https://github.com/mancinilucas/sb-email-service.git
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "youremail@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```

