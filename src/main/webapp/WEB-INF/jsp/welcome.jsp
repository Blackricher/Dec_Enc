<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Encoding and Decoding</title>
    <style>
        /* CSS styles for the page layout */
        body {
            font-family: Arial, sans-serif;
            background-color: #99ffff; /* 3D Blue color for background */
            color: #030617; /* Text color */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            height: 100vh;
        }

        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            width: 80%; /* Set the overall width of the container */
            margin-bottom: 20px;
        }

       

        

       

        /* Other styles (unchanged from your original code) */
        .section {
            margin-bottom: 30px;
            width: 100%;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .section h2 {
            margin-bottom: 10px;
            background-color: #ff5252; /* Red backdrop color for "Encoding" and "Decoding" headings */
            padding: 5px 10px;
            border-radius: 5px;
        }

        .section form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .section label,
        .section input[type="submit"] {
            margin-bottom: 10px;
        }

        .section input[type="submit"] {
            width: 100px;
        }

        .section p,
        .section input[type="text"] {
            width: 300px;
        }

        .section button {
            margin-left: 10px;
        }

        /* Create a two-column layout using Flexbox */
        .two-column-layout {
            display: flex;
            justify-content: space-between;
            width: 100%;
        }

        .encryption-column,
        .decryption-column {
            flex-basis: 48%; /* Adjust the column width as needed */
        }       

       
    </style>
</head>
<body>
    <div class="container">
        <div class="two-column-layout">
            <!-- Encryption Part -->
            <div class="encryption-column">
                <div class="section">
                    <h2>Encoding2Ankit</h2>
                    <form action="encrypt" method="post">
                        <label for="encodeKey">Custom Key:</label>
                        <input type="text" id="encodeKey" name="key" required>
                        <br><br>
                        <label for="encodeValue">Value:</label>
                        <input type="text" id="encodeValue" name="value" required>
                        <br><br>
                        <input type="submit" value="Encrypt">
                    </form>
                    <h3>Encrypted Value:</h3>
                    <input type="text" id="encryptedValue" value="${encryptedValue}" readonly>
                    <button onclick="copyToClipboard('encryptedValue')">Copy Encrypted Text</button>
                </div>
            </div>

            <!-- Decryption Part -->
            <div class="decryption-column">
                <div class="section">
                    <h2>Decoding2</h2>
                    <form action="decrypt" method="post">
                        <label for="decodeKey">Custom Key:</label>
                        <input type="text" id="decodeKey" name="key" required>
                        <br><br>
                        <label for="decodeValue">Value:</label>
                        <input type="text" id="decodeValue" name="value" required>
                        <br><br>
                        <input type="submit" value="Decrypt">
                    </form>
                    <h3>Decrypted Value:</h3>
                    <input type="text" id="decryptedValue" value="${decryptedValue}" readonly>
                    <button onclick="copyToClipboard('decryptedValue')">Copy Decrypted Text</button>
                </div>
            </div>
        </div>
    </div>

    <script>
        // JavaScript function to copy text
        function copyToClipboard(inputId) {
            var input = document.getElementById(inputId);
            input.select();
            document.execCommand("copy");
            alert("Text copied to clipboard: " + input.value);
        }
    </script>
</body>
</html>
