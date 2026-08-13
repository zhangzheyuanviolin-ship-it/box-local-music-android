            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            
            public final class Oiool011li implements O1IioilO {
                public O1IioilO I00iOIl;
                public Ii0110 I00iiI;
                public OIooliIO0 I00iiO;
                public I10oIiiliil I00iio;
                public O0iOOo0Ii I00ilI0I1;
                public O0iOOo0Ii I00ilO0;
                public OIooi1iOiOol I00io1l;
                public OI0oiiIO0 I00ioIO;
                public Ol1o1llOII I00l0I0l0lO1;
                public int I00l0OO0IO;

                /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OiooioIilliO I0000O(Object obj, IloI0lOlll1 iloI0lOlll1) {
                    Object obj2;
/* 4 */             iloI0lOlll1.I00i01iIIliI(800730162);
/* 10 */            iloI0lOlll1.I00i01iIIliI(-148945892);
/* 13 */            boolean zI000II = iloI0lOlll1.I000II(obj);
/* 17 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 21 */            OiooOloi0lO oiooOloi0lO = OiooOloi0lO.I00000oIO;
/* 23 */            if (!zI000II) {
                        obj2 = objI00O0i0ii;
/* 27 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 31 */                    OiooioIilliO oiooioIilliO = new OiooioIilliO();
/* 34 */                    oiooioIilliO.I00000oIO = obj;
/* 40 */                    oiooioIilliO.I00000oOI = lOO00IiI0li.I00000oIO(oiooOloi0lO);
/* 47 */                    oiooioIilliO.I0000Il00O = lOO00IiI0li.I00000oIO(null);
/* 49 */                    VarHandle.storeStoreFence();
/* 52 */                    iloI0lOlll1.I00iio(oiooioIilliO);
                            obj2 = oiooioIilliO;
                        }
                    }
/* 55 */            OiooioIilliO oiooioIilliO2 = (OiooioIilliO) obj2;
/* 59 */            oiooioIilliO2.I00000oOI.setValue(oiooOloi0lO);
/* 63 */            iloI0lOlll1.I0010I0i(false);
/* 66 */            iloI0lOlll1.I0010I0i(false);
/* 106 */           return oiooioIilliO2;
                }

                public static O1ooiI111i I0000oI00(Oiool011li oiool011li, OiooioIilliO oiooioIilliO, I10oo1iO0lIl i10oo1iO0lIl) {
/* 3 */             Oiooio.I00000oIO.getClass();
/* 22 */            return iilOllOlO1.I00000oIO(O1ooIo101ll.I00000oIO, new I10il0oO(oiooioIilliO, i10oo1iO0lIl.I00000oIO(), oiool011li, Ol000ioo.I00000oOI, 1));
                }

                public final boolean I00000oIO() {
/* 9 */             return ((Boolean) this.I00iiO.getValue()).booleanValue();
                }

                @Override
                public final O0iOOo0Ii I00000oOI(O0iOOo0Ii o0iOOo0Ii) {
/* 3 */             return this.I00iOIl.I00000oOI(o0iOOo0Ii);
                }

                @Override
                public final long I0000Il00O(O0iOOo0Ii o0iOOo0Ii, O0iOOo0Ii o0iOOo0Ii2) {
/* 3 */             return this.I00iOIl.I0000Il00O(o0iOOo0Ii, o0iOOo0Ii2);
                }

                public final void I0001Ioi1lo() {
                    boolean z;
/* 11 */            Collection<OiolI10I1oOO> collectionI0000O = this.I00l0I0l0lO1.I0000Il00O().I0000Il00O.I0000O();
                    loop0: while (true) {
/* 26 */                for (OiolI10I1oOO oiolI10I1oOO : collectionI0000O) {
/* 34 */                    oiolI10I1oOO.I0001Ioi1lo();
/* 37 */                    z = z || (oiolI10I1oOO.I00000oIO() && (oiolI10I1oOO.I0000O() || oiolI10I1oOO.I0000oI00()));
                        }
                    }
/* 63 */            if (z != I00000oIO()) {
/* 71 */                this.I00iiO.setValue(Boolean.valueOf(z));
/* 74 */                if (z) {
/* 245 */                   return;
                        }
/* 84 */                for (OiolI10I1oOO oiolI10I1oOO2 : collectionI0000O) {
/* 100 */                   if (oiolI10I1oOO2.I0000Il00O().size() > 1) {
/* 102 */                       List listI0000Il00O = oiolI10I1oOO2.I0000Il00O();
/* 106 */                       int i = OiolO0I0l00i.I00000oIO;
/* 111 */                       int size = listI0000Il00O.size();
/* 116 */                       for (int i2 = 0; i2 < size; i2++) {
/* 132 */                           if (((OiolIO0Il) listI0000Il00O.get(i2)).I0000Il00O().I00000oOI()) {
                                        break;
                                    }
                                }
                            }
/* 138 */                   Ol001oOi1 ol001oOi1 = oiolI10I1oOO2.I0000Il00O;
/* 140 */                   ol001oOi1.getClass();
/* 145 */                   ol001oOi1.I0000oI00 = OlO01oiI.I00iOIl;
/* 153 */                   ol001oOi1.I0000Il00O = ol001oOi1.I0000O.I000II();
/* 159 */                   ol001oOi1.I00000oOI.setValue(OIIl0lOlI.I00000oIO);
                        }
                    }
                }
            }
