<script>
    export let titolo;
    export let materia;
    export let descr;
    export let tipo = "img";
    export let ctx;
</script>

<div class="card">
    <h1>{titolo}</h1>
    <div class="info">
        {#if tipo == "pdf"}
            <object data="{ctx}" type="" title=""></object>
        {:else if tipo == "voc"}
            <audio controls="">
                <source src="{ctx}" type="audio/mpeg">
                Your browser does not support the audio tag.
            </audio>
        {:else}
            <img src="{ctx}" alt="">
        {/if}
        <p>{descr}</p>
    </div>
    <h3>{materia}</h3>
</div>

<style>
    .card {
        margin: 20px auto 0;
        width: 40vw;
        background-color: rgba(58, 58, 58, 0.507);
        padding: 20px;
        min-height: 50vh;
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

    .card img, object, audio{
        height: 100%;
        width: 100%;
    }


    .card p {
        text-align: justify;
    }
</style>
