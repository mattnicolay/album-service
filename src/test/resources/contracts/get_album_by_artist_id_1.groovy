import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("should return the album associated with artist id 1")

    request {
        url("/albums") {
            queryParameters {
                parameter 'artistId' : 1
            }
        }
        method GET()
    }

    response {
        status(200)
        headers {
            contentType applicationJson()
        }
        body('''
        [
            {
                "id": "1",
                "name": "A Moon Shaped Pool",
                "year": "2016"
            }
        ]
        ''')
    }
}