import uniffi.rondpoint.*

val dico = Dictionnaire(Enumeration.DEUX, true)
val copyDico = copieDictionnaire(dico)
assert(dico == copyDico)

assert(copieEnumeration(Enumeration.DEUX) == Enumeration.DEUX)
assert(copieEnumerations(listOf(Enumeration.UN, Enumeration.DEUX)) == listOf(Enumeration.UN, Enumeration.DEUX))

assert(switcheroo(false))
