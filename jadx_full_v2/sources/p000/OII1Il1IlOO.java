            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            
/* 27 */    public abstract class OII1Il1IlOO {
                public OI1Ooo I00000oIO;
                public boolean I00000oOI;

                public abstract OI1ilOI1ioo0 I00000oIO();

                public final OI1Ooo I00000oOI() {
/* 1 */             OI1Ooo oI1Ooo = this.I00000oIO;
/* 3 */             if (oI1Ooo != null) {
/* 5 */                 return oI1Ooo;
                    }
/* 8 */             I000II.I001IO000("You cannot access the Navigator's state until the Navigator is attached");
/* 11 */            return null;
                }

                public void I0000O(List list, OI1oooI oI1oooI) {
/* 3 */             I1Iolliil0i i1Iolliil0iI001IO000 = IOOi0Ool1i.I001IO000(list);
/* 11 */            O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(27);
/* 14 */            o0l0IlolloIO.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 36 */            Iterator it = new IlIo0o(new OoI10o0iO11O(i1Iolliil0iI001IO000, o0l0IlolloIO), false, new OiioI1Io0o(4)).iterator();
                    while (true) {
/* 41 */                IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 47 */                if (!ilIloII10O.hasNext()) {
/* 106 */                   return;
                        }
/* 59 */                I00000oOI().I0000oI00((OI1OloOIO1O) ilIloII10O.next());
                    }
                }

                public void I0000oI00(OI1OloOIO1O oI1OloOIO1O, boolean z) {
/* 13 */            List list = (List) I00000oOI().I0000oI00.I00iOIl.getValue();
/* 19 */            if (!list.contains(oI1OloOIO1O)) {
/* 63 */                IoOOl0iOl1io.I001IO000("popBackStack was called with ", oI1OloOIO1O, " which does not exist in back stack ", list);
/* 106 */               return;
                    }
/* 25 */            ListIterator listIterator = list.listIterator(list.size());
/* 29 */            OI1OloOIO1O oI1OloOIO1O2 = null;
/* 34 */            while (I0001Ioi1lo()) {
/* 41 */                oI1OloOIO1O2 = (OI1OloOIO1O) listIterator.previous();
/* 47 */                if (O0000Ioio00.I0000O(oI1OloOIO1O2, oI1OloOIO1O)) {
                            break;
                        }
                    }
/* 49 */            if (oI1OloOIO1O2 != null) {
/* 55 */                I00000oOI().I0000Il00O(oI1OloOIO1O2, z);
                    }
                }

                public boolean I0001Ioi1lo() {
/* 1 */             return true;
                }

/* 28 */        public OI1ilOI1ioo0 I0000Il00O(OI1ilOI1ioo0 oI1ilOI1ioo0) {
/* 29 */            return oI1ilOI1ioo0;
                }
            }
