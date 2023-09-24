package eu.kanade.tachiyomi.multisrc.mangathemesia

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

// Formerly WPMangaStream & WPMangaReader -> MangaThemesia
class MangaThemesiaGenerator : ThemeSourceGenerator {

    override val themePkg = "mangathemesia"

    override val themeClass = "MangaThemesia"

    override val baseVersionCode: Int = 26

    override val sources = listOf(
        MultiLang("Asura Scans", "https://asuracomics.com", listOf("en", "tr"), className = "AsuraScansFactory", pkgName = "asurascans", overrideVersionCode = 26),
        MultiLang("Flame Scans", "https://flamescans.org", listOf("en"), className = "FlameScansFactory", pkgName = "flamescans", overrideVersionCode = 4),
        MultiLang("Miau Scan", "https://miauscans.com", listOf("es", "pt-BR"), overrideVersionCode = 1),
        SingleLang("Animated Glitched Scans", "https://anigliscans.xyz", "en", overrideVersionCode = 1),
        SingleLang("Arena Scans", "https://arenascans.net", "en", overrideVersionCode = 1),
        SingleLang("Arkham Scan", "https://arkhamscan.com", "pt-BR"),
        SingleLang("Arven Scans", "https://arvenscans.com", "en"),
        SingleLang("Azure Scans", "https://azuremanga.com", "en", overrideVersionCode = 1),
        SingleLang("Banana-Scan", "https://banana-scan.com", "fr", className = "BananaScan", isNsfw = true),
        SingleLang("Beast Scans", "https://beast-scans.com", "ar"),
        SingleLang("Boosei", "https://boosei.net", "id", overrideVersionCode = 2),
        SingleLang("Cartel de Manhwas", "https://carteldemanhwas.com", "es", overrideVersionCode = 5),
        SingleLang("Cosmic Scans", "https://cosmicscans.com", "en", overrideVersionCode = 1),
        SingleLang("CosmicScans.id", "https://cosmicscans.id", "id", overrideVersionCode = 2, className = "CosmicScansID"),
        SingleLang("Diskus Scan", "https://diskusscan.com", "pt-BR", overrideVersionCode = 7),
        SingleLang("Dojing.net", "https://dojing.net", "id", isNsfw = true, className = "DojingNet"),
        SingleLang("DuniaKomik.id", "https://duniakomik.org", "id", className = "DuniaKomikId", overrideVersionCode = 2),
        SingleLang("ElarcPage", "https://elarcpage.com", "en"),
        SingleLang("EnryuManga", "https://enryumanga.com", "en"),
        SingleLang("Epsilon Scan", "https://epsilonscan.fr", "fr", isNsfw = true),
        SingleLang("Fairy Manga", "https://fairymanga.com", "en", className = "QueenScans", overrideVersionCode = 1),
        SingleLang("Franxx Mangás", "https://franxxmangas.net", "pt-BR", className = "FranxxMangas", isNsfw = true),
        SingleLang("Freak Scans", "https://freakscans.com", "en"),
        SingleLang("Gecenin Lordu", "https://geceninlordu.com", "tr", overrideVersionCode = 1),
        SingleLang("GoGoManga", "https://gogomanga.fun", "en", overrideVersionCode = 1),
        SingleLang("Gremory Mangas", "https://gremorymangas.com", "es"),
        SingleLang("Hanuman Scan", "https://hanumanscan.com", "en"),
        SingleLang("Heroxia", "https://heroxia.com", "id", isNsfw = true),
        SingleLang("Imagine Scan", "https://imaginescan.com.br", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Infernal Void Scans", "https://void-scans.com", "en", overrideVersionCode = 5),
        SingleLang("KataKomik", "https://katakomik.online", "id"),
        SingleLang("Komik Seru", "https://komikseru.me", "id", isNsfw = true),
        SingleLang("Kanzenin", "https://kanzenin.xyz", "id", isNsfw = true),
        SingleLang("Komiksan", "https://komiksan.link", "id", overrideVersionCode = 2),
        SingleLang("Kiryuu", "https://kiryuu.id", "id", overrideVersionCode = 6),
        SingleLang("Komik AV", "https://komikav.com", "id", overrideVersionCode = 1),
        SingleLang("Komik Cast", "https://komikcast.vip", "id", overrideVersionCode = 21),
        SingleLang("KomikDewasa", "https://komikdewasa.org", "id", isNsfw = true),
        SingleLang("Komik Station", "https://komikstation.co", "id", overrideVersionCode = 4),
        SingleLang("KomikIndo.co", "https://komikindo.co", "id", className = "KomikindoCo", overrideVersionCode = 3),
        SingleLang("Komik Lab", "https://komiklab.com", "en", overrideVersionCode = 3),
        SingleLang("KomikMama", "https://komikmama.co", "id", overrideVersionCode = 1),
        SingleLang("KomikManhwa", "https://komikmanhwa.me", "id", isNsfw = true),
        SingleLang("KumaPoi", "https://kumapoi.club", "id", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Komiku.com", "https://komiku.com", "id", className = "KomikuCom"),
        SingleLang("Kuma Scans (Kuma Translation)", "https://kumascans.com", "en", className = "KumaScans", overrideVersionCode = 1),
        SingleLang("Legacy Scans", "https://legacy-scans.com", "fr", pkgName = "flamescansfr"),
        SingleLang("Legion Scan", "https://legionscans.com", "es", overrideVersionCode = 6),
        SingleLang("Lelmanga", "https://www.lelmanga.com", "fr"),
        SingleLang("LianScans", "https://www.lianscans.my.id", "id", isNsfw = true),
        SingleLang("Lunar Scans", "https://lunarscan.org", "en", isNsfw = true),
        SingleLang("LynxScans", "https://lynxscans.com", "en"),
        SingleLang("Lyra Scans", "https://lyrascans.com", "en"),
        SingleLang("Magus Manga", "https://magusmanga.com", "ar"),
        SingleLang("Manga Indo.me", "https://mangaindo.me", "id", className = "MangaIndoMe"),
        SingleLang("Manga Raw.org", "https://mangaraw.org", "ja", className = "MangaRawOrg", overrideVersionCode = 1),
        SingleLang("Mangacim", "https://www.mangacim.com", "tr", overrideVersionCode = 1),
        SingleLang("MangaKita", "https://mangakita.net", "id", overrideVersionCode = 1),
        SingleLang("Mangakyo", "https://mangakyo.org", "id", overrideVersionCode = 2),
        SingleLang("MangaShiina", "https://mangashiina.com", "es"),
        SingleLang("Mangasusu", "https://mangasusuku.xyz/", "id", isNsfw = true, overrideVersionCode = 2),
        SingleLang("MangaTale", "https://mangatale.co", "id"),
        SingleLang("MangaWT", "https://mangawt.com", "tr", overrideVersionCode = 5),
        SingleLang("Mangayaro", "https://mangayaro.net", "id"),
        SingleLang("Manhwa Lover", "https://manhwalover.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("MangaSwat", "https://swatmanga.co", "ar", overrideVersionCode = 13),
        SingleLang("MangKomik", "https://mangkomik.net", "id", overrideVersionCode = 1),
        SingleLang("Mangás Chan", "https://mangaschan.net", "pt-BR", className = "MangasChan", overrideVersionCode = 1),
        SingleLang("Manhwa Freak", "https://manhwa-freak.com", "en", overrideVersionCode = 2),
        SingleLang("ManhwaFreak", "https://manhwafreak.fr", "fr", className = "ManhwaFreakFR"),
        SingleLang("ManhwaDesu", "https://manhwadesu.one", "id", isNsfw = true, overrideVersionCode = 4),
        SingleLang("ManhwaIndo", "https://manhwaindo.id", "id", isNsfw = true, overrideVersionCode = 3),
        SingleLang("ManhwaLand.mom", "https://manhwaland.lat", "id", isNsfw = true, className = "ManhwaLandMom", overrideVersionCode = 5),
        SingleLang("ManhwaList", "https://manhwalist.com", "id", overrideVersionCode = 4),
        SingleLang("Manhwax", "https://manhwax.com", "en", isNsfw = true),
        SingleLang("Mareceh", "https://mareceh.com", "id", isNsfw = true, pkgName = "mangceh", overrideVersionCode = 10),
        SingleLang("MELOKOMIK", "https://melokomik.xyz", "id"),
        SingleLang("Mihentai", "https://mihentai.com", "all", isNsfw = true, overrideVersionCode = 2),
        SingleLang("MirrorDesu", "https://mirrordesu.me", "id", isNsfw = true),
        SingleLang("Moon Daisy Scans", "https://moondaisyscans.com", "tr", isNsfw = true),
        SingleLang("Mundo Mangá-Kun", "https://mundomangakun.com.br", "pt-BR", className = "MundoMangaKun", isNsfw = true),
        SingleLang("Nekomik", "https://nekomik.me", "id", overrideVersionCode = 1),
        SingleLang("Ngomik", "https://ngomik.net", "id", overrideVersionCode = 2),
        SingleLang("NIGHT SCANS", "https://nightscans.org", "en", isNsfw = true, className = "NightScans", overrideVersionCode = 1),
        SingleLang("Nocturnal Scans", "https://nocturnalscans.com", "en", overrideVersionCode = 1),
        SingleLang("Noromax", "https://noromax.my.id", "id"),
        SingleLang("OPSCANS", "https://opscans.com", "all"),
        SingleLang("Origami Orpheans", "https://origami-orpheans.com.br", "pt-BR", overrideVersionCode = 9),
        SingleLang("Ozul Scans", "https://ozulscans.xyz", "ar", overrideVersionCode = 1),
        SingleLang("Phantom Scans", "https://phantomscans.com", "en", overrideVersionCode = 1),
        SingleLang("PhenixScans", "https://phenixscans.fr", "fr", className = "PhenixScans", overrideVersionCode = 1),
        SingleLang("Pi Scans", "https://piscans.in", "id", overrideVersionCode = 1),
        SingleLang("PotatoManga", "https://potatomanga.xyz", "ar"),
        SingleLang("Raiki Scan", "https://raikiscan.com", "es"),
        SingleLang("Raven Scans", "https://ravenscans.com", "en", overrideVersionCode = 1),
        SingleLang("Rawkuma", "https://rawkuma.com/", "ja"),
        SingleLang("ReadGojo", "https://readgojo.com", "en"),
        SingleLang("Readkomik", "https://readkomik.com", "en", className = "ReadKomik", overrideVersionCode = 1),
        SingleLang("Ryukonesia", "https://ryukonesia.net", "id"),
        SingleLang("Sekaikomik", "https://www.sekaikomik.pro", "id", isNsfw = true, overrideVersionCode = 10),
        SingleLang("Sekte Doujin", "https://sektedoujin.lol", "id", isNsfw = true, overrideVersionCode = 4),
        SingleLang("Senpai Ediciones", "http://senpaiediciones.com", "es", overrideVersionCode = 1),
        SingleLang("Shadow Mangas", "https://shadowmangas.com", "es", overrideVersionCode = 1),
        SingleLang("Shea Manga", "https://sheakomik.com", "id", overrideVersionCode = 4),
        SingleLang("Silence Scan", "https://silencescan.com.br", "pt-BR", isNsfw = true, overrideVersionCode = 5),
        SingleLang("SkyMangas", "https://skymangas.com", "es"),
        SingleLang("Snudae Scans", "https://snudaescans.com", "en", isNsfw = true, className = "BatotoScans", overrideVersionCode = 1),
        SingleLang("Soul Scans", "https://soulscans.my.id", "id"),
        SingleLang("SSSScanlator", "https://sssscanlator.com", "pt-BR"),
        SingleLang("SSS Hentais", "https://hentais.sssscanlator.com", "pt-BR", isNsfw = true, className = "SssHentais"),
        SingleLang("Starlight Scan", "https://starligthscan.com", "pt-BR", isNsfw = true),
        SingleLang("Summer Fansub", "https://smmr.in", "pt-BR", isNsfw = true),
        SingleLang("SummerToon", "https://summertoon.com", "tr"),
        SingleLang("Surya Scans", "https://suryascans.com", "en"),
        SingleLang("Sushi-Scan", "https://sushiscan.net", "fr", className = "SushiScan", overrideVersionCode = 6),
        SingleLang("Sushiscan.fr", "https://sushiscan.fr", "fr", className = "SushiScanFR"),
        SingleLang("Tarot Scans", "https://www.tarotscans.com", "tr"),
        SingleLang("Tecno Scan", "https://tecnoscann.com", "es", isNsfw = true, overrideVersionCode = 6),
        SingleLang("TenkaiScan", "https://tenkaiscan.net", "es", isNsfw = true),
        SingleLang("Tenshi.id", "https://tenshi.id", "id", className = "TenshiId", pkgName = "masterkomik", overrideVersionCode = 3),
        SingleLang("The Apollo Team", "https://theapollo.team", "en"),
        SingleLang("Tsundoku Traduções", "https://tsundoku.com.br", "pt-BR", className = "TsundokuTraducoes", overrideVersionCode = 9),
        SingleLang("TukangKomik", "https://tukangkomik.id", "id", overrideVersionCode = 1),
        SingleLang("TurkToon", "https://turktoon.com", "tr"),
        SingleLang("Uzay Manga", "https://uzaymanga.com", "tr", overrideVersionCode = 5),
        SingleLang("Walpurgi Scan", "https://www.walpurgiscan.com", "it", overrideVersionCode = 6, className = "WalpurgisScan", pkgName = "walpurgisscan"),
        SingleLang("West Manga", "https://westmanga.info", "id", overrideVersionCode = 1),
        SingleLang("World Romance Translation", "https://wrt.my.id", "id", overrideVersionCode = 10),
        SingleLang("xCaliBR Scans", "https://xcalibrscans.com", "en", overrideVersionCode = 4),
        SingleLang("Zahard", "https://zahard.xyz", "en"),
        SingleLang("สดใสเมะ", "https://www.xn--l3c0azab5a2gta.com", "th", isNsfw = true, className = "Sodsaime", overrideVersionCode = 1),
        SingleLang("أريا مانجا", "https://www.areascans.net", "ar", className = "AreaManga"),
        SingleLang("فيكس مانجا", "https://vexmanga.net", "ar", className = "VexManga"),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MangaThemesiaGenerator().createAll()
        }
    }
}
