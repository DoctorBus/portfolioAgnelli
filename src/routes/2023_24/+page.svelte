<script>
    import Topbar from "../../components/utilies/topbar.svelte";
    import Footerbar from "../../components/utilies/footerbar.svelte";
    import CardMaterie from "../../components/argomenti/cardMaterie.svelte";
    import "../style.css"
</script>

<main>
    <div class="background"></div>

    <div class="content">
    <Topbar />

    <CardMaterie titolo="Violenza di genere"
                    materia="Italiano"
                    descr="Con la professoressa Maura Giannatasio, abbiamo affrontato il tema della violenza di genere con la visione di un'intervista fatta a Paolo Di Nicola."
                    ctx="https://www.youtube.com/embed/RwiiIerA_ps?si=o0mH3yZVN8zzwH9Q"
                    tipo="video"/>

    <CardMaterie titolo="Violenza di genere"
                    materia="Italiano"
                    descr="Con la professoressa Maura Giannatasio, abbiamo affrontato il tema della violenza di genere con la visione di un'intervista"
                    ctx="https://www.youtube.com/embed/GrAGp2g3FRU?si=c4BPhCofPpE9V3Zk"
                    tipo="video"/>

    <CardMaterie titolo="Violenza di genere"
                    materia="Inglese"
                    descr='Con il professor De Santis, abbiamo parlato di violenza di genere vedendo il film "Million dollary baby".'
                    ctx="https://www.youtube.com/embed/5_RsHRmIRBY?si=CLCQWE3CjXNZY2CJ"
                    tipo="video"/>  
    
    <CardMaterie titolo="Steganografia - Main.java"
                    materia="Informatica"
                    descr="Con il professor Mancuso, abbiamo fatto un lavoro a gruppi sulla steganografia."
                    ctx="script/progetto/Main.java"
                    tipo="pdf"/>

    <CardMaterie titolo="Steganografia - Convertitore.java"
                    materia="Informatica"
                    descr="Con il professor Mancuso, abbiamo fatto un lavoro a gruppi sulla steganografia."
                    ctx="script/progetto/Converitore.java"
                    tipo="pdf"/>

    <CardMaterie titolo="Steganografia - Decode.java"
                    materia="Informatica"
                    descr="Con il professor Mancuso, abbiamo fatto un lavoro a gruppi sulla steganografia."
                    ctx="script/progetto/Decode.java"
                    tipo="pdf"/>

    <CardMaterie titolo="Steganografia - Lettura.java"
                    materia="Informatica"
                    descr="Con il professor Mancuso, abbiamo fatto un lavoro a gruppi sulla steganografia."
                    ctx="script/progetto/Lettura.java"
                    tipo="pdf"/>

    
    <Footerbar />
    </div>
</main>

<style>
    main {
        position: relative;
        min-height: 100vh;
        overflow: hidden;
    }

    .background {
        position: absolute;
        inset: 0;
        background-image: url("https://www.polis.lombardia.it/wps/wcm/connect/161eb334-b936-4277-ae53-964a7fb7ba3f/Seminario+Violenza+di+genere.bmp?MOD=AJPERES&CACHEID=ROOTWORKSPACE-161eb334-b936-4277-ae53-964a7fb7ba3f-nR.z1W0");
        background-size: cover;
        background-position: center;
        z-index: 0;
    }

    .content {
        position: relative;
        z-index: 1;
        background: rgba(255, 255, 255, 0.2); /* semi-trasparente */
        backdrop-filter: blur(10px);
        -webkit-backdrop-filter: blur(10px);
        padding: 2rem;
        border-radius: 1rem;
        padding: 0px;
        margin: 0px;
    }
</style>
