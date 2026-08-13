            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.jvm.functions.Function3;
            
            public final class IOiioo0iOO implements Illil0Iio {
                @Override
                public final Object I00100o1O0lo(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, IloI0lOlll1 iloI0lOlll1, Integer num) {
                    int i;
/* 2 */             String str = (String) obj;
/* 4 */             boolean zBooleanValue = bool.booleanValue();
/* 9 */             IOoi1llO0Oo iOoi1llO0Oo = (IOoi1llO0Oo) obj2;
/* 11 */            Function3 function3 = (Function3) obj3;
/* 13 */            IllOOo00lI illOOo00lI = (IllOOo00lI) obj4;
/* 15 */            int iIntValue = num.intValue();
/* 19 */            int i2 = iIntValue & 6;
/* 22 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 24 */            if (i2 == 0) {
/* 35 */                i = (iloI0lOlll1.I000II(o1ooIo101ll) ? 4 : 2) | iIntValue;
                    } else {
/* 37 */                i = iIntValue;
                    }
/* 40 */            if ((iIntValue & 48) == 0) {
/* 53 */                i |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 56 */            if ((iIntValue & 384) == 0) {
/* 69 */                i |= iloI0lOlll1.I000O01llI0(zBooleanValue) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 72 */            if ((iIntValue & 3072) == 0) {
/* 85 */                i |= iloI0lOlll1.I000II(iOoi1llO0Oo) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 88 */            if ((iIntValue & 24576) == 0) {
/* 101 */               i |= iloI0lOlll1.I000OOo1O(function3) ? 16384 : 8192;
                    }
/* 105 */           if ((iIntValue & 196608) == 0) {
/* 118 */               i |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 131072 : 65536;
                    }
/* 137 */           if (iloI0lOlll1.I00OIl(i & 1, (599187 & i) != 599186)) {
/* 157 */               IOoiO0l.I0000Il00O(str, zBooleanValue, iOoi1llO0Oo, o1ooIo101ll, function3, illOOo00lI, iloI0lOlll1, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
                    } else {
/* 161 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 164 */           return OoiIlOl1iI.I00000oIO;
                }
            }
