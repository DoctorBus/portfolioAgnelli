<script>
    import { base } from "$app/paths";

    export let image;
    export let anno;
</script>

<div class="card" style="background-image: url({image});">
    <h1>Anno - {anno}</h1>
    <a href="{base}/{anno.replace("/", "_")}">Vedi anno  &#10143;</a>
</div>

<style> 
    .card {
        width: 30vw;
        height: 20vh;
        margin: 0px auto 0;
        padding: 20px;
        text-align: center;
        display: grid;
        grid-template-rows: 70% 30%;
        border: 1px solid grey;
        color: white;
        background-repeat: no-repeat;
        background-size: cover;
    }

    .card a {
        text-decoration: none;
        color: white;
        background-color: black;
        padding: 15px;
        height: fit-content;
        width: 200px;
        margin: 0px auto 0;
        border: 3px solid black;
        transition: .5s;
    }

    .card h1 {
        width: fit-content;
        height: fit-content;
        margin: 0px auto 0;
        background-color: rgba(44, 44, 44, 0.562);
        padding: 10px;
    }

    .card a:hover {
        background-color: rgba(0, 0, 0, 0.568) ;
    }

</style>
