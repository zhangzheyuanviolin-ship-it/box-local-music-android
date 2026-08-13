            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            
            public abstract class ilioiI0ll {
                public static Illlll00 I00000oIO(IlllOi0O illlOi0O, boolean z) {
/* 3 */             List list = illlOi0O.I00li1OI;
/* 11 */            Illlll00 illlll00 = new Illlll00(illlOi0O, null, 1, z);
/* 14 */            O0ioOi0Oo1ii o0ioOi0Oo1iiI00iiI = illlOi0O.I00iiI();
/* 23 */            ArrayList arrayList = new ArrayList();
/* 34 */            for (Object obj : list) {
/* 49 */                if (((OoOOiO) obj).I000l1() != Ooo0Ioii0o0.I00iio) {
                            break;
                        }
/* 51 */                arrayList.add(obj);
                    }
/* 55 */            I1IollOi01 i1IollOi01I00ilI0I1 = IOOi0Ool1i.I00ilI0I1(arrayList);
/* 67 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(i1IollOi01I00ilI0I1, 10));
/* 70 */            Iterator it = i1IollOi01I00ilI0I1.iterator();
                    while (true) {
/* 76 */                Iio0IIOo iio0IIOo = (Iio0IIOo) it;
/* 84 */                if (!iio0IIOo.I00iiI.hasNext()) {
/* 173 */                   Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = ((OoOOiO) IOOi0Ool1i.I00Io1o110i(list)).I00Ol10();
/* 177 */                   O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00ilI0I1;
/* 179 */                   IiOiOloo0 iiOiOloo0 = IiOiioI.I0000oI00;
/* 182 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 187 */                   illlll00.I010lI0oi(null, o0ioOi0Oo1iiI00iiI, il01100l, il01100l, arrayList2, ol0O0iI0l0OI00Ol10, o1oIIloii0, iiOiOloo0);
/* 190 */                   Illlll00 illlll002 = illlll00;
/* 191 */                   illlll002.I00ol1 = true;
/* 551 */                   return illlll002;
                        }
/* 90 */                Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 92 */                int i = iol0oIiIOI.I00000oIO;
/* 96 */                OoOOiO ooOOiO = (OoOOiO) iol0oIiIOI.I00000oOI;
/* 102 */               String strI00000oOI = ooOOiO.getName().I00000oOI();
/* 117 */               Illlll00 illlll003 = illlll00;
/* 161 */               arrayList2.add(new Ooo00oi0O(illlll003, null, i, i1i0olI.I00iiO, OI1Iio0ii1.I0000oI00(strI00000oOI.equals("T") ? "instance" : strI00000oOI.equals("E") ? "receiver" : strI00000oOI.toLowerCase(Locale.ROOT)), ooOOiO.I00Ol10(), false, false, false, null, OlI1o0ooI.I00IO1));
/* 164 */               illlll00 = illlll003;
                    }
                }
            }
