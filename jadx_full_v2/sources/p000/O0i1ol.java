            package p000;

            import java.io.ByteArrayInputStream;
            import java.util.List;
            import kotlin.Metadata;
            
            public final class O0i1ol extends l0ll1l {
                public O0i1ol(Metadata metadata) throws O001110li {
/* 1 */             String[] strArrD1 = metadata.d1();
/* 6 */             strArrD1 = strArrD1.length == 0 ? null : strArrD1;
/* 9 */             if (strArrD1 != null) {
/* 11 */                String[] strArrD2 = metadata.d2();
/* 15 */                Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 23 */                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(II0lIIl1l.I00000oIO(strArrD1));
/* 26 */                O0I1iO11I0l o0I1iO11I0lI0001Ioi1lo = O0IO00o0OI0.I0001Ioi1lo(byteArrayInputStream, strArrD2);
/* 34 */                I01Ilioliio i01IlioliioI00000oOI = OOOll1o0.I00oliIiO01i.I00000oOI(byteArrayInputStream, O0IO00o0OI0.I00000oIO);
/* 42 */                if (!i01IlioliioI00000oOI.I00000oOI()) {
/* 104 */                   O001110li o001110li = new O001110li(new IOiIIo1l().getMessage());
/* 107 */                   o001110li.I00iOIl = i01IlioliioI00000oOI;
/* 109 */                   throw o001110li;
                        }
/* 44 */                OOOll1o0 oOOll1o0 = (OOOll1o0) i01IlioliioI00000oOI;
/* 89 */                lIil0O.I0000oI00(oOOll1o0, new O111ol0lilll(o0I1iO11I0lI0001Ioi1lo, new Oi0Oooi(oOOll1o0.I00o101lO), OooO111lO1OI.I00000oOI, new O0I1i1OIIiIo(metadata.mv()).compareTo(new O0I1i1OIIiIo(1, 4, 0)) < 0, (List) null, 48));
                    }
/* 116 */           new O0I1i1OIIiIo(metadata.mv());
/* 119 */           metadata.xi();
                }
            }
