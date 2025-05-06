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

    <CardMaterie titolo="Disinformazione"
                    materia="Chimica"
                    descr="Con la professoressa Beatrice Nervo, abbiamo affrontato il tema della disinformazione facendo un articolo."
                    ctx="imgs/arg/fakenews.jpg"
                    width={20}/>

    <CardMaterie titolo="Conferenza ONU"
                    materia="Diritto ed economia"
                    descr="Con la professoressa Daniela Foti, abbiamo simulato una conferenza ONU in classe dove ognuno impersonificava il presidente dello stato, nel mio caso la Francia."
                    ctx="pdf/diritto_francia.pdf"
                    tipo="pdf"/>  
    
    <CardMaterie titolo="L'energia"
                    materia="Fisica"
                    descr="Con il professor Samuele Lancini, abbiamo creato una presentazione powerpoint a gruppi su un argomento a scelta che trattava la fisica."
                    ctx="pdf/cambiamento.pdf"
                    tipo="pdf"/>
    
    <CardMaterie titolo="FFF, Friday For Future"
                    materia="Biologia"
                    descr="Con il professor Matteo Negro, abbiamo creato una mappa concettuale su FFF e Cop 26 dopo aver visto dei video e aver partcipato a una conferenza."
                    ctx="imgs/arg/fff.jpg"/>

    
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
        background-image: url("https://www.aics.gov.it/oltremare/wp-content/uploads/2021/07/Fake-news-Afirca.jpg");
        background-size: cover;
        background-position: center;
        z-index: 0;
    }

    .content {
        position: relative;
        z-index: 1;
        background: rgba(255, 255, 255, 0.2);
        backdrop-filter: blur(10px);
        -webkit-backdrop-filter: blur(10px);
        padding: 2rem;
        border-radius: 1rem;
        padding: 0px;
        margin: 0px;
    }
</style>
