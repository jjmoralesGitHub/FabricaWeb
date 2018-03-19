angular.module('fabricaApp', []).controller('catalogosCtrl', function ($scope) {
    $scope.articulos = [
        {
            "id": 100001,
            "nombre": "Pantalon Paño",
            "descripcion": "Descripción pantalón paño",
            "valor": "50.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Amarillo",
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco",
                    "Verde"
                ],
                "tallas": [
                    "8",
                    "12",
                    "29",
                    "30",
                    "32"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa1_articulo100001.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 100002,
            "nombre": "Pantalon Lino",
            "descripcion": "Descripción pantalón lino",
            "valor": "60.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Amarillo",
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco",
                    "Verde"
                ],
                "tallas": [
                    "8",
                    "12",
                    "29",
                    "30",
                    "32"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa1_articulo100002.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 100003,
            "nombre": "Pantalon Algodón",
            "descripcion": "Descripción pantalón algodón",
            "valor": "70.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Amarillo",
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco",
                    "Verde"
                ],
                "tallas": [
                    "8",
                    "12",
                    "29",
                    "30",
                    "32"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa1_articulo100003.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 100004,
            "nombre": "Pantalon Lana",
            "descripcion": "Descripción pantalón lana",
            "valor": "80.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Amarillo",
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco",
                    "Verde"
                ],
                "tallas": [
                    "8",
                    "12",
                    "29",
                    "30",
                    "32"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa1_articulo100004.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 200001,
            "nombre": "Camisa Italiana",
            "descripcion": "Descripción camisa Italiana",
            "valor": "50.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L",
                    "XL"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa2_articulo200001.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 200002,
            "nombre": "Camisa Americana",
            "descripcion": "Descripción camisa americana",
            "valor": "60.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L",
                    "XL"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa2_articulo200002.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 200003,
            "nombre": "Camisa Francés",
            "descripcion": "Descripción camisa Francés",
            "valor": "70.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L",
                    "XL"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa2_articulo200003.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 200004,
            "nombre": "Camisa Club",
            "descripcion": "Descripción camisa club",
            "valor": "80.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Azul",
                    "Rojo",
                    "Negro",
                    "Balnco"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L",
                    "XL"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa2_articulo200004.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 300001,
            "nombre": "Chaqueta Trenca",
            "descripcion": "Descripción chaqueta trenca",
            "valor": "50.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Cafe",
                    "Negro"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa3_articulo300001.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 300002,
            "nombre": "Chaqueta Cuero",
            "descripcion": "Descripción chaqueta cuero",
            "valor": "60.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Cafe",
                    "Negro"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa3_articulo300002.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 300003,
            "nombre": "Chaqueta Traje",
            "descripcion": "Descripción chaqueta traje",
            "valor": "70.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Cafe",
                    "Negro"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa3_articulo300003.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        },
        {
            "id": 300004,
            "nombre": "Chaqueta Invierno",
            "descripcion": "Descripción chaqueta invierno",
            "valor": "80.000",
            "tipoRopaDTO": {
                "id": 1,
                "colores": [
                    "Cafe",
                    "Negro"
                ],
                "tallas": [
                    "S",
                    "M",
                    "L"
                ]
            },
            "urlFoto": "_Imagenes_TipoRopa3_articulo300004.jpg",
            "tallaSeleccionada": "",
            "colorSeleccionado": "",
            "cantidad": 0
        }
    ];

    $scope.tiposIdentificacion = [
        {
            "id": 1,
            "nombre": "Cédula"
        },
        {
            "id": 2,
            "nombre": "Cédula Extranjería"
        },
        {
            "id": 3,
            "nombre": "Tarjeta de Identidad o NUIP"
        }
    ];

    $scope.ciudades = [
        {
            "id": 1,
            "nombre": "Medellín"
        },
        {
            "id": 2,
            "nombre": "Bogotá"
        },
        {
            "id": 3,
            "nombre": "Cali"
        },
        {
            "id": 4,
            "nombre": "Bucaramanga"
        },
        {
            "id": 5,
            "nombre": "Barranquilla"
        }
    ];

    $scope.tiposRopa = [
        {
            "id": 1,
            "nombre": "Camisas formales"
        },
        {
            "id": 2,
            "nombre": "Pantalones formales"
        },
        {
            "id": 3,
            "nombre": "Chaqueta"
        }
        
    ];
});