<script>
    import AnnoButton from "./annoButton.svelte";

</script>

<div class="gallery">
    <AnnoButton />
    <AnnoButton />
    <AnnoButton />
    <AnnoButton />
    <AnnoButton />
</div>

<style>
    .gallery {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(30vw, 1fr));
        gap: 2vw; 
        padding: 20px;
        margin: 100px auto 0;
        width: 70%;
    }
</style>