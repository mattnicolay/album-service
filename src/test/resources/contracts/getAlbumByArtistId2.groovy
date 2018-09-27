import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("should return the album associated with artist id 2")

    request {
        url("/albums") {
            queryParameters {
                parameter 'artistId' : 2
            }
        }
        method GET()
    }

    response {
        status(200)
        headers {
            contentType applicationJson()
        }
        body(
        [
            [
                "id":2,
                "name":"Scenery",
                "year":"1977"
            ]
        ]
        )
    }
}