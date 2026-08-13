            package p000;

            import java.io.ByteArrayInputStream;
            import kotlin.Metadata;
            
            public final class O0i1oIiI0Oi extends l0ll1l {
                public final O0OoII0ii1li I00000oIO;

                public O0i1oIiI0Oi(Metadata metadata) throws O001110li {
/* 1 */             String[] strArrD1 = metadata.d1();
/* 7 */             strArrD1 = strArrD1.length == 0 ? null : strArrD1;
/* 10 */            if (strArrD1 == null) {
/* 186 */               throw new IoOoiol010lI("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
                    }
/* 12 */            String[] strArrD2 = metadata.d2();
/* 16 */            Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 24 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(II0lIIl1l.I00000oIO(strArrD1));
/* 27 */            O0I1iO11I0l o0I1iO11I0lI0001Ioi1lo = O0IO00o0OI0.I0001Ioi1lo(byteArrayInputStream, strArrD2);
/* 35 */            I01Ilioliio i01IlioliioI00000oOI = OOOi0i1IOo.I010I0.I00000oOI(byteArrayInputStream, O0IO00o0OI0.I00000oIO);
/* 43 */            if (!i01IlioliioI00000oOI.I00000oOI()) {
/* 105 */               O001110li o001110li = new O001110li(new IOiIIo1l().getMessage());
/* 108 */               o001110li.I00iOIl = i01IlioliioI00000oOI;
/* 110 */               throw o001110li;
                    }
/* 72 */            O0OoII0ii1li o0OoII0ii1liI0000Il00O = lIil0O.I0000Il00O((OOOi0i1IOo) i01IlioliioI00000oOI, o0I1iO11I0lI0001Ioi1lo, new O0I1i1OIIiIo(metadata.mv()).compareTo(new O0I1i1OIIiIo(1, 4, 0)) < 0, 4);
/* 82 */            new O0I1i1OIIiIo(metadata.mv());
/* 85 */            metadata.xi();
/* 91 */            this.I00000oIO = o0OoII0ii1liI0000Il00O;
                }
            }
