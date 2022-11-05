import styles from './Footer.module.css'

import { FaFacebookF, FaInstagram,FaEnvelope, } from 'react-icons/fa'
import { BsFillTelephoneFill} from 'react-icons/bs'
import { AiFillHome} from 'react-icons/ai'

function Footer() {
    return (
        <div className={styles.Footer}>

            <div className={styles.desc}>
                <p className={styles.titulo}> Vem conhecer!</p>
                <p>Não se preocupe, a gente te ajuda por celular ou email! Você vai querer estar por dentro de nossas novidades,né?! Então não perde tempo e já segue a gente aí!</p>

                <ul className={styles.redes}>
                    <li><AiFillHome /> Rua Alpinar da costa silva 542 </li>
                    <li>  <BsFillTelephoneFill /> 3456-7659 </li>
                    <li><FaEnvelope /> milliasamil@gmail.com  </li>
                    <li> <FaFacebookF /> fmiliasamil</li>
                    <li> <FaInstagram /> miliasamiloficial </li>
                </ul>

            </div>

        </div>
            )
}

            export default Footer