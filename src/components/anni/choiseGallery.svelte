<script>
    import AnnoButton from "./annoButton.svelte";

</script>

<div class="gallery">
    <AnnoButton image="https://vaccinarsincampania.org/assets/uploads/images/covers/coronavirus.jpg"
                anno="2020/21"/>
    <AnnoButton image="https://www.aics.gov.it/oltremare/wp-content/uploads/2021/07/Fake-news-Afirca.jpg"
                anno="2021/22"/>
    <AnnoButton image="https://cormano-api.municipiumapp.it/s3/2345/media/falcone-borsellino.jpg"
                anno="2022/23" />
    <AnnoButton image="https://www.polis.lombardia.it/wps/wcm/connect/161eb334-b936-4277-ae53-964a7fb7ba3f/Seminario+Violenza+di+genere.bmp?MOD=AJPERES&CACHEID=ROOTWORKSPACE-161eb334-b936-4277-ae53-964a7fb7ba3f-nR.z1W0"
                anno="2023/24"/>
    <AnnoButton image="https://www.gedistatic.it/content/gnn/img/lastampa/2021/12/01/011133776-3810cbbd-b1f1-42d1-9492-5ae4584ae7d8.jpg"
                anno="2024/25"/>
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