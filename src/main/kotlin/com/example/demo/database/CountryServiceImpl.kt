package com.example.demo.database


import com.example.demo.data.BookInfo
import com.example.demo.spring.BookService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(private val bookRepository: BookRepository): BookService {

 /*   override fun getAll(): List<BookInfo> = listOf(
        BookInfo("Пришествие бога смерти. Том 4",
        "https://baza-knig.ink/uploads/posts/2023-10/01f8f18c5f11ad0e22c70fb3e58786db1.webp",
        "Дорничев Дмитрий",
        "2023",
        "08:13:36",
        "Я жил себе тихо-мирно, правил загробным миром. Но потом припёрлась эта *** со своими людьми и ангелами! Всё порушили сволочи, да и меня едва не убили… Но я вернулся! Стоп! Мой единственный последователь и кандидат в тела — это больной пацан, который скоро сдохнет? Вы серьёзно?",
        "Ленивое божество ",
        4.0,
        listOf("Фантастика, фэнтези"),
        "17_20231011",
        30,
        3,
        33),
        BookInfo("Пришествие бога смерти. Том 5",
            "https://baza-knig.ink/uploads/posts/2023-11/1700130382_cover.webp",
            "Дорничев Дмитрий",
            "2023",
            "08:40:24",
            "Я жил себе тихо-мирно, правил загробным миром. Но потом припёрлась эта *** со своими людьми и ангелами! Всё порушили сволочи, да и меня едва не убили… Но я вернулся! Стоп! Мой единственный последователь и кандидат в тела — это больной пацан, который скоро сдохнет? Вы серьёзно?",
            "Ленивое божество ",
            5.0,
            listOf("Фантастика, фэнтези"),
            "19_20231117_20231117",
            34,
            3,
            40),
        BookInfo("Славия",
            "https://audioboo.org/uploads/posts/2022-07/1658124606_oblogka.jpg",
            "Шаман Иван",
            "2022",
            "11:08:38",
            "«Паутина миров». Романы, составившие эту серию, написаны в жанре фэнтези в антураже РеалРПГ. Первое пятикнижие серии носит название «Империя»; «Славия» – второй цикл романов по этому миру. Представляем вам первую книгу цикла.\n" +
                    "Его предали самые близкие люди. Он лишён и свободы, и прежних сил, но остался жив. А значит, его враги не смогут спать спокойно. В далёких лесах находится непокорное государство Славия, которое не смирилось с властью империи демонов. Именно туда направляется главный герой, чтобы набраться сил и жестоко отомстить врагам и предателям. Слушайте аудиокнигу!",
            "Паутина миров. Славия",
            1.0,
            listOf("Фантастика, фэнтези","Попаданцы"),
            "15_20220718_202207",
            35,
            20,
            64),
        BookInfo(
            "Месть",
            "https://baza-knig.ink/uploads/posts/2023-04/1680823186_6479920945.jpg",
            "Шаман Иван",
            "2022",
            "12:02:22",
            "Его предали самые близкие люди. Он лишён и свободы, и прежних сил, но остался жив. А значит, его враги не смогут спать спокойно. В далёких лесах находится непокорное государство Славия, которое не смирилось с властью империи демонов. Именно туда направляется главный герой, чтобы набраться сил и жестоко отомстить врагам и предателям.\n" +
                    "\n" +
                    "Герой должен избавиться от рабского ошейника и победить Князя Молоха. Не исключено, что для этого придётся вступить во временную коалицию с теми, кто чуть позже и сам может оказаться его врагом. Слушайте продолжение истории.",
            "Паутина миров. Славия",
            2.0,
            listOf("Фантастика, фэнтези","Попаданцы"),
            "33_20230406_202304",
            7,
            2,
            0),
        BookInfo(
            "Отступник",
            "https://baza-knig.ink/uploads/posts/2023-12/69271975.webp",
            "Шаман Иван",
            "2023",
            "12:19:39",
            "Иван Шаман – молодой писатель-фантаст, один из самых популярных сетевых авторов. Представляем в аудиоформате большую серию книг писателя – «Паутина миров». Романы, составившие эту серию, написаны в жанре фэнтези в антураже РеалРПГ. Первое пятикнижие серии носит название «Империя»; «Славия» – второй цикл романов по этому миру. Предлагаем вам третью книгу серии. Его предали самые близкие люди. Он лишён и свободы, и прежних сил, но остался жив. А значит, его враги не смогут спать спокойно. В далёких лесах находится непокорное государство Славия, которое не смирилось с властью империи демонов. Именно туда направляется главный герой, чтобы набраться сил и жестоко отомстить врагам и предателям. В третьей книге герою приходится занять место самого воеводы Ильи и отправиться в поход, возглавленный князем Владимиром. Меж тем появляется способ вернуть себе силу Света, но для этого необходимо уничтожить опасного противника. Враги, которых предстоит наказать, ждут впереди, и их немало. Подробности – в аудиокниге.",
            "Паутина миров. Славия",
            3.0,
            listOf("Фантастика, фэнтези","Попаданцы"),
            "33_20231213_202312"

        )


    )*/
 override fun getAll():List<BookInfo>{
        val allBooks = bookRepository.findAll()
        return allBooks
    }
    override fun save(bookInfo: BookInfo):BookInfo{
        bookRepository.save(bookInfo)
        return bookInfo
    }

    override fun getLastNRecords(n: Int): List<BookInfo> {
        val pageable = PageRequest.of(0, n, Sort.by(Sort.Direction.DESC, "createdAt"))
        val lastNRecords = bookRepository.findLastNRecords(pageable)
        return lastNRecords
    }

    override fun getRecordsInRange(startIndex: Int, endIndex: Int): List<BookInfo> {
        val pageSize = endIndex - startIndex + 1
        val pageNumber = startIndex / pageSize
        val pageable = PageRequest.of(pageNumber, pageSize, Sort.by(Sort.Direction.DESC, "createdAt"))
        val recordsInRange = bookRepository.findRecordsInRange(pageable)
        return recordsInRange
    }

    override fun getAllByGenre(genre: String, startIndex: Int, endIndex: Int): List<BookInfo> {
        val recordsByGenre = bookRepository.findAllByGenre(genre, Sort.by(Sort.Direction.DESC, "createdAt"))
        val totalRecords = recordsByGenre.size

        return if (startIndex < totalRecords) {
            recordsByGenre.subList(startIndex, minOf(endIndex + 1, totalRecords))
        } else {
            emptyList()
        }
    }
    override fun getAllByAutor(autor: String): List<BookInfo> {
        return bookRepository.findAllByAutor(autor)
    }


    override fun getBooksByAuthorAndCycle(autor: String, cycle: String): List<BookInfo> {
        return bookRepository.findByAutorAndCycle(autor, cycle)
    }

    override fun getBooksByNameContaining(name: String): List<BookInfo> {
        val pageable = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createdAt"))
        return bookRepository.findByNameContainingIgnoreCase(name, pageable)
    }

    override fun incrementViewCount(bookId: String): BookInfo? {
        val book = bookRepository.findById(bookId).orElse(null)
        if (book != null) {
            book.viewUser += 1
            bookRepository.save(book)
        }
        return book
    }

    override fun incrementRaitingPlus(bookId: String): BookInfo? {
        val book = bookRepository.findById(bookId).orElse(null)
        if (book != null) {
            book.raitingPlus += 1
            bookRepository.save(book)
        }
        return book
    }

    override fun incrementRaitingMinus(bookId: String): BookInfo? {
        val book = bookRepository.findById(bookId).orElse(null)
        if (book != null) {
            book.raitingMinus += 1
            bookRepository.save(book)
        }
        return book
    }

}