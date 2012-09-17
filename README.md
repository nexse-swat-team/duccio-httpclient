Duccio HttpClient
===

Quando hai bisogno di parlare con un server https il cui certificato non è
firmato da una Certification Authority riconosciuta (tipicamente perché si
tratta di un certificato di test autofirmato), puoi usare un client https
che non effettua verifiche sulla chain of trust. Nella classe Main c'è un
esempio d'uso.

## FAQ

### Perché Duccio?

Duccio è un personaggio della fiction italiana Boris. Direttore della
fotografia, Duccio si trova spesso a ripetere alla sua truppa di elettricisti:
[Apri tutto! Smarmella!](http://www.youtube.com/watch?v=5jc_R9_im9w). Questo
è il client https che userebbe Duccio.