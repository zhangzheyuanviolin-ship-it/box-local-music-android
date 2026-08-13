            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class iOl0oOOO1 {
                public static final OoOi1Ol I00000oIO(OoOi1Ol ooOi1Ol, OoOOiO ooOOiO) {
/* 1 */             if (ooOOiO == null || ooOi1Ol.I00000oIO() == Ooo0Ioii0o0.I00iiO) {
/* 551 */               return ooOi1Ol;
                    }
/* 20 */            if (ooOOiO.I000l1() != ooOi1Ol.I00000oIO()) {
/* 68 */                IO0OOo iO0OOo = new IO0OOo();
/* 71 */                iO0OOo.I00iOIl = ooOi1Ol;
/* 73 */                ooOi1Ol.I00000oIO();
/* 76 */                VarHandle.storeStoreFence();
/* 81 */                OoOI1i1i.I00iiI.getClass();
/* 90 */                return new OlIo1I(new IO0O1IiIooO(ooOi1Ol, iO0OOo, false, OoOI1i1i.I00iiO));
                    }
/* 26 */            if (!ooOi1Ol.I0000Il00O()) {
/* 58 */                return new OlIo1I(ooOi1Ol.I00000oOI());
                    }
/* 32 */            O1I00II1 o1i00ii1 = O1I0OloI.I0000oI00;
/* 37 */            I01iiIii10O i01iiIii10O = new I01iiIii10O(6);
/* 40 */            i01iiIii10O.I00iiI = ooOi1Ol;
/* 42 */            VarHandle.storeStoreFence();
/* 48 */            return new OlIo1I(new O0oI1IiI(o1i00ii1, i01iiIii10O));
                }

                public static OoOiiO01illo I00000oOI(OoOiiO01illo ooOiiO01illo) {
/* 4 */             if (!(ooOiiO01illo instanceof Iol0l0Oo0i)) {
/* 76 */                IO0OiIIOi iO0OiIIOi = new IO0OiIIOi(0);
/* 79 */                iO0OiIIOi.I0000Il00O = ooOiiO01illo;
/* 81 */                VarHandle.storeStoreFence();
/* 186 */               return iO0OiIIOi;
                    }
/* 6 */             Iol0l0Oo0i iol0l0Oo0i = (Iol0l0Oo0i) ooOiiO01illo;
/* 8 */             OoOOiO[] ooOOiOArr = iol0l0Oo0i.I00000oOI;
/* 12 */            ArrayList arrayListI00Io1lO = I1IoiO1l.I00Io1lO(iol0l0Oo0i.I0000Il00O, ooOOiOArr);
/* 24 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00Io1lO, 10));
/* 27 */            Iterator it = arrayListI00Io1lO.iterator();
/* 35 */            while (it.hasNext()) {
/* 41 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 55 */                arrayList.add(I00000oIO((OoOi1Ol) oIoi0IIoi.I00iOIl, (OoOOiO) oIoi0IIoi.I00iiI));
                    }
/* 70 */            return new Iol0l0Oo0i(ooOOiOArr, (OoOi1Ol[]) arrayList.toArray(new OoOi1Ol[0]), true);
                }
            }
