import org.junit.Assert.*
import org.junit.Test


class Test {
    @Test
    fun testCreateNameReturnsNonEmptyString(){
        val result =createName()
        ("Fonksiyon boş olmayan bir string Döndürmeli",result.isNotEmpty)

    }
}