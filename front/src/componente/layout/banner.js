import styles from './Banner.module.css'

function Banner() {
    return (
        <div>

            <div>
                <div class="card-img-overlay text-monospace">
                    <h1 class="card-title h-45">Sua Vida</h1>
                    <h1 class="card-text h-25">sempre a mil!</h1>
                </div>
            </div>

            <table>
                <tr>
                    
                    <img className={styles.banner} src="https://eusouclick.clickintercambios.com.br/wp-content/uploads/2019/02/cover_image-1500x500.jpg" alt='logo milias'/>
                    
                </tr>
            </table>
        </div>
    )
}

export default Banner