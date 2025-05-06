<script>
    import AnnoButton from "./annoButton.svelte";

</script>

<div class="gallery">
    <AnnoButton image="https://corsi.tecnicadellascuola.it/wp-content/uploads/2020/03/Scienze-naturali.jpg"
                anno="2020/21"/>
    <AnnoButton image="https://corsi.tecnicadellascuola.it/wp-content/uploads/2020/03/Scienze-naturali.jpg"
                anno="2021/22"/>
    <AnnoButton image="https://corsi.tecnicadellascuola.it/wp-content/uploads/2020/03/Scienze-naturali.jpg"
                anno="2020/21" />
    <AnnoButton   image="https://corsi.tecnicadellascuola.it/wp-content/uploads/2020/03/Scienze-naturali.jpg"
                anno="2020/21"/>
    <AnnoButton image="https://corsi.tecnicadellascuola.it/wp-content/uploads/2020/03/Scienze-naturali.jpg"
                anno="2020/21"/>
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