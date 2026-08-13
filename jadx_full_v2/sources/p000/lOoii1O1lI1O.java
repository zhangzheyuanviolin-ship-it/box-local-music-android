            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class lOoii1O1lI1O {
                public static final IOO000ilo I00000oIO(Ol0O0iI0l0O ol0O0iI0l0O, IOIii00 iOIii00, int i) {
/* 2 */             if (iOIii00 == null || Il0ooiloI.I0000oI00(iOIii00)) {
/* 1 */                 return null;
                    }
/* 19 */            int size = iOIii00.I00io1l().size() + i;
/* 26 */            if (iOIii00.I000iOII()) {
/* 68 */                List listSubList = ol0O0iI0l0O.I00OIl().subList(i, size);
/* 74 */                Ii1Ool1 ii1Ool1I000lI = iOIii00.I000lI();
/* 89 */                return new IOO000ilo(iOIii00, listSubList, I00000oIO(ol0O0iI0l0O, ii1Ool1I000lI instanceof IOIii00 ? (IOIii00) ii1Ool1I000lI : null, size), 23);
                    }
/* 36 */            if (size != ol0O0iI0l0O.I00OIl().size()) {
/* 38 */                IiOiIO0i1Oil.I000lI(iOIii00);
                    }
/* 60 */            return new IOO000ilo(iOIii00, ol0O0iI0l0O.I00OIl().subList(i, ol0O0iI0l0O.I00OIl().size()), null, 23);
                }

                public static final List I00000oOI(IOIii00 iOIii00) {
                    List listI000II;
                    Object next;
                    OoOIOoO1I ooOIOoO1II000OOo1O;
/* 1 */             List listI00io1l = iOIii00.I00io1l();
/* 9 */             if (!iOIii00.I000iOII() && !(iOIii00.I000lI() instanceof IIiIoIl11IO)) {
/* 19 */                return listI00io1l;
                    }
/* 20 */            int i = IiOiOOIo.I00000oIO;
/* 22 */            IiOi0I1 iiOi0I1 = IiOi0I1.I00iio;
/* 29 */            OilO0iOl oilO0iOlI0000oI00 = OilO1oiooiII.I0000oI00(OilO1oiooiII.I000OiO(iOIii00, iiOi0I1), 1);
/* 33 */            OoOi1I011O ooOi1I011O = OoOi1I011O.I00iiI;
/* 38 */            IlIl0l ilIl0l = new IlIl0l(2);
/* 41 */            ilIl0l.I00000oOI = oilO0iOlI0000oI00;
/* 43 */            ilIl0l.I0000Il00O = ooOi1I011O;
/* 45 */            VarHandle.storeStoreFence();
/* 63 */            List listI000lI = OilO1oiooiII.I000lI(new IlOIIioI1(OilO1oiooiII.I0001Ioi1lo(ilIl0l, OoOi1I011O.I00iiO), OoOi1I011O.I00iio, OilOOl1Oo00.I00ioIO));
/* 75 */            Iterator it = OilO1oiooiII.I0000oI00(OilO1oiooiII.I000OiO(iOIii00, iiOi0I1), 1).iterator();
                    while (true) {
/* 83 */                listI000II = null;
/* 84 */                if (!it.hasNext()) {
/* 95 */                    next = null;
                            break;
                        }
/* 86 */                next = it.next();
/* 92 */                if (next instanceof OI000ilOol) {
                            break;
                        }
                    }
/* 96 */            OI000ilOol oI000ilOol = (OI000ilOol) next;
/* 98 */            if (oI000ilOol != null && (ooOIOoO1II000OOo1O = oI000ilOol.I000OOo1O()) != null) {
/* 106 */               listI000II = ooOIOoO1II000OOo1O.I000II();
                    }
/* 110 */           if (listI000II == null) {
/* 112 */               listI000II = Il01100l.I00iOIl;
                    }
/* 118 */           if (listI000lI.isEmpty() && listI000II.isEmpty()) {
/* 126 */               return iOIii00.I00io1l();
                    }
/* 135 */           ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(listI000lI, listI000II);
/* 147 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00O10llo, 10));
/* 150 */           Iterator it2 = arrayListI00O10llo.iterator();
/* 158 */           while (it2.hasNext()) {
/* 164 */               OoOOiO ooOOiO = (OoOOiO) it2.next();
/* 166 */               int size = listI00io1l.size();
/* 172 */               IO0Oli1i iO0Oli1i = new IO0Oli1i();
/* 175 */               iO0Oli1i.I00iOIl = ooOOiO;
/* 177 */               iO0Oli1i.I00iiI = iOIii00;
/* 179 */               iO0Oli1i.I00iiO = size;
/* 181 */               VarHandle.storeStoreFence();
/* 184 */               arrayList.add(iO0Oli1i);
                    }
/* 190 */           return IOOi0Ool1i.I00O10llo(listI00io1l, arrayList);
                }
            }
