            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class l0oo01 {
                public static final void I00000oIO(O0liilOIOii o0liilOIOii, Object obj, int i, Object obj2, IloI0lOlll1 iloI0lOlll1, int i2) {
/* 4 */             iloI0lOlll1.I00i0O(1439843069);
/* 52 */            int i3 = i2 | (iloI0lOlll1.I000II(o0liilOIOii) ? 4 : 2) | (iloI0lOlll1.I000II(obj) ? 32 : 16) | (iloI0lOlll1.I0000oI00(i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000II(obj2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E);
/* 68 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 1171) != 1170)) {
/* 77 */                I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(15);
/* 80 */                i0O0llIiIlOO.I00iiO = o0liilOIOii;
/* 82 */                i0O0llIiIlOO.I00iiI = i;
/* 84 */                i0O0llIiIlOO.I00iio = obj2;
/* 86 */                VarHandle.storeStoreFence();
/* 98 */                ((OiIii0) obj).I00000oOI(obj2, iiioOl1O.I00000oOI(980966366, i0O0llIiIlOO, iloI0lOlll1), iloI0lOlll1, 48);
                    } else {
/* 102 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 105 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 109 */           if (oOloioIlI001IO000 != null) {
/* 115 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(13);
/* 118 */               i0IliiililIo.I00iiO = o0liilOIOii;
/* 120 */               i0IliiililIo.I00iio = obj;
/* 122 */               i0IliiililIo.I00iiI = i;
/* 124 */               i0IliiililIo.I00ilI0I1 = obj2;
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }
            }
