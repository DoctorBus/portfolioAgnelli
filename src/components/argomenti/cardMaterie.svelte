<script>
    export let titolo;
    export let materia;
    export let descr;
    export let tipo = "img";
    export let ctx;
    export let width;
    let coloriCard = {
        "Scienza della terra" : "rgba(0, 0, 255, 0.5)",      
        "Informatica": "rgba(0, 128, 0, 0.5)",               
        "Italiano": "rgba(255, 0, 0, 0.5)",                  
        "Diritto ed economia": "rgba(255, 255, 0, 0.5)",     
        "Storia": "rgba(165, 42, 42, 0.5)",                  
        "Chimica": "rgba(128, 0, 128, 0.5)",                 
        "Fisica": "rgba(128, 128, 128, 0.5)",                
        "Biologia": "rgba(173, 255, 47, 0.5)",              
        "Inglese": "rgba(0, 193, 207, 0.5)",                
        "Sistemi e reti": "rgba(32, 178, 170, 0.5)"         
    }   
</script>

<div class="card" style="background-color: {coloriCard[materia]};">
    <h1>{titolo}</h1>
    <div class="info">
        {#if tipo == "pdf"}
            <object data="{ctx}" type="" title=""></object>
        {:else if tipo == "voc"}
            <audio controls="">
                <source src="{ctx}" type="audio/mpeg">
                Your browser does not support the audio tag.
            </audio>
        {:else if tipo == "video"}
            <iframe src="{ctx}" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
        {:else}
            <img src="{ctx}" alt="" style="width: {width}vw">
        {/if}
        <p>{descr}</p>
    </div>
    <h3>{materia}</h3>
</div>

<style>
    .card {
        margin: 20px auto 0;
        width: 50vw;
        background-color: rgba(0, 193, 207, 0.4);
        padding: 20px;
        min-height: 50vh;
        max-height: 80vh;
        color: white;
        border: 1px solid grey;
        display: grid;
        grid-template-rows: 10% 85% 5%;
    }

    .card h3 {
        text-align: end;
    }

    .card .info {
        display: grid;
        grid-template-rows: 85% 15%;
        gap: 20px;
    }

    .card img, object, audio, iframe{
        height: 100%;
        width: 100%;
        margin: 0px auto 0;
    }


    .card p {
        text-align: justify;
    }
</style>
