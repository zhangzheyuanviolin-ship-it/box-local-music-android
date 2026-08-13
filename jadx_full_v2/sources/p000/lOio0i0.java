            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.zip.Inflater;
            import java.util.zip.InflaterInputStream;
            
            public final class lOio0i0 {
                public static final lOio0i0 I0000Il00O = new lOio0i0(lOOlii1.I00000oOI, lOIoiOOi0O.I001lIiIIo1O());
                public final lOOlii1 I00000oIO;
                public final lOIoiOOi0O I00000oOI;

                public lOio0i0(lOOlii1 loolii1, lOIoiOOi0O loioiooi0o) {
/* 4 */             loolii1.getClass();
/* 7 */             this.I00000oIO = loolii1;
/* 9 */             this.I00000oOI = loioiooi0o;
                }

                public static lOio0i0 I00000oIO(IOOOIO1O ioooio1o, boolean z) throws iI00lI {
                    lOOlii1 loolii1I00000oIO;
/* 1 */             int iI00Ol1ll1 = ioooio1o.I00Ol1ll1();
/* 6 */             if (iI00Ol1ll1 > 1) {
/* 187 */               iilo0lOo110.I000II(IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(iI00Ol1ll1).length() + 44), "Unsupported version: ", iI00Ol1ll1, ". Current version is: 1"));
/* 190 */               return null;
                    }
/* 8 */             ioooio1o.I00Ol1ll1();
/* 15 */            int iI001l0I00 = ioooio1o.I001l0I00(ioooio1o.I00Ol00());
/* 19 */            i1o0l0i i1o0l0iVar = i1o0l0i.I00000oIO;
/* 21 */            int i = i1ioiooIiOol.I00000oIO;
/* 25 */            lOIoiOOi0O loioiooi0oI001l0I00 = lOIoiOOi0O.I001l0I00(ioooio1o, i1o0l0i.I00000oOI);
/* 29 */            ioooio1o.I001lIiIIo1O(iI001l0I00);
/* 34 */            OOll1l0ll oOll1l0ll = new OOll1l0ll();
/* 39 */            Inflater inflater = new Inflater(true);
/* 42 */            oOll1l0ll.I00iiI = inflater;
/* 44 */            VarHandle.storeStoreFence();
                    try {
/* 49 */                if (z) {
/* 55 */                    int iI001l0I002 = ioooio1o.I001l0I00(ioooio1o.I00Ol00());
/* 59 */                    int iI001lllioOl = ioooio1o.I001lllioOl();
                            try {
/* 85 */                        loolii1I00000oIO = lOOlii1.I00000oIO(IOOOIO1O.I00IO1oi11O(new InflaterInputStream(new II101Ool(oOll1l0ll, ioooio1o), inflater, iI001lllioOl < 0 ? 4096 : Math.min(iI001lllioOl, Barcode.FORMAT_AZTEC)), Barcode.FORMAT_AZTEC));
/* 89 */                        inflater.reset();
/* 96 */                        if (ioooio1o.I001lllioOl() != 0) {
/* 111 */                           throw new iI00lI("Unexpected bytes remaining after FlagsBlob parsing.");
                                }
/* 98 */                        ioooio1o.I001lIiIIo1O(iI001l0I002);
                            } finally {
                            }
                        } else {
/* 121 */                   inflater.setInput(ioooio1o.I00Oio());
                            try {
/* 134 */                       loolii1I00000oIO = lOOlii1.I00000oIO(IOOOIO1O.I00IO1oi11O(new II101Ool(oOll1l0ll, 3), Barcode.FORMAT_AZTEC));
                            } finally {
                            }
                        }
/* 141 */               oOll1l0ll.close();
/* 146 */               return new lOio0i0(loolii1I00000oIO, loioiooi0oI001l0I00);
                    } finally {
                        try {
/* 155 */                   oOll1l0ll.close();
                        } catch (Throwable th) {
/* 160 */                   th.addSuppressed(th);
                        }
                    }
                }
            }
