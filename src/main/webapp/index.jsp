<html>
<script type="javascript">

    var data = JSON.stringify({
        "descricao": "muito boa",
        "sabor": "calabacon",
        "valorBebida": "15.50"
    });

    var xhr = new XMLHttpRequest();
    xhr.withCredentials = true;

    xhr.addEventListener("readystatechange", function () {
        if (this.readyState === 4) {
            console.log(this.responseText);
        }
    });

    xhr.open("POST", "http://localhost:8080/comanda/pizza/salvar");
    xhr.setRequestHeader("content-type", "application/json");
    xhr.setRequestHeader("cache-control", "no-cache");
    xhr.setRequestHeader("postman-token", "861e3392-e9de-093b-96ff-4d39f74a7e1c");

    xhr.send(data);

</script>

<head> <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script></head>

<body>
<h2>Hello World!</h2>
</body>
</html>
