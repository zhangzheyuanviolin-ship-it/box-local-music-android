            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class OI1Ooo {
                public lolIo0 I00000oIO;
                public OlO0OIIl1 I00000oOI;
                public OlO0OIIl1 I0000Il00O;
                public boolean I0000O;
                public OOli1O I0000oI00;
                public OOli1O I0001Ioi1lo;
                public OII1Il1IlOO I000II;
                public OI1o1o1iO1l I000O01llI0;

                public final void I00000oIO(OI1OloOIO1O oI1OloOIO1O) {
                    synchronized (this.I00000oIO) {
/* 4 */                 OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 17 */                olO0OIIl1.I000lI(null, IOOi0Ool1i.I00OI1((Collection) olO0OIIl1.getValue(), oI1OloOIO1O));
                    }
                }

                public final void I00000oOI(OI1OloOIO1O oI1OloOIO1O) {
                    OI1i0o1Ilo oI1i0o1Ilo;
                    Oool0l1iOIOl oool0l1iOIOl;
/* 3 */             OI1i0llli oI1i0llli = this.I000O01llI0.I00000oOI;
/* 5 */             OlO0OIIl1 olO0OIIl1 = oI1i0llli.I000O01llI0;
/* 7 */             String str = oI1OloOIO1O.I00ilO0;
/* 9 */             LinkedHashMap linkedHashMap = oI1i0llli.I001i1O0Ol;
/* 17 */            boolean zI0000O = O0000Ioio00.I0000O(linkedHashMap.get(oI1OloOIO1O), Boolean.TRUE);
/* 21 */            OlO0OIIl1 olO0OIIl12 = this.I0000Il00O;
/* 34 */            olO0OIIl12.I000lI(null, Oio0lI.I00000oOI((Set) olO0OIIl12.getValue(), oI1OloOIO1O));
/* 37 */            linkedHashMap.remove(oI1OloOIO1O);
/* 40 */            I1Il0loi i1Il0loi = oI1i0llli.I0001Ioi1lo;
/* 46 */            if (i1Il0loi.contains(oI1OloOIO1O)) {
/* 137 */               if (this.I0000O) {
/* 168 */                   return;
                        }
/* 139 */               oI1i0llli.I0010I0i();
/* 142 */               OlO0OIIl1 olO0OIIl13 = oI1i0llli.I000II;
/* 146 */               ArrayList arrayList = new ArrayList(i1Il0loi);
/* 149 */               olO0OIIl13.getClass();
/* 152 */               olO0OIIl13.I000lI(null, arrayList);
/* 155 */               ArrayList arrayListI000oI1ioi = oI1i0llli.I000oI1ioi();
/* 159 */               olO0OIIl1.getClass();
/* 162 */               olO0OIIl1.I000lI(null, arrayListI000oI1ioi);
/* 168 */               return;
                    }
/* 48 */            oI1i0llli.I00100o1O0lo(oI1OloOIO1O);
/* 63 */            if (oI1OloOIO1O.I00ioIO.I000OiO.I00l0I0l0lO1.I00000oIO(O0oOi0I.I00iiO)) {
/* 67 */                oI1OloOIO1O.I00000oIO(O0oOi0I.I00iOIl);
                    }
/* 74 */            if (!i1Il0loi.isEmpty()) {
/* 77 */                Iterator it = i1Il0loi.iterator();
/* 85 */                while (it.hasNext()) {
/* 99 */                    if (O0000Ioio00.I0000O(((OI1OloOIO1O) it.next()).I00ilO0, str)) {
                                break;
                            }
                        }
/* 102 */               if (!zI0000O) {
/* 118 */                   oool0l1iOIOl.I00000oIO();
                        }
                    } else if (!zI0000O && (oI1i0o1Ilo = oI1i0llli.I000oI1ioi) != null && (oool0l1iOIOl = (Oool0l1iOIOl) oI1i0o1Ilo.I00000oOI.remove(str)) != null) {
/* 118 */               oool0l1iOIOl.I00000oIO();
                    }
/* 121 */           oI1i0llli.I0010I0i();
/* 124 */           ArrayList arrayListI000oI1ioi2 = oI1i0llli.I000oI1ioi();
/* 128 */           olO0OIIl1.getClass();
/* 131 */           olO0OIIl1.I000lI(null, arrayListI000oI1ioi2);
                }

                public final void I0000Il00O(OI1OloOIO1O oI1OloOIO1O, boolean z) {
/* 3 */             OI1i0llli oI1i0llli = this.I000O01llI0.I00000oOI;
/* 8 */             O1l110o o1l110o = new O1l110o(7);
/* 11 */            o1l110o.I00iiI = this;
/* 13 */            o1l110o.I00iiO = oI1OloOIO1O;
/* 15 */            VarHandle.storeStoreFence();
/* 24 */            OII1Il1IlOO oII1Il1IlOOI00000oOI = oI1i0llli.I0010o.I00000oOI(oI1OloOIO1O.I00iiI.I00iOIl);
/* 34 */            oI1i0llli.I001i1O0Ol.put(oI1OloOIO1O, Boolean.valueOf(z));
/* 43 */            if (!oII1Il1IlOOI00000oOI.equals(this.I000II)) {
/* 134 */               ((OI1Ooo) oI1i0llli.I00111O.get(oII1Il1IlOOI00000oOI)).I0000Il00O(oI1OloOIO1O, z);
/* 332 */               return;
                    }
/* 45 */            O11O0010 o11o0010 = oI1i0llli.I001IO000;
/* 47 */            if (o11o0010 != null) {
/* 49 */                o11o0010.invoke(oI1OloOIO1O);
/* 52 */                o1l110o.invoke();
/* 55 */                return;
                    }
/* 56 */            I1Il0loi i1Il0loi = oI1i0llli.I0001Ioi1lo;
/* 58 */            int iIndexOf = i1Il0loi.indexOf(oI1OloOIO1O);
/* 62 */            if (iIndexOf < 0) {
/* 85 */                Log.i("NavController", "Ignoring pop of " + oI1OloOIO1O + " as it was not found on the current back stack");
/* 88 */                return;
                    }
/* 90 */            int i = iIndexOf + 1;
/* 93 */            if (i != i1Il0loi.I00iiO) {
/* 108 */               oI1i0llli.I000l1(((OI1OloOIO1O) i1Il0loi.get(i)).I00iiI.I00iiI.I00000oOI, true, false);
                    }
/* 111 */           OI1i0llli.I000o00OoI0I(oI1i0llli, oI1OloOIO1O);
/* 114 */           o1l110o.invoke();
/* 119 */           oI1i0llli.I00000oOI.invoke();
/* 122 */           oI1i0llli.I00000oOI();
                }

                public final void I0000O(OI1OloOIO1O oI1OloOIO1O, boolean z) {
                    Object objPrevious;
/* 1 */             OOli1O oOli1O = this.I0000oI00;
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 9 */             Iterable iterable = (Iterable) olO0OIIl1.getValue();
/* 13 */            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
/* 25 */                Iterator it = iterable.iterator();
                        while (true) {
/* 33 */                    if (!it.hasNext()) {
                                break;
                            }
/* 41 */                    if (((OI1OloOIO1O) it.next()) == oI1OloOIO1O) {
/* 49 */                        Iterable iterable2 = (Iterable) oOli1O.I00iOIl.getValue();
/* 53 */                        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
/* 84 */                            return;
                                }
/* 65 */                        Iterator it2 = iterable2.iterator();
/* 73 */                        while (it2.hasNext()) {
/* 81 */                            if (((OI1OloOIO1O) it2.next()) == oI1OloOIO1O) {
                                    }
                                }
/* 84 */                        return;
                            }
                        }
                    }
/* 96 */            olO0OIIl1.I000lI(null, Oio0lI.I0001Ioi1lo((Set) olO0OIIl1.getValue(), oI1OloOIO1O));
/* 99 */            OlO0OIIl1 olO0OIIl12 = oOli1O.I00iOIl;
/* 101 */           OlO0OIIl1 olO0OIIl13 = oOli1O.I00iOIl;
/* 107 */           List list = (List) olO0OIIl12.getValue();
/* 113 */           ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
/* 121 */               if (!listIterator.hasPrevious()) {
/* 159 */                   objPrevious = null;
                            break;
                        }
/* 123 */               objPrevious = listIterator.previous();
/* 128 */               OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) objPrevious;
/* 134 */               if (!O0000Ioio00.I0000O(oI1OloOIO1O2, oI1OloOIO1O) && ((List) olO0OIIl13.getValue()).lastIndexOf(oI1OloOIO1O2) < ((List) olO0OIIl13.getValue()).lastIndexOf(oI1OloOIO1O)) {
                            break;
                        }
                    }
/* 160 */           OI1OloOIO1O oI1OloOIO1O3 = (OI1OloOIO1O) objPrevious;
/* 162 */           if (oI1OloOIO1O3 != null) {
/* 174 */               olO0OIIl1.I000lI(null, Oio0lI.I0001Ioi1lo((Set) olO0OIIl1.getValue(), oI1OloOIO1O3));
                    }
/* 177 */           I0000Il00O(oI1OloOIO1O, z);
                }

                public final void I0000oI00(OI1OloOIO1O oI1OloOIO1O) {
/* 3 */             OI1i0llli oI1i0llli = this.I000O01llI0.I00000oOI;
/* 11 */            OII1Il1IlOO oII1Il1IlOOI00000oOI = oI1i0llli.I0010o.I00000oOI(oI1OloOIO1O.I00iiI.I00iOIl);
/* 21 */            if (!oII1Il1IlOOI00000oOI.equals(this.I000II)) {
/* 63 */                Object obj = oI1i0llli.I00111O.get(oII1Il1IlOOI00000oOI);
/* 67 */                if (obj != null) {
/* 71 */                    ((OI1Ooo) obj).I0000oI00(oI1OloOIO1O);
/* 74 */                    return;
                        } else {
/* 92 */                    IOOlIIilOl0.I0000oI00(IIl001iO0Io.I00100l0(new StringBuilder("NavigatorBackStack for "), oI1OloOIO1O.I00iiI.I00iOIl, " should already be created"));
/* 168 */                   return;
                        }
                    }
/* 23 */            Function1 function1 = oI1i0llli.I001IIilI0O;
/* 25 */            if (function1 != null) {
/* 27 */                function1.invoke(oI1OloOIO1O);
/* 30 */                I00000oIO(oI1OloOIO1O);
                    } else {
/* 57 */                Log.i("NavController", "Ignoring add of destination " + oI1OloOIO1O.I00iiI + " outside of the call to navigate(). ");
                    }
                }
            }
