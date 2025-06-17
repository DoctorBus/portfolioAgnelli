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

    <CardMaterie titolo="Relazione sulla situazione manicomiale in Italia"
                    materia="Italiano"
                    descr='Con la professoressa Maura Giannatasio, abbiamo affrontato il tema della situazione manicomiale in Italia, dopo svariate lezioni e dopo la lettura del libro “L’altra verità”, di Alda Merini, abbiamo scritto un tema come compito.'
                    ctx="pdf/Relazione_Manicomio_Philippe_Smal.pdf"
                    tipo="pdf"/>

    <CardMaterie titolo="1522"
                    materia="Informatica"
                    descr="Con la professoressa Emanuela Aruzza abbiamo svolto un lavoro individuale ricreando il sito 1522, dedicato alla lotta contro la violenza sulle donne, in una versione funzionante."
                    ctx="pdf/Capolavoro1522Smal.pdf"
                    tipo="pdf"/>

    <CardMaterie titolo="Unessay"
                materia="Inglese"
                descr="Con il professor Daniel De Santis abbiamo affrontato il tema della guerra tramite due poesie di Wilfred Owen e Rupert Brooke. Dopo la lettura, abbiamo dovuto creare un saggio in cui spiegavamo la nostra visione della guerra."
                ctx="pdf/Unessay_war.pdf"
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
        background-image: url("https://www.gedistatic.it/content/gnn/img/lastampa/2021/12/01/011133776-3810cbbd-b1f1-42d1-9492-5ae4584ae7d8.jpg");
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
