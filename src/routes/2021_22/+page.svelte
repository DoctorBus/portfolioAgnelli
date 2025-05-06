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

    <CardMaterie titolo="Corona virus"
                    materia="Scienza della terra"
                    descr="Con il professore Matteo Negro abbiamo approfondito il tema del coronavirus facendo una mappa concettuale."
                    ctx="imgs/arg/photo_2020_scienza.jpg"/>

    <CardMaterie titolo="Netiquette"
                    materia="Informatica"
                    descr="Con la professoressa Emanuela Arruzza, abbiamo creato un powerpoint sulle buone maniere su internet, la Netiquette."
                    ctx="pdf/netiquette.pptx.pdf"
                    tipo="pdf"/>  
    
    <CardMaterie titolo='Il "viaggio della speranza" di Adamà'
                    materia="Italiano"
                    descr="Con il professor Rollo abbiamo discusso sull' immigrazione e abbiamo scritto un tema."
                    ctx="pdf\_viaggio_della_speranza.pdf"
                    tipo="pdf"/>
    
    <CardMaterie titolo="Podcast"
                    materia="Scienza della terra"
                    descr="Con il professor Matteo Negro, abbiamo parlato dell'esobiologia tramite un podcast."
                    ctx="audio/agnellicast.mp3"
                    tipo="voc"/>
    
    <CardMaterie titolo="I diritti umani nel mondo"
                    materia="Diritto ed economia"
                    descr="Con la professoressa Foti, abbiamo discusso sui diritti umani con un tema."
                    ctx="pdf/diritti_umani_nel_mondo.pdf"
                    tipo="pdf"/>
    
    <CardMaterie titolo="Considerazioni Dott. Bartolo"
                    materia="Storia"
                    descr="Con la professoressa Silvia Piede, abbiamo discusso sull' immigrazione leggendo un libro e scrivendo le nostre considerazioni."
                    ctx="pdf/dottor_Bartolo.docx.pdf"
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
        background-image: url("https://corsi.tecnicadellascuola.it/wp-content/uploads/2020/03/Scienze-naturali.jpg");
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
