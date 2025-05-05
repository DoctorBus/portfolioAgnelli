<div class="presentation">
    <div class="img-box">
        <img src="imgs/pfp/pfp.jpeg" alt="">
    </div>
    <div class="info">
        <div class="contenuto">
            <h1>Portfolio di Ed. Civica</h1>
            <p>Mi chiamo <span>Philippe Smal</span> e sono uno studente con origini francesi e ho una forte passione 
                per l'informatica. Ho creato questo portfolio per unire il mio interesse
                per il digitale con il percorso svolto in Educazione Civica, documentando
                in modo chiaro e moderno il lavoro compiuto in questi 5 anni di percorso.
            </p>
        </div>
    </div>
</div>

<style>
    .presentation {
        width: 60%;
        height: 60vh;
        display: grid;
        grid-template-columns: 30% 70%;
        margin: 100px auto 0;
        background-color: black;
        color: white;
        padding: 20px;
        gap: 30px;
    }

    .presentation .img-box {
        width: 100%;
        height: 100%;
        overflow: hidden;
        vertical-align: middle;
        display: flex;
        justify-content: center;
    }

    .presentation .info {
        display: flex;
        justify-content: center; 
        align-items: center;     
    }

    .presentation .info .contenuto {
        padding: 20px;
        height: 30vh;
        width: 40vw;
        display: grid;
        grid-template-rows: 30% 70%;
        font-size: 20px;
    }

    .presentation .info h1 {
        font-size: 50px;
    }

    .presentation .info p {
        max-width: 90%;
        text-align: justify;
    }

    span {
        color: rgb(241, 217, 0);
    }

</style>