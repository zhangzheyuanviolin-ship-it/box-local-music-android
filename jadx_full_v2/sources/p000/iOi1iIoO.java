            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class iOi1iIoO {
                /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:2:0x0000, B:9:0x001b, B:11:0x0036, B:12:0x0039, B:13:0x0049), top: B:36:0x0000 }] */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:2:0x0000, B:9:0x001b, B:11:0x0036, B:12:0x0039, B:13:0x0049), top: B:36:0x0000 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IIIOiol I00000oIO(Ill0IO ill0IO, OI0010oo1o oI0010oo1o, InputStream inputStream) throws IOException {
                    OOOloll11 oOOloll11;
                    I01Ilioliio i01IlioliioI00000oOI;
                    try {
/* 1 */                 IIIOOI0O10I iiiooi0o10i = IIIOOI0O10I.I0001Ioi1lo;
/* 3 */                 IIIOOI0O10I iiiooi0o10iI00000oIO = iOi1OOi.I00000oIO(inputStream);
/* 7 */                 IIIOOI0O10I iiiooi0o10i2 = IIIOOI0O10I.I0001Ioi1lo;
/* 9 */                 int i = iiiooi0o10iI00000oIO.I0000Il00O;
/* 11 */                int i2 = iiiooi0o10i2.I0000Il00O;
/* 13 */                int i3 = iiiooi0o10iI00000oIO.I00000oOI;
/* 15 */                int i4 = iiiooi0o10i2.I00000oOI;
/* 17 */                if (i3 == 0) {
/* 19 */                    if (i4 == 0 && i == i2) {
/* 30 */                        Il1lll0iI il1lll0iI = new Il1lll0iI();
/* 38 */                        il1lll0iI.I00000oIO = new HashMap();
/* 40 */                        IIIOl00li0io.I00000oIO(il1lll0iI);
/* 45 */                        i01IlioliioI00000oOI = OOOloll11.I00li1OI.I00000oOI(inputStream, il1lll0iI);
/* 53 */                        if (i01IlioliioI00000oOI.I00000oOI()) {
/* 69 */                            O001110li o001110li = new O001110li(new IOiIIo1l().getMessage());
/* 72 */                            o001110li.I00iOIl = i01IlioliioI00000oOI;
/* 74 */                            throw o001110li;
                                }
/* 55 */                        oOOloll11 = (OOOloll11) i01IlioliioI00000oOI;
                            }
/* 78 */                    oOOloll11 = null;
                        } else if (i3 != i4 || i > i2) {
/* 78 */                    oOOloll11 = null;
                        } else {
/* 30 */                    Il1lll0iI il1lll0iI2 = new Il1lll0iI();
/* 38 */                    il1lll0iI2.I00000oIO = new HashMap();
/* 40 */                    IIIOl00li0io.I00000oIO(il1lll0iI2);
/* 45 */                    i01IlioliioI00000oOI = OOOloll11.I00li1OI.I00000oOI(inputStream, il1lll0iI2);
/* 53 */                    if (i01IlioliioI00000oOI.I00000oOI()) {
                            }
                        }
/* 79 */                inputStream.close();
/* 82 */                if (oOOloll11 == null) {
/* 229 */                   throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + iiiooi0o10i2 + ", actual " + iiiooi0o10iI00000oIO + ". Please update Kotlin");
                        }
/* 86 */                IIIOiol iIIOiol = new IIIOiol(oI0010oo1o, ill0IO);
/* 89 */                iIIOiol.I00io1l = iiiooi0o10iI00000oIO;
/* 93 */                OOOoiIli oOOoiIli = oOOloll11.I00iio;
/* 95 */                OOOoOl1 oOOoOl1 = oOOloll11.I00ilI0I1;
/* 97 */                OI1Ili10l0i oI1Ili10l0i = new OI1Ili10l0i();
/* 100 */               oI1Ili10l0i.I00000oIO = oOOoiIli;
/* 102 */               oI1Ili10l0i.I00000oOI = oOOoOl1;
/* 104 */               VarHandle.storeStoreFence();
/* 107 */               iIIOiol.I00ioIO = oI1Ili10l0i;
/* 115 */               OoOi1I011O ooOi1I011O = new OoOi1I011O(11);
/* 118 */               VarHandle.storeStoreFence();
/* 123 */               OillOo0 oillOo0 = new OillOo0(12);
/* 126 */               oillOo0.I00iiI = oI1Ili10l0i;
/* 128 */               oillOo0.I00iiO = iiiooi0o10iI00000oIO;
/* 130 */               oillOo0.I00iio = ooOi1I011O;
/* 132 */               List list = oOOloll11.I00io1l;
/* 142 */               int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(list, 10));
/* 148 */               if (iI00000oIO < 16) {
/* 150 */                   iI00000oIO = 16;
                        }
/* 153 */               LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 164 */               for (Object obj : list) {
/* 183 */                   linkedHashMap.put(l1iI1lOO.I00000oIO((OI1Ili10l0i) oillOo0.I00iiI, ((OOOi0i1IOo) obj).I00ilI0I1), obj);
                        }
/* 187 */               oillOo0.I00ilI0I1 = linkedHashMap;
/* 189 */               VarHandle.storeStoreFence();
/* 192 */               iIIOiol.I00l0I0l0lO1 = oillOo0;
/* 194 */               iIIOiol.I00l0OO0IO = oOOloll11;
/* 196 */               return iIIOiol;
                    } catch (Throwable th) {
                        try {
/* 230 */                   throw th;
                        } catch (Throwable th2) {
/* 232 */                   ii1OOii.I00000oIO(inputStream, th);
/* 2160 */                  throw th2;
                        }
                    }
                }
            }
