            package p000;

            import java.io.ByteArrayInputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            
            public abstract class l0Oiiill1 {
                public static void I00000oIO(Metadata metadata) throws O001110li {
/* 1 */             String[] strArrD1 = metadata.d1();
/* 7 */             if (strArrD1.length == 0) {
/* 9 */                 strArrD1 = null;
                    }
/* 10 */            if (strArrD1 == null) {
/* 966 */               throw new IoOoiol010lI("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
                    }
/* 12 */            String[] strArrD2 = metadata.d2();
/* 16 */            Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 24 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(II0lIIl1l.I00000oIO(strArrD1));
/* 27 */            O0I1iO11I0l o0I1iO11I0lI0001Ioi1lo = O0IO00o0OI0.I0001Ioi1lo(byteArrayInputStream, strArrD2);
/* 35 */            I01Ilioliio i01IlioliioI00000oOI = OOOloii1IoO0.I00ll1.I00000oOI(byteArrayInputStream, O0IO00o0OI0.I00000oIO);
/* 43 */            if (!i01IlioliioI00000oOI.I00000oOI()) {
/* 304 */               O001110li o001110li = new O001110li(new IOiIIo1l().getMessage());
/* 307 */               o001110li.I00iOIl = i01IlioliioI00000oOI;
/* 309 */               throw o001110li;
                    }
/* 45 */            OOOloii1IoO0 oOOloii1IoO0 = (OOOloii1IoO0) i01IlioliioI00000oOI;
/* 72 */            boolean z = new O0I1i1OIIiIo(metadata.mv()).compareTo(new O0I1i1OIIiIo(1, 4, 0)) < 0;
/* 75 */            O0i0I0 o0i0I0 = new O0i0I0();
/* 83 */            o0i0I0.I00000oIO = new ArrayList();
/* 90 */            o0i0I0.I00000oOI = new ArrayList();
/* 97 */            o0i0I0.I0000Il00O = new ArrayList(0);
/* 101 */           O1li00Io.I00000oIO.getClass();
/* 104 */           List listI00000oIO = O1lOolo.I00000oIO();
/* 118 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 121 */           Iterator it = listI00000oIO.iterator();
/* 129 */           while (it.hasNext()) {
/* 139 */               ((O0I1Oo1oIO) ((O1li00Io) it.next())).getClass();
/* 144 */               O0I1io o0I1io = new O0I1io();
/* 152 */               o0I1io.I00000oIO = new ArrayList(0);
/* 154 */               VarHandle.storeStoreFence();
/* 157 */               arrayList.add(o0I1io);
                    }
/* 161 */           o0i0I0.I0000O = arrayList;
/* 163 */           VarHandle.storeStoreFence();
/* 172 */           Oi0Oooi oi0Oooi = new Oi0Oooi(oOOloii1IoO0.I00io1l);
/* 175 */           OooO111lO1OI oooO111lO1OI = OooO111lO1OI.I00000oOI;
/* 187 */           O111ol0lilll o111ol0lilll = new O111ol0lilll(o0I1iO11I0lI0001Ioi1lo, oi0Oooi, li1i10.I00000oIO(oOOloii1IoO0.I00ioIO), z, Il01100l.I00iOIl, 16);
/* 196 */           lIil0O.I000OiO(o0i0I0, oOOloii1IoO0.I00iio, oOOloii1IoO0.I00ilI0I1, oOOloii1IoO0.I00ilO0, o111ol0lilll);
/* 205 */           Iterator it2 = ((List) o111ol0lilll.I00ioIO).iterator();
/* 213 */           while (it2.hasNext()) {
/* 223 */               ((O0I1Oo1oIO) ((O1li00Io) it2.next())).getClass();
/* 234 */               O0I1io o0I1io2 = (O0I1io) ilO01lO.I00000oIO(o0i0I0.I0000O, O0I1io.I00000oOI);
/* 244 */               Iterator it3 = ((List) oOOloii1IoO0.I000iOII(O0IIoOIiII0O.I000l1)).iterator();
/* 252 */               while (it3.hasNext()) {
/* 266 */                   o0I1io2.I00000oIO.add(lIil0O.I0001Ioi1lo((OOOo0i11Ol) it3.next(), o111ol0lilll));
                        }
/* 276 */               Integer num = (Integer) lIOIiol1IoI.I00000oIO(oOOloii1IoO0, O0IIoOIiII0O.I000iOII);
/* 278 */               if (num != null) {
/* 288 */                   ((OI1IlOlol) o111ol0lilll.I00iiI).getString(num.intValue());
                        }
                    }
                }
            }
