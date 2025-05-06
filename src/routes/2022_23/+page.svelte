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

    <CardMaterie titolo="Inclusiveness"
                    materia="Inglese"
                    descr="Con il professor Andrea De Santis, abbiamo cretao come compito a casa un tema sull' inclusività."
                    ctx="pdf/INGLESE_ARTICOLO_INCLUSIVE.pdf"
                    tipo="pdf"/>

    <CardMaterie titolo="Mafia"
                    materia="Italiano"
                    descr='Con la professoressa Maura Giannatasio, abbiamo fatto diverse lezioni sulla criminalità organizzata con la visione del video del canale di "FanPage.it"'
                    ctx="https://www.youtube.com/embed/CKy4xEEwGrc?si=XUE-ITe0hofPB2pY"
                    tipo="video"/>  
    
    <CardMaterie titolo="Diritti della donna nella storia"
                    materia="Italiano"
                    descr="Con la professoressa Maura Giannatasio, abbiamo fatto diverse lezioni sui diritti delle donne nella storia con una visione di un video"
                    ctx="https://www.youtube.com/embed/9p800T0LhB4?si=o6UnBYZtIeOCGDzC"
                    tipo="video"/>
    
    <CardMaterie titolo="La storia dell' informatica"
                    materia="Sistemi e reti"
                    descr="Con la professoressa Emanuela Aruzza, abbiamo creato un powerpoint sulla storia dell'informatica."
                    ctx="pdf/Storia_Info_SMAL_FURINA.pdf"
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
        background-image: url("https://cormano-api.municipiumapp.it/s3/2345/media/falcone-borsellino.jpg");
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
